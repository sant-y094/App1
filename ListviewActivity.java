package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        String[] s1=getResources().getStringArray(R.array.floor);


        final ListView listviewer = (ListView) findViewById(R.id.x);
        ListAdapter adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,s1);
        listviewer.setAdapter(adapter);
        listviewer.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemposition = position;
                String value = (String) listviewer.getItemAtPosition(position);

                Toast.makeText(ListviewActivity.this,value,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
