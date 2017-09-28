package com.delarosa.delarosaquiz1.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.delarosa.delarosaquiz1.R;
import com.delarosa.delarosaquiz1.adapter.CustomAdapter;
import com.delarosa.delarosaquiz1.model.Android;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] codeName, version, api, releaseDate;
    ListView androidVerList;
    int[] logos;
    CustomAdapter adapter;
    List<Android> listNames;
    Button home, oreo, nougat, marshmallow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNames = new ArrayList<Android>();
        codeName = getResources().getStringArray(R.array.codeName);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        releaseDate = getResources().getStringArray(R.array.releaseDate);

        androidVerList = (ListView) findViewById(R.id.androidVerList);
        logos = new int[] {R.drawable.oreo, R.drawable.nougat, R.drawable.marshmallow};

        for(int i = 0; i < codeName.length; i++){
            listNames.add(new Android(logos[i], codeName[i], version[i], api[i], releaseDate[i]));
        }

        adapter = new CustomAdapter(this, listNames);
        androidVerList.setAdapter(adapter);

        androidVerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + codeName[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        oreo = (Button) findViewById(R.id.button2);
        nougat = (Button) findViewById(R.id.button3);
        marshmallow = (Button) findViewById(R.id.button4);
    }

//    public void callOreo(View view){
//        Intent intent = new Intent(this,Oreo.class);
//        String name = "activity_oreo";
//        String version = "v. 8.0";
//        String api = "26";
//        String Date = "August 21, 2017";
//        intent.putExtra("name",name);
//        intent.putExtra("version",version);
//        intent.putExtra("api",api);
//        intent.putExtra("date",Date);
//        startActivity(intent);
//    }
}
