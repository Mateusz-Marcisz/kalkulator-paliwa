package com.example.kalkulator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

        String b, c, d;
    Button obliczenie;
    EditText dlugosc, spalanie, wynik, cena;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dlugosc = findViewById(R.id.dlugosc);
        spalanie = findViewById(R.id.spalanie);
        obliczenie = findViewById(R.id.obliczenie);
        wynik = findViewById(R.id.wynik);
        cena = findViewById(R.id.cena);














        obliczenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//--------------------------------------------------------------
                b = dlugosc.getText().toString();


                double x = Double.parseDouble(b);

//--------------------------------------------------------------
                c = spalanie.getText().toString();


                double y = Double.parseDouble(c);
//---------------------------------------------------------------

                d = cena.getText().toString();


                double z = Double.parseDouble(d);







                double a =(x/100)*y*z ;






                wynik.setText(String.valueOf(a+"zł"));


            }
        });}}



