package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class divi extends AppCompatActivity {
    TextView txtPrimerodivi1;
    TextView txtSegundodivi1;
    TextView txtResultadodivi1;
    Button btnResuldivi1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divi);
        txtPrimerodivi1 = findViewById(R.id.txtPrimerodivi);
        txtSegundodivi1 = findViewById(R.id.txtSegundodivi);
        txtResultadodivi1 = findViewById(R.id.txtResultadodivi);
        btnResuldivi1 = findViewById(R.id.btnResuldivi);


        btnResuldivi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.valueOf(txtPrimerodivi1.getText().toString());
                int valor2 = Integer.valueOf(txtSegundodivi1.getText().toString());
                int resultado = valor1 / valor2;
                txtResultadodivi1.setText(" " + resultado);
            }
        });

    }
}