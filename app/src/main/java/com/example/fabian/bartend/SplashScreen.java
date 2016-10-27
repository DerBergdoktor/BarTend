package com.example.fabian.bartend;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.renderscript.Type;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private Button shakeBut;
    public Typeface font;
    ImageView icon;
    Animation an;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        shakeBut = (Button) findViewById(R.id.shakeBut);
        shake();

        TextView txt = (TextView) findViewById(R.id.header);
        font = Typeface.createFromAsset(getAssets(), "Lobster.otf");
        txt.setTypeface(font);

        icon = (ImageView) findViewById(R.id.baricon);
        an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shakeanim);
        icon.startAnimation(an);
        shakeBut.setBackgroundResource(R.drawable.shakeit);

        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);

    }

    public void shake() {
        shakeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent toy = new Intent(SplashScreen.this, DrinkChooser.class);
                startActivity(toy);
                finish();
            }
        });
    }
}
