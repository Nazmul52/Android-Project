package com.example.nazmulhuda.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Login");
        TextView signup = findViewById(R.id.textView5);

        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent go = new Intent(MainActivity.this, SignUp.class);
                startActivity(go);
            }
        });
    }
}
