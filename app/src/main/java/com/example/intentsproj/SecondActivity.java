package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1,num2,answer;
    Button add,minus,divide,multiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView)findViewById(R.id.num2);

        Intent intent = getIntent();

        String number1 = intent.getStringExtra("number1");
        String number2 = intent.getStringExtra("number2");

        final double x1 = Double.parseDouble(number1);
        final double x2 = Double.parseDouble(number2);

        num1.setText(number1);
        num2.setText(number2);

        answer = (TextView) findViewById(R.id.answer);
        add = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);

        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                answer.setText(x1+"+"+x2+"="+ (x1+x2) );
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        answer.setText(x1+"-"+x2+"="+ (x1-x2) );

                    }
        });

        divide.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        answer.setText(x1+"/"+x2+"="+ (x1/x2) );

                    }
        });


        multiply.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        answer.setText(x1+"*"+x2+"="+ (x1*x2) );

                    }
        });
    }
}
