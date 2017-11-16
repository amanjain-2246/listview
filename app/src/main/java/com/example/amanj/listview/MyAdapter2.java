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
 * Created by amanj on 4/24/2017.
 */

public class MyAdapter2 extends ArrayAdapter<String> {
    Context context;
    String titlearr[];
    String descarr[];
    int imgs[];

    public MyAdapter2(Context con, String title[], int img[], String desc[]) {
        super(con, R.layout.single_row, R.id.textView, title);
        context = con;
        imgs = img;
        titlearr = title;
        descarr = desc;

    }

     class MyViewHolder
     {
        ImageView myimage;
        TextView mytitle;
        TextView mydesc ;
        MyViewHolder(View view)
        {

            myimage = (ImageView) view.findViewById(R.id.imageView);
            mytitle = (TextView) view.findViewById(R.id.textView);
            mydesc = (TextView) view.findViewById(R.id.textView2);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        MyViewHolder myViewHolder=null;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);

            myViewHolder  = new MyViewHolder(row);
            row.setTag(myViewHolder);
        }
        else      {
            myViewHolder = (MyViewHolder) row.getTag();
        }
       myViewHolder.myimage.setImageResource(imgs[position]);
        myViewHolder.mytitle.setText(titlearr[position]);
       myViewHolder.mydesc.setText(descarr[position]);
        return row;
    }


}
