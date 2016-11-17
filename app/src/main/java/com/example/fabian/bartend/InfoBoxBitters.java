package com.example.fabian.bartend;

import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoBoxBitters extends AppCompatActivity {

    TextView header;
    TextView infoText1;
    TextView infoText2;
    TextView infoText3;
    ImageView infoPic1;
    ImageView infoPic2;
    ActionBar actionBar;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_box);

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

        infoPic1.setImageResource(R.drawable.bitter_spirits);
        infoPic2.setImageResource(R.drawable.bitters_cocktail);

        infoText1.setText("Bitters sind eine der traditionellsten Cocktail Zutaten und sind besonders für klassische Cocktails unverzichtbar\n" +
                "\n" +
                "Bei Bitters unterscheidet man grundlegend zwischen zwei Kategorien: Bitterliköre und Cocktailbitter.\n");
        infoText2.setText("\nBitterliköre sind, wie der Name bereits ahnen lässt, Liköre mit einem vornehmlich bitteren Geschmack. Durch die Zugabe von Zucker und Zitrusextrakten gesellt sich zu dem typisch herben Geschmack oft auch Süße und Säure.\n" +
                "Bitterliköre können pur als Aperitif oder Digestif getrunken werden.\n" +
                "Beispiele sind Campari oder Aperol.\n");
        infoText3.setText("Cocktailbitter oder im engl. aromatic bitters sind hochkonzentrierte Tinkturen mit einem intensiven bitter-herben Geschmack. Zumeist haben sie einen Alkoholgehalt von mindestens 38%. Der Alkoholbasis werden verschiedene Pflanzenstoffe hinzugefügt, die den Charakter des Bitters prägen. Die Bandbreite reicht dabei von Chinarinde und Wermuthkraut bis hin zu Enzian und Orangenschale.\n\n" +
                "Wenige Tropfen der Bitter reichen um dem Cocktail eine vollkommen neue geschmackliche Richtung zu verleihen. Aufgrund des hochkonzentrierten Geschmackes sollten die Bitter nicht pur genossen werden.\n");

        header.setText("Bitters\n");
        header.setTypeface(font);
    }
}
