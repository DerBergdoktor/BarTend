package com.example.fabian.bartend;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class TippPage extends AppCompatActivity {

    ActionBar actionBar;
    ArrayList<String> ings = new ArrayList<String>();

    EditText textField;
    Button addButton;
    Button submitButton;
    String tempString;
    int count;
    DrinkHandler drinkHandler;
    ArrayList<Drink> tempDrinks = new ArrayList<Drink>();
    static Drink[] matchedDrinks;
    TextView textView;
    boolean repeat = false;
    Drink closeSugg;
    String missingIng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipp_page);

        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        addButton = (Button) findViewById(R.id.addButton);
        submitButton = (Button) findViewById(R.id.submitButton);
        textField = (EditText) findViewById(R.id.ingTextField);

        textView = (TextView) findViewById(R.id.textList);

        add();
        submit();

        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        addButton.setBackgroundResource(R.drawable.plusbuttonsmall);
        submitButton.setBackgroundResource(R.drawable.subbuttonsmall);
    }

    public void add() {
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempString = textField.getText().toString();
                for(String comp : ings){
                    if(comp.equalsIgnoreCase(tempString)){
                        repeat = true;
                    }
                }
                if(repeat == false){
                    ings.add(count,tempString);
                    textField.setText("");
                    setTextList();
                    count++;
                }
                repeat = false;
            }
        });
    }

    public void setTextList(){
        StringBuilder builder = new StringBuilder();
        for (String details: ings){
            builder.append(details + "\n");
        }
        textView.setText(builder.toString());
    }

    public void submit() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drinkHandler = new DrinkHandler();
                drinkHandler.fillDrinkData();
                Drink[] drinks = drinkHandler.getDrink_data();
                int check = 0;
                int listCount = 0;
                int tempDrinkCount = 0;
                int matchListCount = 0;

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
                        tempDrinks.add(tempDrinkCount, drinks[count]);
                        tempDrinkCount++;
                        System.out.println("Treffer: " + drinks[count].getName());
                    }
                    else if(check == drinks[count].getIngridients().size()-1){
                        closeSugg = drinks[count];
                    }

                    check = 0;
                }

                if (tempDrinks.size() != 0) {
                    matchedDrinks = new Drink[tempDrinkCount];
                    for (Drink addedDrink : tempDrinks) {
                        System.out.println("Drinkliste: " + addedDrink.getName());
                        matchedDrinks[matchListCount] = addedDrink;
                        matchListCount++;
                    }

                    Intent toy = new Intent(TippPage.this, TippViewer.class);
                    ings.clear();
                    startActivity(toy);
                    finish();
                }

                else if(tempDrinks.size() == 0 && closeSugg != null){

                    for (String compare : ings) {
                        for (String compare2 : closeSugg.getIngridients()) {
                            if (!compare.equalsIgnoreCase(compare2)) {
                                missingIng = compare2;
                            }
                        }
                        listCount++;
                    }
                    textView.setText("Du kannst fast einen " + closeSugg.getName() + " zubereiten \n" + "Es fehlt nur noch: " + missingIng);
                }

                else {
                    textView.setText("Mit diesen Zutaten kannst du keinen Cocktail zubereiten");
                }

                /*
                for (int k = 0; k < matchedDrinks.length; k++){
                    System.out.println("Matcheddrinks: " + matchedDrinks[k].getName());
                }
                */

            }
        });
    }

}
