package com.example.nazmulhuda.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,plus,minus,mul,div,clear,equal;
    float mValueOne , mValueTwo;
    String res;
    EditText edt;
    TextView result;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.add);
        minus = findViewById(R.id.sub);
        mul = findViewById(R.id.multi);
        div = findViewById(R.id.divide);
        edt = findViewById(R.id.editText);
        result = findViewById(R.id.result);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt == null){
                    edt.setText("");
                }else {
                    mValueOne = Float.parseFloat(edt.getText() + "");
                    mAddition = true;
                   edt.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt.getText() + "");
                mSubtract = true ;
                edt.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt.getText() + "");
                mMultiplication = true ;
               edt.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt.getText()+"");
                mDivision = true ;
                edt.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt.getText() + "");

                if (mAddition == true){

                    result.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    result.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    result.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    result.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+".");
            }
        });


    }
}
