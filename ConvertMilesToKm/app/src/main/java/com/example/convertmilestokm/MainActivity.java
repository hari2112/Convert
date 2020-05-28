package com.example.convertmilestokm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMileToKm = (Button) findViewById(R.id.buttonConvMileToKm);
        buttonConvMileToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxkm = (EditText) findViewById(R.id.editTextKm);
                double vMile = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMile / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxkm.setText(formatVal.format(vKm));


            }
        });

        Button buttonConvKmToMile = (Button) findViewById(R.id.buttonConvKmToMile);
        buttonConvKmToMile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                double vKm = Double.valueOf(textBoxKm.getText().toString());
                double vMIle = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMIle));


            }
        });

    }
}
