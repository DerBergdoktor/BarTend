package com.example.fabian.bartend;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Fabian on 18.11.2016.
 */

public class SpiritAdapter extends PagerAdapter {

    public String[] infoText;
    private int[] image_ressources;
    private Context ctx;
    private LayoutInflater layoutInflater;
    public TextView textView;
    public ImageView imageView;
    public ImageView imageView2;
    public int[] header_ressources;

    public SpiritAdapter(Context ctx, String[] infos, int[] pics, int[]headers){
        this.ctx = ctx;
        infoText = infos;
        image_ressources = pics;
        header_ressources = headers;
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
        View item_view = layoutInflater.inflate(R.layout.spirits_layout, container, false);
        imageView = (ImageView)item_view.findViewById(R.id.spiritPic);
        imageView2 = (ImageView)item_view.findViewById(R.id.spiritHeader);
        textView = (TextView) item_view.findViewById(R.id.spiritText);

        imageView.setImageResource(image_ressources[position]);
        imageView2.setImageResource(header_ressources[position]);

        //Smart Input for Drink - position compare to Drink ID!!
        textView.setText(infoText[position]);

        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
