package com.example.fabian.bartend;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinkChooser extends AppCompatActivity /*implements SensorEventListener */{

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    Button drinkButton, filterButton, tippButton;
    static DrinkHandler drinkHandler;

    /*
    private Sensor mySensor;
    private SensorManager SM;
    double sensorValue;
    private int shuffleInt;
    */
    Typeface font;

    ActionBar actionBar;

    int source = 0;

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
        filterButton = (Button) findViewById(R.id.filterButton);
        tippButton = (Button) findViewById(R.id.tippButton);

        drinkHandler = new DrinkHandler();
        drinkHandler.fillDrinkData();

        viewPager = (ViewPager)findViewById(R.id.drinkViewer);
        adapter = new CustomSwipeAdapter(this, drinkHandler);
        viewPager.setAdapter(adapter);
/*
        SM = (SensorManager) getSystemService(SENSOR_SERVICE);
        mySensor = SM.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);
*/

        font = Typeface.createFromAsset(getAssets(), "Lobster.otf");
        adapter.setFont(font);


        drinkButton.setBackgroundResource(R.drawable.makeit);
        filterButton.setBackgroundResource(R.drawable.filter_button_small);
        tippButton.setBackgroundResource(R.drawable.tippbuttonsmall);



        makeDrink();
        //shakeDrink();
        tipp();
    }

/*
    @Override
    public void onSensorChanged(SensorEvent event) {


        sensorValue = event.values[0]+event.values[1];


        if (sensorValue > 5 || event.values[1] > 5 || event.values[2] > 5){
            SM.unregisterListener(this);
            shuffleInt = new Random().nextInt(drinkHandler.getDrink_data().length);


            Intent shuffle = new Intent (DrinkChooser.this, DrinkPage.class);
            shuffle.putExtra("drinkID", shuffleInt);
            startActivity(shuffle);

        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
*/

    public void makeDrink() {

        drinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent toy = new Intent(DrinkChooser.this, DrinkPage.class);

                toy.putExtra("drinkID",viewPager.getCurrentItem());
                toy.putExtra("source", source);

                startActivity(toy);
            }
        });
    }
/*
    public void shakeDrink() {

        onClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent toy = new Intent(DrinkChooser.this, DrinkPage.class);

                toy.putExtra("drinkID",viewPager.getCurrentItem());
                toy.putExtra("source", source);

                startActivity(toy);
            }
        });
    }
*/

    public void tipp() {
        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tipp = new Intent(DrinkChooser.this, TippPage.class);
                startActivity(tipp);
            }
        });
    }
}
