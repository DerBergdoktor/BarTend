package com.example.fabian.bartend;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DrinkPage extends AppCompatActivity implements SensorEventListener {

    int drinkID;
    ViewPager viewPager;
    CustomDrinkAdapter adapter;

    private Sensor mySensor;
    private SensorManager SM;
    double sensorValue;
    ActionBar actionBar;
    int source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_page);



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            drinkID = extras.getInt("drinkID");
            source = extras.getInt("source");
            //The key argument here must match that used in the other activity
        }

        viewPager = (ViewPager)findViewById(R.id.drinkInstructions);
        adapter = new CustomDrinkAdapter(this, drinkID,source);
        viewPager.setAdapter(adapter);

        SM = (SensorManager) getSystemService(SENSOR_SERVICE);
        mySensor = SM.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();
    }


    @Override
    public void onSensorChanged(SensorEvent event) {

        sensorValue = event.values[0];


        if (sensorValue < 1){
            viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
        }

    }

    public void closeScreen(){
        SM.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


}
