package com.example.amanj.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView)findViewById(R.id.list);
        String[] Values=new String[]
                {
                        "Aman jain",
                        "Anika jain",
                        "Daivansh jain",
                        "Rishab patni",
                        "Shubham Soni",
                        "Akshita kumari",
                        "Priyanshu jain",
                        "Anmol kala",
                        "Siddhant jain",
                        "Mohit daga",
                        "Arpit jain"
                };
                                                            //context obj,layout of a single row,data source,value
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,android.R.id.text1,Values);
        listView.setAdapter(adapter);
        //listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);




       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               int pos=position;
               String val=(String)listView.getItemAtPosition(position);
               Toast.makeText(getApplicationContext(),"position : "+pos+"value :"+val,Toast.LENGTH_LONG).show();
           }
       });

    }


}
