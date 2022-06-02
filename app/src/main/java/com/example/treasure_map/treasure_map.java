package com.example.treasure_map;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import net.daum.mf.map.api.MapView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class treasure_map extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treasure_map);

        MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }
}
