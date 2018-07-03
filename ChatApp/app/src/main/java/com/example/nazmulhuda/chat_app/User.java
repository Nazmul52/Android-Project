package com.example.nazmulhuda.chat_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class User extends AppCompatActivity {

    public EditText sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        TextView show = findViewById(R.id.result);
        Bundle bu;
        bu = getIntent().getExtras();
        show.setText(bu.getString("message"));
//        Intent intent = getIntent();
//
//        String messge = intent.getStringExtra(MESSAGE_KEY);
//        TextView textView = new TextView(this);
//        textView.setTextSize(20);
//        textView.setText(messge);
//        textView.setPadding(10, 20, 0, 0);
//        setContentView(textView);
    }


    public void sendUser(View view){
        sms = findViewById(R.id.user2);
        String message = sms.getText().toString();
        Intent go = new Intent(User.this, SuccessView.class);
        go.putExtra("smss",  message);
        startActivity(go);
    }
}
