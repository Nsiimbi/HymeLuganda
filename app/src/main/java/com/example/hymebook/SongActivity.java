package com.example.hymebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SongActivity extends AppCompatActivity {
    Song song=new Song();
    WebView hymView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        try {
            song = (Song) getIntent().getExtras().getSerializable("song");
            hymView=findViewById(R.id.hymView);
            hymView.loadUrl("file:///android_asset/"+song.link);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
