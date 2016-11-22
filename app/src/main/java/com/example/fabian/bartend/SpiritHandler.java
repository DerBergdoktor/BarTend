package com.example.fabian.bartend;

/**
 * Created by Fabian on 18.11.2016.
 */

public class SpiritHandler {
    public String[] infos;
    public int[] graphics;
    public int[] header;

    public void fillSpirits(){

        infos = new String[7];
        graphics = new int[7];
        header = new int[7];

        infos[0]= ("Gin ist bekannt als farblose, starke Spirituose (Alkoholgehalt von mindestens 37,5%) mit einem blumigen bis würzigen Geschmack. Der besondere Geschmack kommt von der namensgebenden Wacholderbeere (engl. juniper berry - abgewandelt von “Junip” zu “Gin”), die dem meist aus Getreide gewonnenem Schnaps hinzugefügt wird.\n\n" +
                "Außer Wacholder werden noch verschiedene weitere Pflanzenstoffe (die vom Hersteller abhängen) dem Gin hinzugegeben. Beispiele dafür sind Ingwer, Koriander, Orangenschale oder Muskat.\n" +
                "An die Bezeichnung “London Gin” sind mehrere Bedingungen, wie das Verzichten von Farbstoffen und die Reduzierung von Süßung auf 0,1g Zucker auf 1 Liter Flüssigkeit, geknüpft. “Dry Gin” gilt ebenfalls als Qualitätsbezeichnung für einen Gin. Hier sind die Regeln allerdings weniger streng, als beim “London Dry Gin”.");
        infos[1]=("Ein Whiskey unterscheidet sich von anderen Spirituosen maßgeblich durch die unbedingte, mehrjährige Lagerung in einem Holzfass. Lagert das Destillat kürzer als drei Jahre oder in etwas anderem als einem Holzfass, so handelt es sich hierbei um keinen Whiskey.\n" +
                "Dies ist insbesondere dahingehend entscheidend, da ein Großteil des Geschmacksprofils durch die Lagerung im Holzfass entsteht.\n" +
                "Whiskey wird stets aus Getreide gebrannt. Hier entsteht auch die erste Klassifizierung. Mehrheitlich aus Mais gebrannter Whiskey wird als “Bourbon” bezeichnet. Während mehrheitlich aus Roggen gebrannter Whiskey als “Rye Whiskey” bezeichnet wird.\n" +
                "Wobei meistens die Hauptzutat gemälzte Gerste ist.\n" +
                "Weitere Klassifizierungen sind Scotch (Whiskey aus Schottland), Irish Whiskey, welcher meistens milder und süßer ist und American Whiskey, welchem häufiger Mais und Roggen hinzugefügt werden.\n" +
                "Außerdem ist zwischen Blended Whiskey, Single Malt und Single Cask Malt zu unterscheiden. Blended Whiskey bezeichnet eine Mischung aus verschiedenen Whiskeys, die auch aus verschiedenen Brennereien stammen können. Single Malt darf lediglich ein gemälztes Getreide enthalten und muss aus einer Brennerei kommen. Single Cask Malt ist ein Whiskey der aus nur einem Fass abgefüllt wurde. Single Cask Flaschen sind meist stark limitiert.\n" +
                "\n" +
                "\n" +
                "Für die meisten Cocktails bietet sich ein ausgewogener Blended Scotch an. Ein Old Fashioned kann allerdings auch sehr von einem älteren Single Malt profitieren.");
        infos[2]=("Das Wort “wodka” entstammt den slavischen Sprachen und bedeutet soviel wie “Wässerchen”. Weltweit verbirgt sich hinter diesem Wort ein klarer, weitgehend neutraler Schnaps, der aus Kartoffeln oder Getreide (zumeist Roggen) gebrannt wird.\n\n" +
                "Ein besonderer Aspekt bei der Destillierung des Wodkas gegenüber anderen Schnäpsen ist die aufwendige Filterung, mittels Aktivkohle, Einfrierung oder Milcheiweiß. Die sorgfältige Filterung soll unerwünschte Begleitaromen entfernen und einen möglichst klaren und neutralen Geschmack garantieren.\n\n" +
                "Neben dem puren Wodka werden mittlerweile auch aromatisierte Wodkas angeboten. Hier werden dem Destillat verschiedene, häufig fruchtige Aromaöle und/oder Essenzen hinzugefügt. Beispiele sind Orange oder Schwarze Johannesbeere.\n" +
                "Tipp: Ein Cosmopolitan profitiert sehr von den Aromen eines Orangenwodkas gegenüber dem klassischen puren.");
        infos[3]=("Von den karibischen Inseln kam im 17. Jahrhundert der Rum nach Europa. Während er zu der Zeit pur oder mit warmen Wasser (Grog) getrunken wurde, ist er heute ein wichtiger Bestandteil vieler Cocktails, besonders der exotischen “Tiki Cocktails”.\n" +
                "Gewonnen wird die Spirituose klassischerweise aus der Melasse des Zuckerrohrs. Nach dem Brennen ist das Destillat klar und hat einen Alkoholgehalt von 65-75%.\n" +
                "Obgleich die eigentliche Herstellung hier abgeschlossen ist, wird Rum häufig noch in Fässern gelagert um die Qualität zu steigern. Besserer weißer Rum wird dafür mehrere Monate oder wenige Jahre in Edelstahlfässern gelagert. Dunkler Rum hingegen wird mehrere Jahre in Holzfässern (bspw. aus der Whiskeyproduktion) gelagert und erhält dadurch seine dunkle Farbe und komplexen Aromen.\n" +
                "Cachaça ist Rum in vielen Aspekten sehr ähnlich, wird allerdings anstatt aus Melasse aus Zuckerrohrsaft gebrannt.\n" +
                "\n" +
                "\n" +
                "Viele Tiki Cocktails empfehlen einen “Rum Blend” - eine Mischung aus verschiedenen Rumsorten. Hierfür bietet es sich an anstatt einfach hellen und dunklen Rum zu kombinieren, eine weite Bandbreite von Rumsorten auszuprobieren. So unterscheiden sich dunkle Rumsorten maßgeblich durch die Lagerzeit, die von wenigen Jahren (daraus resultieren eine hellere, goldene Farbe und leichterer Geschmack) bis hin zu 15 Jahren oder länger reichen kann (damit ergibt sich eine tief dunkle Farbe und intensive, komplexe Aromen).");
        infos[4]=("Der Tequila hat im Laufe der Jahre einen fragwürdigen Ruf bekommen. Viele denken, wenn sie von Tequila hören an Salz, Zitrone und wilde Parties. Man tut dem Tequila allerdings Unrecht. Dies hängt mit dem wilden Stürzen des Getränkes und mit dem dünnen Angebot qualitativ guter Tequilas auf dem deutschen Markt zusammen.\n\n" +
                "Echter Tequila wird ausschließlich aus dem Herzen der blauen Agave gebrannt. Das klare Destillat kann direkt abgefüllt und als “Tequila Blanco” verkauft werden. Alternativ kann der Tequila zum reifen in Holzfässern gelagert werden. Nach mindestens zwei Monaten Fasslagerung spricht man vom “Tequila Reposado” nach mindestens einem Jahr handelt es sich um “Tequila Añejo”.\n" +
                "In Deutschland kauft man Tequila häufig (besonders bei den günstigeren Marken) als Tequila Mixto. Dieser wird nur mehrheitlich aus Agaven gebrannt (mindestens 51%). Beim Kauf sollte man stets darauf achten, dass es sich um echten Tequila aus 100% Agave handelt.\n\n" +
                "Für die meisten Cocktails eignet sich Tequila Blanco am besten. Allerdings spricht hier nichts gegen das Experimentieren mit länger gelagerten Alternativen.");
        infos[5]=("Eine besonders in klassischen Cocktails häufig auftretende Zutat ist Wermut. Dahinter verbirgt sich ein mit Kräutern aromatisierter Wein, der seinen Namen von dem herben Wermuthkraut hat, welches stets ein Bestandteil des Getränkes ist.\n\n" +
                "Wie auch Wein unterscheidet man Wermut zwischen trocken und lieblich (süß). Beide Varianten unterscheiden sich sehr im Geschmack und haben daher auch verschiedene Verwendungen beim Mixen von Cocktails.");
        infos[6]=("Die meisten Orangenliköre lassen sich als Curaçao klassifizieren. Die Rede ist hier meistens von einer Spirituose mit einem Alkoholgehalt von mindestens 20%, die durch das Zugeben von Orangenschale einen typisch fruchtigen Geschmack erhalten hat. Bei einem Alkoholgehalt von 30% oder mehr ist von einem Triple Sec die Rede.\n" +
                "Da sowohl Curaçao als auch Triple Sec keine geschützten Begriffe sind, kann die genaue Rezeptur allerdings stark variieren.\n" +
                "Cointreau ist ein Markenname für einen spezifischen Triple Sec.\n" +
                "Der besonders in den 1980ern beliebte Blue Curaçao ist eine Variation des klassischen Curaçaos welche um blaue Lebensmittelfarbe ergänzt wurde.\n" +
                "\n" +
                "\n" +
                "In Cocktail Rezepten kann mit Orangenlikören experimentiert werden. Wer gerade keinen Cointreau zur Hand hat, kann bspw. guten Gewissens einen anderen Triple Sec benutzen.");

        graphics[0]= R.drawable.gin_img;
        graphics[1]= R.drawable.whiskey_img;
        graphics[2]= R.drawable.wodka_img;
        graphics[3]= R.drawable.rum_img;
        graphics[4]= R.drawable.tequila_img;
        graphics[5]= R.drawable.wermut_img;
        graphics[6]= R.drawable.orange_img;

        header[0] = R.drawable.ginheader;
        header[1] = R.drawable.whiskeyheader;
        header[2] = R.drawable.wodkaheader;
        header[3] = R.drawable.rumheader;
        header[4] = R.drawable.tequilaheader;
        header[5] = R.drawable.wermutheader;
        header[6] = R.drawable.orangeheader;


    }

    public String[] getInfos(){
        return infos;
    }
    public int[] getGraphics(){ return graphics; }
    public int[] getHeader(){return header;}
}
