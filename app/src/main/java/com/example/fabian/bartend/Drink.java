package com.example.fabian.bartend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fabian on 19.10.2016.
 */
public class Drink {

    public String name;
    public int ID;
    public ArrayList<String> ingridients = new ArrayList<String>();
    public String[] instructions;
    public int[] images;
    public String effort;
    public String flavourText;
    public int steps;
    public int count = 0;
    public int ingCount = 0;
    public int defaultImg;

    public void setDefaultImg (int i){
        defaultImg = images[i];
    }

    public void setSteps (int st){
        steps = st;
        images = new int[steps];
        instructions = new String[steps];
    }

    public void addIng (String s){

        ingridients.add(ingCount,s);
        ingCount++;

    }

    public void addStep (String x, int y) {

        // If instructions != null && images != null else missing Array Exception!
        images[count] = y;
        instructions[count] = x;

        count++;
    }

    public void setID (int idTemp){
        ID = idTemp;
    }

    public void setName (String nam){ name = nam; }

    public void setEffort (String eff){ effort = eff; }

    public void setFlavourText (String flav){flavourText = flav; }

    public ArrayList<String> getIngridients (){return ingridients;}

    public String[] getInstructions (){
        return instructions;
    }

    public int[] getImages(){
        return images;
    }

    public String getEffort (){ return effort; }

    public int getID(){
        return ID;
    }

    public String getName (){return name;}

    public String getFlavourText() {return flavourText;}

    public int getDefaultImg(){return defaultImg;}

}
