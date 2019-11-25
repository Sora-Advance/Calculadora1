package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class suma extends AppCompatActivity {
    TextView txtPrimerosuma1;
    TextView txtSegundosuma1;
    TextView txtResultadosuma1;
    Button btnResulsuma1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        txtPrimerosuma1=findViewById(R.id.txtPrimerosuma);
        txtSegundosuma1=findViewById(R.id.txtSegundosuma);
        txtResultadosuma1=findViewById(R.id.txtResultadosuma);
        btnResulsuma1=findViewById(R.id.btnResulsuma);

        btnResulsuma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1= Integer.valueOf(txtPrimerosuma1.getText().toString() ) ;
                int valor2= Integer.valueOf(txtSegundosuma1.getText().toString() ) ;
                int resultado= valor1 + valor2;
                txtResultadosuma1.setText(" "+ resultado);
            }
        });

    }
}
