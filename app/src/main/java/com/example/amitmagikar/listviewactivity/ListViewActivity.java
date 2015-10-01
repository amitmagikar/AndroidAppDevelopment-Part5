package com.example.amitmagikar.listviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);
        String[] names = new String[]{"Megan","Jamie","Daniel","Conrad","Michael"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.name_list, names);
        listView.setAdapter(adapter);
    }
}
