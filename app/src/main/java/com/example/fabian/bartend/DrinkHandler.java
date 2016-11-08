package com.example.fabian.bartend;

/**
 * Created by Fabian on 19.10.2016.
 */
public class DrinkHandler {

    public Drink [] drink_data;
    public int[] drink_images;

    public void fillDrinkData (){

        drink_data = new Drink[10];
        drink_images = new int[10];

        // Create Drink objects, set all the values, paste them into drink_data

        //Create Martini
        Drink martini = new Drink();

        martini.setEffort("simpel");

        martini.setName("Klassischer Martini");

        martini.setSteps(9);


        martini.addIng("Gin");
        martini.addIng("Wermut");
        martini.addIng("Orangenbitter");

        martini.addStep("1",R.drawable.martini01);
        martini.addStep("2",R.drawable.martini_ing);
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


        oldF.addIng("Whiskey");
        oldF.addIng("Zucker");
        oldF.addIng("aromatic bitters");


        oldF.addStep("1",R.drawable.oldf01);
        oldF.addStep("2",R.drawable.oldf_ing);
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


        manH.addIng("Whiskey");
        manH.addIng("Wermut");
        manH.addIng("aromatic bitters");

        manH.addStep("1",R.drawable.manh1);
        manH.addStep("2",R.drawable.manhattan_ing);
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

        //Create Daiquiri
        Drink daiq = new Drink();

        daiq.setEffort("simpel");

        daiq.setName("Daiquiri");

        daiq.setSteps(10);


        daiq.addIng("Rum");
        daiq.addIng("Limette");
        daiq.addIng("Zucker");

        daiq.addStep("1",R.drawable.daiquiri1);
        daiq.addStep("2",R.drawable.daiquiri_ing);
        daiq.addStep("Zucker und Limettensaft in einen Cocktailshaker geben",R.drawable.daiquiri1);
        daiq.addStep("Umrühren bis der Zucker sich gelöst hat",R.drawable.daiquiri2);
        daiq.addStep("Rum hinzugeben",R.drawable.daiquiri3);
        daiq.addStep("Shaker mit Eis füllen",R.drawable.daiquiri4);
        daiq.addStep("Gut schütteln (10s)",R.drawable.shake);
        daiq.addStep("Durch ein Sieb den Drink in ein Cocktailglas füllen", R.drawable.daiquiri6);
        daiq.addStep("Mit Limettenspalte garnieren", R.drawable.daiquiri7);
        daiq.addStep("",R.drawable.fertig);

        daiq.setID(3);

        daiq.setFlavourText("Sour Greetings from Havanna");

        daiq.setDefaultImg(8);

        drink_data[3] = daiq;

        //Create French 75
        Drink french = new Drink();

        french.setEffort("moderat");

        french.setName("French 75");

        french.setSteps(9);


        french.addIng("Gin");
        french.addIng("Limette");
        french.addIng("Zucker");
        french.addIng("Sekt");

        french.addStep("1",R.drawable.french1);
        french.addStep("2",R.drawable.french75_ing);
        french.addStep("Gin, Zucker und Zitronensaft in einen Cocktailshaker geben",R.drawable.french1);
        french.addStep("Shaker mit Eis füllen",R.drawable.french2);
        french.addStep("Gut Schütteln (15s)",R.drawable.shake);
        french.addStep("Den Drink durch ein Sieb in ein Sektglas füllen",R.drawable.french4);
        french.addStep("Mit Sekt auffüllen",R.drawable.french5);
        french.addStep("Mit Zitronenschale und Kirsche garnieren", R.drawable.french6);
        french.addStep("",R.drawable.fertig);

        french.setID(4);

        french.setFlavourText("Der spritzige Franzose");

        french.setDefaultImg(7);

        drink_data[4] = french;

        //Create Irish Coffee
        Drink irish = new Drink();

        irish.setEffort("simpel");

        irish.setName("Irish Coffee");

        irish.setSteps(7);


        irish.addIng("Kaffee");
        irish.addIng("Sirup");
        irish.addIng("Sahne");
        irish.addIng("Whiskey");

        irish.addStep("1",R.drawable.irish1);
        irish.addStep("2",R.drawable.irishcoffee_ing);
        irish.addStep("Sahne dick und schaumig (nicht steif) schlagen",R.drawable.irish1);
        irish.addStep("Kaffee, Whiskey und Sirup in eine Tasse geben",R.drawable.irish2);
        irish.addStep("Umrühren",R.drawable.irish3);
        irish.addStep("Vorsichtig eine Schicht Sahne (1-2 cm) auf den Kaffee geben",R.drawable.irish4);
        irish.addStep("",R.drawable.fertig);

        irish.setID(5);

        irish.setFlavourText("Smooth and Strong");

        irish.setDefaultImg(5);

        drink_data[5] = irish;

        //Create Bloody Mary
        Drink bloody = new Drink();

        bloody.setEffort("aufwendiger");

        bloody.setName("Bloody Mary");

        bloody.setSteps(12);


        bloody.addIng("Wodka");
        bloody.addIng("Tomatensaft");
        bloody.addIng("Pfeffer");
        bloody.addIng("Cayenne Pfeffer");
        bloody.addIng("Sojasauce");
        bloody.addIng("Worchester Sauce");
        bloody.addIng("Tabasco");
        bloody.addIng("Salz");
        bloody.addIng("Zitrone");

        bloody.addStep("1",R.drawable.bloody01);
        bloody.addStep("2",R.drawable.bloodymary_ing);
        bloody.addStep("Salz in einem flachen Teller verteilen",R.drawable.bloody01);
        bloody.addStep("Mit der Zitronenspalte am Rand eines großen Glases reiben",R.drawable.bloody02);
        bloody.addStep("Glas vorsichtig in das Salz drücken",R.drawable.bloody03);
        bloody.addStep("Das Glas mit Eis füllen",R.drawable.bloody04);
        bloody.addStep("Gewürze, Saucen, Tomatensaft und Wodka in einen Shaker geben",R.drawable.bloody05);
        bloody.addStep("Shaker mit Eis füllen",R.drawable.bloody06);
        bloody.addStep("Kräftig schütteln",R.drawable.shake);
        bloody.addStep("Durch ein Sieb den Drink in das Glas füllen",R.drawable.bloody08);
        bloody.addStep("Mit Sellerie garnieren",R.drawable.bloody09);
        bloody.addStep("",R.drawable.fertig);

        bloody.setID(6);

        bloody.setFlavourText("Frisch und rot...");

        bloody.setDefaultImg(10);

        drink_data[6] = bloody;

        //Create Negroni
        Drink negroni = new Drink();

        negroni.setEffort("simpel");

        negroni.setName("Negroni");

        negroni.setSteps(9);


        negroni.addIng("Gin");
        negroni.addIng("Campari");
        negroni.addIng("Wermut");

        negroni.addStep("1",R.drawable.negroni1);
        negroni.addStep("2",R.drawable.negroni_ing);
        negroni.addStep("Ein großes Glas (Mixglas) mit Eis füllen",R.drawable.negroni1);
        negroni.addStep("Gin, Campari und Wermut in das Glas geben",R.drawable.negroni2);
        negroni.addStep("Gut umrühren (20s)",R.drawable.negroni3);
        negroni.addStep("Durch ein Sieb in ein Cocktailglas umfüllen",R.drawable.negroni4);
        negroni.addStep("Orangenschale über dem Glas eindrehen",R.drawable.negroni5);
        negroni.addStep("Mit Orangenschale den Drink garnieren",R.drawable.negroni6);
        negroni.addStep("",R.drawable.fertig);

        negroni.setID(7);

        negroni.setFlavourText("The Italian Classic");

        negroni.setDefaultImg(7);

        drink_data[7] = negroni;

        //Create Ramos Fizz
        Drink ramos = new Drink();

        ramos.setEffort("simpel");

        ramos.setName("Ramos Fizz");

        ramos.setSteps(9);


        ramos.addIng("Gin");
        ramos.addIng("Sahne");
        ramos.addIng("Eiweiß");
        ramos.addIng("Zitrone");
        ramos.addIng("Limette");
        ramos.addIng("Zucker");
        ramos.addIng("Soda");

        ramos.addStep("1",R.drawable.ramos1);
        ramos.addStep("2",R.drawable.ramosfizz_ing);
        ramos.addStep("Ein großes Glas (Mixglas) mit Eis füllen",R.drawable.ramos1);
        ramos.addStep("Gin, Sahne, Eiweiß, Zitrone, Limette und Zucker in einen Mixer geben",R.drawable.ramos2);
        ramos.addStep("Zutaten mixen bis der Drink gut vermischt und schaumig ist",R.drawable.ramos3);
        ramos.addStep("Den Drink in das gekühlte Glas gießen",R.drawable.ramos4);
        ramos.addStep("Das Glas mit Sodawasser aufgießen",R.drawable.ramos5);
        ramos.addStep("Mit einer Zitronenscheibe garnieren",R.drawable.ramos6);
        ramos.addStep("",R.drawable.fertig);

        ramos.setID(8);

        ramos.setFlavourText("Mix it up!");

        ramos.setDefaultImg(7);

        drink_data[8] = ramos;


        //Create Ramos Fizz
        Drink mintj = new Drink();

        mintj.setEffort("aufwendiger");

        mintj.setName("Mint Julep");

        mintj.setSteps(13);


        mintj.addIng("Whiskey");
        mintj.addIng("Zucker");
        mintj.addIng("Minze");
        mintj.addIng("Crushed Ice");

        mintj.addStep("1",R.drawable.mintj1);
        mintj.addStep("2",R.drawable.mintjulep_ing);
        mintj.addStep("Zucker und Wasser in ein hohes Glas geben",R.drawable.mintj1);
        mintj.addStep("Umrühren bis der Zucker sich gelöst hat",R.drawable.mintj2);
        mintj.addStep("Minzblätter hinzugeben",R.drawable.mintj3);
        mintj.addStep("Mit einem Holzlöffel vorsichtig die Minzblätter gegen das Glas drücken (nicht zerreißen)",R.drawable.mintj4);
        mintj.addStep("Das Glas zur Hälfte mit Crushed Ice füllen",R.drawable.mintj5);
        mintj.addStep("Den Bourbon hinzugeben",R.drawable.mintj6);
        mintj.addStep("Gut umrühren",R.drawable.mintj7);
        mintj.addStep("Den Rest des Glases mit Crushed Ice füllen",R.drawable.mintj8);
        mintj.addStep("Umrühren bis das Glas sehr kalt ist",R.drawable.mintj9);
        mintj.addStep("Mit Minzzweig und Strohhalm servieren",R.drawable.mintj10);
        mintj.addStep("",R.drawable.fertig);

        mintj.setID(9);

        mintj.setFlavourText("Ready for the Gallery");

        mintj.setDefaultImg(11);

        drink_data[9] = mintj;

    }

    public Drink[] getDrink_data(){
        return drink_data;
    }

    public int[] getDrink_images(){
            for (int i = 0; i < drink_data.length; i++) {
                drink_images[i] = drink_data[i].defaultImg;
            }

        return drink_images;
    }

    public void setDrink_data(Drink[] newDrinks){
        drink_data = null;
        drink_data = newDrinks;
        drink_images = new int[drink_data.length];
    }
}
