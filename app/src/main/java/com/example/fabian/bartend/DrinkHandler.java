package com.example.fabian.bartend;

/**
 * Created by Fabian on 19.10.2016.
 */
public class DrinkHandler {

    public Drink [] drink_data = new Drink[3];
    public int[] drink_images = new int[3];

    public void fillDrinkData (){

        // Create Drink objects, set all the values, paste them into drink_data

        //Create Martini
        Drink martini = new Drink();

        martini.setEffort("simpel");

        martini.setName("Klassischer Martini");

        martini.setSteps(9);


        martini.addIng("6cl Gin");
        martini.addIng("3cl trockener Wermut");
        martini.addIng("Ein Schnitz Zitronenschale");
        martini.addIng("Ein Spritzer Orangenbitter (Angostura orange bitter)");
        martini.addIng("Große Eiswürfel");

        martini.addStep("1",R.drawable.martini01);
        martini.addStep("2",R.drawable.martini01);
        martini.addStep("Gin, Wermut und Bitter in ein großes Glas (Mixglas) geben",R.drawable.martini01);
        martini.addStep("Das Glas mit Eis füllen",R.drawable.martini02);
        martini.addStep("Kräftig umrühren bis der Drink gut gekühlt ist",R.drawable.martini03);
        martini.addStep("Drink durch ein Sieb in ein Cocktailglas füllen",R.drawable.martini04);
        martini.addStep("Zitronenschale eindrehen",R.drawable.martini05);
        martini.addStep("Zitronenschale in den Drink geben",R.drawable.martini06);
        martini.addStep("",R.drawable.fertig);

        martini.setID(0);

        martini.setFlavourText("Das einzig wahre Bond Girl");

        martini.setDefaultImg(7);

        drink_data[0] = martini;


        //Create Old Fashioned
        Drink oldF = new Drink();

        oldF.setEffort("mittel");

        oldF.setName("The Old Fashioned");

        oldF.setSteps(10);


        oldF.addIng("6cl Whiskey");
        oldF.addIng("1 Teelöffel Zucker");
        oldF.addIng("2-3 Spritzer aromatic bitters");
        oldF.addIng("1 Teelöffel Wasser");
        oldF.addIng("Große Eiswürfel");
        oldF.addIng("Eine Orangenscheibe (Garnierung)");


        oldF.addStep("1",R.drawable.oldf01);
        oldF.addStep("2",R.drawable.oldf01);
        oldF.addStep("Zucker, Bitter und Wasser in ein mittelgroßes Glas (Whiskeyglas) geben",R.drawable.oldf01);
        oldF.addStep("Umrühren bis der Zucker sich gelöst hat",R.drawable.oldf02);
        oldF.addStep("Whiskey hinzugeben",R.drawable.oldf03);
        oldF.addStep("Erneut kräftig umrühren",R.drawable.oldf04);
        oldF.addStep("Ein paar große Eiswürfel dazugeben",R.drawable.oldf05);
        oldF.addStep("Umrühren bis der Drink gut gekühlt ist",R.drawable.oldf06);
        oldF.addStep("Nach Bedarf mit einer Scheibe Orange garnieren",R.drawable.oldf07);
        oldF.addStep("",R.drawable.fertig);

        oldF.setID(1);

        oldF.setFlavourText("old but gold");

        oldF.setDefaultImg(8);

        drink_data[1] = oldF;

        //Create Manhatten
        Drink manH = new Drink();

        manH.setEffort("simpel");

        manH.setName("Manhattan");

        manH.setSteps(9);


        manH.addIng("6cl Rye Whiskey");
        manH.addIng("3cl süßer Wermut (Martini)");
        manH.addIng("2 Spritzer aromatic bitters");
        manH.addIng("Große Eiswürfel");
        manH.addIng("Cocktailkirschen (Garnierung)");

        manH.addStep("1",R.drawable.manh1);
        manH.addStep("2",R.drawable.manh1);
        manH.addStep("Whiskey, Wermut und bitters in ein großes Glas (Mixglas) geben",R.drawable.manh1);
        manH.addStep("Glas mit Eis füllen",R.drawable.manh2);
        manH.addStep("Umrühren bis das Glas von außen sehr kalt ist",R.drawable.manh3);
        manH.addStep("Eine Cocktailkirsche in einem Cocktailglas platzieren",R.drawable.manh4);
        manH.addStep("Durch ein Sieb den Drink in das Cocktailglas füllen",R.drawable.manh5);
        manH.addStep("Sofort mit einem großen Eiswürfel servieren", R.drawable.manh6);
        manH.addStep("",R.drawable.fertig);

        manH.setID(2);

        manH.setFlavourText("Welcome to the Big City");

        manH.setDefaultImg(7);

        drink_data[2] = manH;

    }

    public Drink[] getDrink_data(){
        return drink_data;
    }

    public int[] getDrink_images(){
        for (int i =0; i < drink_data.length; i ++){
            drink_images [i] = drink_data[i].defaultImg;
        }
        return drink_images;
    }
}
