package com.example.fabian.bartend;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoChooser extends AppCompatActivity {

    ActionBar actionBar;
    ImageView sweet;
    ImageView sour;
    ImageView bitters;
    ImageView spirits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_chooser);

        sweet = (ImageView) findViewById(R.id.image_sweet);
        sour = (ImageView) findViewById(R.id.image_sour);
        bitters = (ImageView) findViewById(R.id.image_bitter);
        spirits = (ImageView) findViewById(R.id.image_spirit);


        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        sweet();
        sour();
        bitters();
        spirits();
    }


    public void sweet() {
        sweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(InfoChooser.this, InfoBoxSweet.class);
                toy.putExtra("context",0);
                startActivity(toy);
            }
        });
    }

    public void sour() {
        sour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(InfoChooser.this, InfoBoxSour.class);
                startActivity(toy);
            }
        });
    }

    public void bitters() {
        bitters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(InfoChooser.this, InfoBoxBitters.class);
                startActivity(toy);
            }
        });
    }

    public void spirits() {
        spirits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(InfoChooser.this, InfoBoxSpirits.class);
                startActivity(toy);
            }
        });
    }

}
