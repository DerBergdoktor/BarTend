package com.example.fabian.bartend;

import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoBoxSour extends AppCompatActivity {

    TextView header;
    TextView infoText1;
    TextView infoText2;
    TextView infoText3;
    ImageView infoPic1;
    ImageView infoPic2;
    ImageView infoPic3;
    ImageView infoPic4;
    ActionBar actionBar;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_box_sour);

        font = Typeface.createFromAsset(getAssets(), "Lobster.otf");


        actionBar = getSupportActionBar();
        /*
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#a49cae"));
        actionBar.setBackgroundDrawable(colorDrawable);
        */
        actionBar.hide();


        header = (TextView) findViewById(R.id.header);
        infoText1 = (TextView) findViewById(R.id.infoText1);
        infoText2 = (TextView) findViewById(R.id.infoText2);
        infoText3 = (TextView) findViewById(R.id.infoText3);
        infoPic1 = (ImageView) findViewById(R.id.infoPic1);
        infoPic2 = (ImageView) findViewById(R.id.infoPic2);
        infoPic3 = (ImageView) findViewById(R.id.infoPic3);
        infoPic4 = (ImageView) findViewById(R.id.infoPic4);

        infoPic1.setImageResource(R.drawable.sours_glas);
        infoPic2.setImageResource(R.drawable.whiskey_sour_glas);
        infoPic3.setImageResource(R.drawable.lemon_juice);
        infoPic4.setImageResource(R.drawable.lime_juice);

        infoText1.setText("Sours sind eine Kategorie von Cocktails. Ein Sour setzt sich aus einer Spirituose, Zitronen- oder Limettensaft und einem Süßungsmittel (zumeist Zucker) zusammen. Klassische Vertreter dieser Kategorie sind der Whisky Sour, der Cosmopolitan oder der Margarita.\n" +
                "Sie werden zumeist gut geschüttelt und ohne Eis (“straight”) in einer Cocktailschale, bzw. einem “Sour Glas” serviert.");
        infoText2.setText("Die Ausnahme ist der Whisky Sour, der klassischerweise in einem Old Fashioned Glas mit Eis (“on the rocks”) serviert wird.");
        infoText3.setText("Wenn ein Rezept eine spezifische Säurekomponente vorschreibt, kann man wahlweise, obgleich es etwas unkonventionell ist, diese austauschen (bspw. Zitrone durch Limette ersetzen).");

        header.setText("Sours\n");
        header.setTypeface(font);
    }
}
