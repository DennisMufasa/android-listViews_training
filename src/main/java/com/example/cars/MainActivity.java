package com.example.cars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lst;

    String[] heading = {
            "Dennis",
            "Shamim",
            "Samira",
            "Sambu"
    };

    String[] subheading = {
            "Scientist",
            "Engineer",
            "Dev Ops",
            "Tech supoort"
    };

    int[] logo = {R.drawable.nasa,
    R.drawable.apple,
    R.drawable.desk,
    R.drawable.node};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst = (ListView)findViewById(R.id.lst);

        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        for (int i=0; i < 4; i +=1){
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("header",heading[i]);
            hashMap.put("subheading", subheading[i]);
            hashMap.put("logo", Integer.toString(logo[i]));

            list.add(hashMap);

            //keys used in the hashmap above
            String[]from={"logo","header","subheading"};

            //the correspondents for the keys in the support layout xml file
            int[]to={R.id.img,R.id.heading,R.id.subheading};

            SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), list,R.layout.support, from, to);
            lst.setAdapter(adapter);
        }


    }
}
