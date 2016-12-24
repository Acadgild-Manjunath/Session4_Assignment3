package com.acadgild.com.session4_assignment3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Valyoo on 12/24/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context context1;

    public ImageAdapter(Context c) {
        context1 = c;
    }

    @Override
    public int getCount() {
        return versions.length;
    }

    @Override
    public Object getItem(int i) {
        return versions[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        ImageView imgView;
        if (view == null) {
            imgView = new ImageView(context1);
            imgView.setLayoutParams(new GridView.LayoutParams(540, 540));
            imgView.setScaleType(ImageView.ScaleType.CENTER);
            imgView.setPadding(10,10,10,10);
        } else {
            imgView = (ImageView) view;
        }

        imgView.setImageResource(versions[pos]);
        return imgView;
    }






    Integer[] versions = new Integer[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
            R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecream_sandwich,
            R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat};


    String[] versionNames = new String[]{"Name = Cupcake \n Version = 1.5", "Name = Donut \n Version = 1.6 ",
                                         "Name = Eclair \n Version = 2.0", "Name = Froyo \n Version = 2.2",
                                         "Name = Gingerbread \n Version = 2.3", "Name = Honeycomb \n Version = 3.0",
                                         "Name = Icecream Sandwich \n Version = 4.0", "Name = Jellybean \n Version = 4.1",
                                         "Name = Kitkat \n Version = 4.4", "Name = Lollipop \n Version = 5.0",
                                         "Name = Marshmallow \n Version = 6.0", "Name = Nougat \n Version = 7.0"};
}

