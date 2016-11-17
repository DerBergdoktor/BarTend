package com.example.fabian.bartend;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoBoxSweet extends AppCompatActivity {

    TextView header;
    TextView infoText1;
    ImageView infoPic1;
    ActionBar actionBar;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_box_sweet);

        font = Typeface.createFromAsset(getAssets(), "Lobster.otf");

        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();

        header = (TextView) findViewById(R.id.header);
        infoText1 = (TextView) findViewById(R.id.infoText1);
        infoPic1 = (ImageView) findViewById(R.id.sirupButton);

        infoPic1.setImageResource(R.drawable.sirup_button);

        infoText1.setText("In beinahe jedem Cocktail wird ein Süßungsmittel verwendet um bittere und / oder saure Komponenten auszubalancieren. In den meisten klassischen Cocktails wird entweder Zucker oder einfacher Zuckersirup verwendet.\n" +
                "Wer einem Cocktail eine eigene Note verleihen möchte, kann den klassischen Zuckersirup allerdings auch mit verschiedenen alternativen Sirups ersetzen.\n\n");

        header.setText("Süße\n");
        header.setTypeface(font);

        click();
    }

    public void click() {
        infoPic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(InfoBoxSweet.this, DrinkPage.class);
                //Set Context for Sirup Recipe
                toy.putExtra("drinkID", 150);
                toy.putExtra("source", 2);
                startActivity(toy);
            }
        });
    }
}