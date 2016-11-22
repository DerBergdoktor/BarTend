package com.example.fabian.bartend;

import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.fabian.bartend.DrinkChooser.drinkHandler;

public class InfoBoxSpirits extends AppCompatActivity {

    protected SpiritAdapter adapter;
    protected SpiritHandler spiritHandler;
    protected ViewPager viewPager;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_box_spirits);

        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        spiritHandler = new SpiritHandler();
        spiritHandler.fillSpirits();

        viewPager = (ViewPager)findViewById(R.id.spiritViewer);
        adapter = new SpiritAdapter(this, spiritHandler.getInfos(),spiritHandler.getGraphics(), spiritHandler.getHeader());
        viewPager.setAdapter(adapter);
    }
}
