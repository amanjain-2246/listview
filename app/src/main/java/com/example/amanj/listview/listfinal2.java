package com.example.amanj.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by amanj on 4/24/2017.
 */

public class listfinal2 extends AppCompatActivity {
    ListView lb;
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String orgtitle[]=new String[]
                {
                        "India","Australia","Canada","Hongkong","England","Ireland","Russia"
                };
        String orgdesc[]=new String[]
                {
                        "India Desc","Australia Desc","Canada Desc","Hongkong Desc","England Desc","Ireland Desc","Russia Desc"
                };
        int orgimg[]=new int[]
                {
                        R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,
                        R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher
                };

        lb=(ListView)findViewById(R.id.list);
        MyAdapter2 adapter=new MyAdapter2(this,orgtitle,orgimg,orgdesc);
        lb.setAdapter(adapter);
    }
}
