package com.example.nazmulhuda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 =  findViewById(R.id.about);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(MainActivity.this, About.class);
                startActivity(go);
            }
        });

        Button b2 =  findViewById(R.id.fee);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(MainActivity.this, Tution_Fee.class);
                startActivity(go);
            }
        });


        Button b3 =  findViewById(R.id.faculty);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(MainActivity.this, Faculty.class);
                startActivity(go);
            }
        });

        Button b4 =  findViewById(R.id.photo);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(MainActivity.this, Photo_Gallery.class);
                startActivity(go);
            }
        });
    }
}
