package com.example.hymebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //C:\Users\kay\AndroidStudioProjects\HymeBook\app\src\main\assets
        listView=findViewById(R.id.hymsListView);
        HymsListViewAdapter hymsListViewAdapter=new HymsListViewAdapter(this, Constants.songArrayList());
        listView.setAdapter(hymsListViewAdapter);
    }
}
