package com.example.fabian.bartend;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
    protected ListView listView;
    protected boolean repeat = false;
    protected boolean hit = false;
    protected ArrayList<Drink> closeSugg = new ArrayList<Drink>();
    protected static ArrayList<String> missingIng = new ArrayList<String>();
    protected ArrayList<String> allIngreds;
    protected Drink[] drinks;
    AlertDialog dialog;

    ArrayAdapter<String> listadapter;

    public String stringBuilder(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            String listitem = list.get(i);
            builder.append("- " + listitem.substring(0, 1).toUpperCase() + listitem.substring(1) + "\n");
        }
        return builder.toString();
    }

    public void dialogBuilder() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Keine passenden Cocktails gefunden.\nDrinks mit folgenden Zutaten anzeigen?\n\n" + stringBuilder(ings))
                .setTitle("Keine Treffer");
        builder.setPositiveButton("Ja", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent toy = new Intent(TippPage.this, TippViewer.class);
                ings.clear();
                startActivity(toy);
                finish();
            }
        });
        builder.setNegativeButton("Nein", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        dialog = builder.create();
        dialog.show();
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
        String[] allings = allIngreds.toArray(new String[allIngreds.size()]);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, allings);
        textField.setAdapter(adapter);
        textField.setThreshold(1);

        listView = (ListView) findViewById(R.id.listView);
        listadapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, android.R.id.text1, allings);
        listView.setAdapter(listadapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if(ings.contains(allIngreds.get(position))) {
                        ings.remove(allIngreds.get(position));
                    }
                    else {
                        ings.add(allIngreds.get(position));
                    }
                }
            });

        add();
        submit();

        submitButton.setBackgroundResource(R.drawable.subbuttonsmall);
    }

    public void add() {
            textField.setOnEditorActionListener(new AutoCompleteTextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                    if (textField.getText().toString().trim().length() != 0) {
                        int result = actionId & EditorInfo.IME_MASK_ACTION;
                        switch(result) {
                            case EditorInfo.IME_ACTION_DONE:
                            case EditorInfo.IME_ACTION_NEXT:
                                String fieldTxt = textField.getText().toString();
                                tempString = fieldTxt.substring(0, 1).toUpperCase() + fieldTxt.substring(1);
                                for(String comp : ings) {
                                    if(comp.equalsIgnoreCase(tempString)){
                                        repeat = true;
                                    }
                                }
                                for(String allings : allIngreds) {
                                    if(allings.equalsIgnoreCase(tempString)) {
                                        hit = true;
                                    }
                                }
                                if(repeat == false && hit == true){
                                    ings.add(tempString);
                                    listView.setItemChecked(allIngreds.indexOf(tempString),true);
                                    listadapter.notifyDataSetChanged();
                                    textField.setText("");
                                    count++;
                                }
                                repeat = false;
                                hit = false;
                        }
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
                        Intent toy = new Intent(TippPage.this, TippViewer.class);
                        ings.clear();
                        startActivity(toy);
                        finish();
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
                        dialogBuilder();
                    }
                }
                }

        });
    }

}
