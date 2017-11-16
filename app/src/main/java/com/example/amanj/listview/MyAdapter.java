package com.example.amanj.listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amanj on 4/22/2017.
 */

public class MyAdapter extends ArrayAdapter<String > {
    Context context;
    String titlearr[];
    String descarr[];
    int imgs[];

    public MyAdapter(Context con, String title[], int img[], String desc[]) {
        super(con, R.layout.single_row, R.id.textView, title);
        context = con;
        imgs = img;
        titlearr = title;
        descarr = desc;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
        }
            ImageView myimage = (ImageView) row.findViewById(R.id.imageView);
            TextView mytitle = (TextView) row.findViewById(R.id.textView);
            TextView mydesc = (TextView) row.findViewById(R.id.textView2);
            myimage.setImageResource(imgs[position]);
            mytitle.setText(titlearr[position]);
            mydesc.setText(descarr[position]);
            return row;
        }

}