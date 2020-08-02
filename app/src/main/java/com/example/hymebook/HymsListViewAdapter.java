package com.example.hymebook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HymsListViewAdapter extends ArrayAdapter<Song> {
    ArrayList<Song> songArrayList;
    Context context;
    public HymsListViewAdapter(@NonNull Context context, ArrayList<Song> songArrayList) {
        super(context, R.layout.hyms_list_item, songArrayList);
        this.songArrayList=songArrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.hyms_list_item, parent, false);
        final Song song=songArrayList.get(position);
        TextView hymTitle=view.findViewById(R.id.hymTitle);
        TextView hymRelic=view.findViewById(R.id.hymRelic);
        LinearLayout sontAction=view.findViewById(R.id.sontAction);

        hymTitle.setText(song.songName);
        hymRelic.setText(song.relic);

        sontAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplaySong(song);
            }
        });
        return view;
    }

    public void DisplaySong(Song song){
        Intent intent = new Intent(context, SongActivity.class);
        intent.putExtra("song", song);
        context.startActivity(intent);
    }
}
