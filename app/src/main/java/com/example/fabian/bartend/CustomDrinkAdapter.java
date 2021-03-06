package com.example.fabian.bartend;

import android.content.Context;
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

    public CustomDrinkAdapter(Context ctx, int drID){

        drinkID = drID;
        this.ctx = ctx;
        drinkHandler = DrinkChooser.drinkHandler;
        drinkData = drinkHandler.getDrink_data();

        for(int i = 0; i < drinkData.length;i++ ){
            if (drinkData[i].getID() == drID){
                image_ressources = drinkData[i].getImages();
                inst_ressources = drinkData[i].getInstructions();
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

        if(position == 0){
            imageView.setImageResource(drinkData[drinkID].getDefaultImg());
            textView1.setText(drinkData[drinkID].getFlavourText());
            textView2.setText("");
        }

        else if(position == 1){
            imageView.setImageResource(0);
            textView1.setText("Zutaten");

            StringBuilder builder = new StringBuilder();
            for (String details: drinkData[drinkID].getIngridients()){
                builder.append(details + "\n");
            }
            textView2.setText(builder.toString());
        }
        else {
            imageView.setImageResource(image_ressources[position]);
            //Smart Input for Drink - position compare to Drink ID!!
            textView1.setText(inst_ressources[position]);
            textView2.setText("");
        }
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}
