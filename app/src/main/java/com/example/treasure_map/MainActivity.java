package com.example.treasure_map;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_my_treasure = (Button) findViewById(R.id.btn_my_treasure);
        btn_my_treasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),my_treasure.class);
                startActivity(intent);
            }
        });

        Button btn_treasure_map = (Button) findViewById(R.id.btn_treasure_map);
        btn_treasure_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),treasure_map.class);
                startActivity(intent);
            }
        });

        Button btn_make_treasure = (Button) findViewById(R.id.btn_make_treasure);
        btn_make_treasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),make_treasure.class);
                startActivity(intent);
            }
        });

    }
}