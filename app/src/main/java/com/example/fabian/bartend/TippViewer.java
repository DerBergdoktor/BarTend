package com.example.fabian.bartend;

import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TippViewer extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    Button drinkButton;
    static DrinkHandler drinkHandlerTipp;
    Drink[] drinks = TippPage.matchedDrinks;
    int source = 1;

    Typeface font;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_chooser);



        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        drinkButton = (Button) findViewById(R.id.drinkButton);



        drinkHandlerTipp = new DrinkHandler();
        drinkHandlerTipp.setDrink_data(drinks);

        viewPager = (ViewPager)findViewById(R.id.drinkViewer);
        adapter = new CustomSwipeAdapter(this, drinkHandlerTipp);
        viewPager.setAdapter(adapter);

        font = Typeface.createFromAsset(getAssets(), "Lobster.otf");
        adapter.setFont(font);


        drinkButton.setBackgroundResource(R.drawable.makeit);
        makeDrink();

        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        TippPage.matchedDrinks = null;
    }


    public void makeDrink() {
        drinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent toy = new Intent(TippViewer.this, DrinkPage.class);

                toy.putExtra("drinkID",viewPager.getCurrentItem());
                toy.putExtra("source", source);

                startActivity(toy);
            }
        });
    }
}
