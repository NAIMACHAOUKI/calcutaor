package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button reset=findViewById(R.id.button2);

        final EditText editText1 = findViewById(R.id.editTextNumber);
        final EditText editText2 = findViewById(R.id.editTextNumber2);
        final EditText result = findViewById(R.id.editTextNumber3);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                result.setText("");

            }
        });

    }
    public void somme(View view){
        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        EditText result = findViewById(R.id.editTextNumber3);

        Double n1 =Double.parseDouble(editText1.getText().toString());
        Double n2 =Double.parseDouble(editText2.getText().toString());
        Double res =n1+n2;
        result.setText(String.valueOf(res));
    }

    }
