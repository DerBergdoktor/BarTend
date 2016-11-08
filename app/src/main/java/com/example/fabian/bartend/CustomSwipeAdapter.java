package com.example.fabian.bartend;

import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
import android.renderscript.Type;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Fabian on 19.10.2016.
 */
public class CustomSwipeAdapter extends PagerAdapter {

    public DrinkHandler drinkHandler;
    public Drink[] drinkData;
    public String[] name_ressources;
    private int[] image_ressources;
    private Context ctx;
    private LayoutInflater layoutInflater;
    public int viewID;
    public TextView textView;
    public Typeface font1 = Typeface.SANS_SERIF;
    public ImageView imageView;

    public CustomSwipeAdapter(Context ctx, DrinkHandler drinkH){

        this.ctx = ctx;
        drinkHandler = drinkH;
        image_ressources = drinkHandler.getDrink_images();

        drinkData = drinkHandler.getDrink_data();
        name_ressources = new String[drinkData.length];
        for (int i = 0; i < drinkData.length; i++){
            name_ressources[i] = drinkData[i].getName();
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
        View item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);
        imageView = (ImageView)item_view.findViewById(R.id.image_view);
        textView = (TextView) item_view.findViewById(R.id.drinkname);
        textView.setTypeface(font1);

        imageView.setImageResource(image_ressources[position]);

        //Smart Input for Drink - position compare to Drink ID!!
        textView.setText(name_ressources[position]);

        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    public int getID(){

        return viewID;
    }

    public void setFont(Typeface font){
        font1 = font;
    }

    public ImageView getImage(){
        return imageView;
    }
}
