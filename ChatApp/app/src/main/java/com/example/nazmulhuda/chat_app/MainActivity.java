package com.example.nazmulhuda.chat_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText email = findViewById(R.id.email);
                EditText password = findViewById(R.id.password);
                TextView result =findViewById(R.id.error);


                if(email.getText().toString().equals("nazmul8842@gmail.com") && password.getText().toString().equals("nazmul")){
                    Intent go = new Intent(MainActivity.this, SuccessView.class);
                    startActivity(go);
                }else {
                    result.setText("Invalid email & password");
                }
            }
        });
    }
}
