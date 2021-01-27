package com.kochchi.demoexe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView workStatus, recentStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workStatus = findViewById(R.id.statusList);
        recentStatus = findViewById(R.id.recentList);

        ArrayList<String> data = new ArrayList<>();
        data.add("on progess");
        data.add("completed");
        data.add("new");
        data.add("on progress");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.status_title, R.id.nums,data);
        workStatus.setAdapter(arrayAdapter);

        ArrayList<String> recentdata = new ArrayList<>();
        recentdata.add("on progess");
        recentdata.add("completed");
        recentdata.add("new");
        recentdata.add("on progress");

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, R.layout.recent_title, R.id.recentData);
        recentStatus.setAdapter(arrayAdapter1);
    }
}
