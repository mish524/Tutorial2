package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText number1,number2;
    Button btn_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        btn_ok = (Button)findViewById(R.id.ok);


        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("number1",number1.getText().toString());
                intent.putExtra("number2",number2.getText().toString());

                Context context = getApplicationContext();
                CharSequence msg = "Sending Message";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context,msg,duration);
                toast.show();
                startActivity(intent);
            }
        });

    }
}
