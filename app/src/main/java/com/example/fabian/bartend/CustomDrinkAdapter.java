package com.example.fabian.bartend;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.util.StringBuilderPrinter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by Fabian on 19.10.2016.
 */

public class CustomDrinkAdapter extends PagerAdapter {

    public DrinkHandler drinkHandler;
    public Drink[] drinkData;
    public String[] inst_ressources;
    private int[] image_ressources;
    private Context ctx;
    private LayoutInflater layoutInflater;
    public int drinkID;
    private boolean sirup = false;

    public CustomDrinkAdapter(Context ctx, int drID, int src){

        System.out.println("See Kontext: " + drID + " , " + src);

        drinkID = drID;
        this.ctx = ctx;
        if(src == 0) {
            drinkHandler = DrinkChooser.drinkHandler;
            drinkData = drinkHandler.getDrink_data();
        }

        else if(src == 1){
            drinkHandler = TippViewer.drinkHandlerTipp;
            drinkData = drinkHandler.getDrink_data();
        }
        else if(src == 2){
            sirup = true;
            drinkHandler = DrinkChooser.drinkHandler;
            drinkData = new Drink[1];
            drinkData[0] = drinkHandler.sirup;
            image_ressources = drinkHandler.sirup.getImages();
            inst_ressources = drinkHandler.sirup.getInstructions();
        }

        if(sirup == false) {
            for (int i = 0; i < drinkData.length; i++) {
                System.out.println("Array: " + drinkData[i].getName() + " , " + drinkData[i].getID());
                if (i == drID) {
                    System.out.println("See Chosen Drink: " + drinkData[i].getName());
                    image_ressources = drinkData[i].getImages();
                    inst_ressources = drinkData[i].getInstructions();
                    System.out.println("See View Count: " + image_ressources.length);
                }
            }
        }
    }

    @Override
    public int getCount() {
        return image_ressources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.drink_layout, container, false);


        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        TextView textView1 = (TextView) item_view.findViewById(R.id.instructText);
        TextView textView2 = (TextView) item_view.findViewById(R.id.ingriedText);

        if(sirup == false) {
            if (position == 0) {
                imageView.setImageResource(drinkData[drinkID].getDefaultImg());
                textView1.setText(drinkData[drinkID].getFlavourText());
                textView2.setText("");
            } else if (position == 1) {
                imageView.setImageResource(image_ressources[position]);
                textView1.setText("Zutaten");
            /*
            StringBuilder builder = new StringBuilder();
            for (String details: drinkData[drinkID].getIngridients()){
                builder.append(details + "\n");
            }
            textView2.setText(builder.toString());
            */
            } else {
                imageView.setImageResource(image_ressources[position]);
                //Smart Input for Drink - position compare to Drink ID!!
                textView1.setText(inst_ressources[position]);
                textView2.setText("");
            }
        }
        else if(sirup == true) {
            if (position == 0) {
                imageView.setImageResource(drinkHandler.sirup.getDefaultImg());
                textView1.setText(drinkHandler.sirup.getFlavourText());
                textView2.setText("");
            } else if (position == 1) {
                imageView.setImageResource(image_ressources[position]);
                textView1.setText("Zutaten");
            /*
            StringBuilder builder = new StringBuilder();
            for (String details: drinkData[drinkID].getIngridients()){
                builder.append(details + "\n");
            }
            textView2.setText(builder.toString());
            */
            } else {
                imageView.setImageResource(image_ressources[position]);
                //Smart Input for Drink - position compare to Drink ID!!
                textView1.setText(inst_ressources[position]);
                textView2.setText("");
            }
        }
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}
