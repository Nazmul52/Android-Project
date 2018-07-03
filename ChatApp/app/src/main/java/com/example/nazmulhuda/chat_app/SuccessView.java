package com.example.nazmulhuda.chat_app;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessView extends AppCompatActivity {


      EditText sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_view);
//        TextView show = findViewById(R.id.res);
//        Bundle bu;
//        bu = getIntent().getExtras();
//        show.setText(bu.getString("smss"));


//        AlertDialog alertDialog = new AlertDialog.Builder(this)
//                //set icon
//                .setIcon(android.R.drawable.ic_dialog_info)
//                //set title
//                .setTitle("Successfully Logged In!")
//                //set message
//                .setMessage("Enjoy the next step")
//                //set positive button
//                /*.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        //set what would happen when positive button is clicked
//                        finish();
//                    }
//                })*/
//                //set negative button
//                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        //set what should happen when negative button is clicked
//                        Toast.makeText(getApplicationContext(),"Congrats", Toast.LENGTH_LONG).show();
//                    }
//                })
//                .show();

        Toast.makeText(getApplicationContext(), "Congratulation", Toast.LENGTH_LONG).show();


    }




    public void onClick(View view){
         sms = findViewById(R.id.user1);
        String message = sms.getText().toString();
        Intent go = new Intent(SuccessView.this, User.class);
        go.putExtra("message",  message);
        startActivity(go);
    }
}
