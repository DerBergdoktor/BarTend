package com.example.fabian.bartend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TippPage extends AppCompatActivity {

    ActionBar actionBar;
    ArrayList<String> ings = new ArrayList<String>();

    protected AutoCompleteTextView textField;
    protected Button submitButton;
    protected String tempString;
    protected int count;
    protected DrinkHandler drinkHandler;
    protected ArrayList<Drink> tempDrinks = new ArrayList<Drink>();
    protected static Drink[] matchedDrinks;
    protected TextView textView;
    protected boolean repeat = false;
    protected ArrayList<Drink> closeSugg = new ArrayList<Drink>();
    protected static ArrayList<String> missingIng = new ArrayList<String>();
    protected ArrayList<String> allIngreds;
    protected Drink[] drinks;

    public String stringBuilder(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            builder.append((i+1) + ". " + list.get(i) + "\n");
        }
        return builder.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipp_page);
        drinkHandler = new DrinkHandler();
        drinkHandler.fillDrinkData();
        drinks = drinkHandler.getDrink_data();
        allIngreds = drinkHandler.getAllIngredients();
        actionBar = getSupportActionBar();
        actionBar.hide();

        submitButton = (Button) findViewById(R.id.submitButton);

        textField = (AutoCompleteTextView) findViewById(R.id.ingTextField);
        String[] ings = allIngreds.toArray(new String[allIngreds.size()]);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ings);
        textField.setAdapter(adapter);
        textField.setThreshold(1);
        textView = (TextView) findViewById(R.id.textList);

        add();
        submit();

        submitButton.setBackgroundResource(R.drawable.subbuttonsmall);
    }

    public void add() {
        textField.setOnEditorActionListener(new AutoCompleteTextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                int result = actionId & EditorInfo.IME_MASK_ACTION;
                switch(result) {
                    case EditorInfo.IME_ACTION_DONE:
                    case EditorInfo.IME_ACTION_NEXT:
                        tempString = textField.getText().toString();
                        for(String comp : ings){
                            if(comp.equalsIgnoreCase(tempString)){
                                repeat = true;
                            }
                        }
                        if(repeat == false){
                            ings.add(count,tempString);
                            textView.setText(stringBuilder(ings));
                            count++;
                        }
                        repeat = false;
                }
                return false;
            }
        });
    }

    public void submit() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int check = 0;
                int listCount = 0;
                int matchListCount = 0;

                if(!ings.isEmpty()) {
                    for (int count = 0; count < drinks.length; count++) {
                        for (String compare : ings) {
                            for (String compare2 : drinks[count].getIngridients()) {
                                if (compare.equalsIgnoreCase(compare2)) {
                                    check++;
                                    System.out.println("Zutat passt: "+ compare);
                                }
                            }
                            listCount++;
                        }
                        if (check == drinks[count].getIngridients().size()) {
                            tempDrinks.add(drinks[count]);
                            System.out.println("Treffer: " + drinks[count].getName());
                        }
                        else if(check < drinks[count].getIngridients().size() && check != 0) {
                            closeSugg.add(drinks[count]);
                        }
                        check = 0;
                    }

                        if (tempDrinks.size() != 0) {
                            matchedDrinks = new Drink[tempDrinks.size()];
                            for (Drink addedDrink : tempDrinks) {
                                System.out.println("Drinkliste: " + addedDrink.getName());
                                matchedDrinks[matchListCount] = addedDrink;
                                matchListCount++;
                            }
                        }
                        else if(tempDrinks.size() == 0 && closeSugg.size() != 0){
                            matchedDrinks = new Drink[closeSugg.size()];
                            int j = 0;
                            for (Drink closeDrinks : closeSugg) {
                                matchedDrinks[j] = closeDrinks;
                                j++;
                            }
                            for (int i = 0;i<ings.size();i++) {
                                for (String compare2 : closeSugg.get(i).getIngridients()) {
                                    if (!ings.get(i).equalsIgnoreCase(compare2)) {
                                        missingIng.add(compare2);
                                    }
                                }
                                listCount++;
                            }
                        }

                        Intent toy = new Intent(TippPage.this, TippViewer.class);
                        ings.clear();
                        startActivity(toy);
                        finish();

                    }
                }

        });
    }

}
