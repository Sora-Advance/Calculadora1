package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resta extends AppCompatActivity {
    TextView txtPrimeroresta1;
    TextView txtSegundoresta1;
    TextView txtResultadoresta1;
    Button btnResulresta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        txtPrimeroresta1=findViewById(R.id.txtPrimeroresta);
        txtSegundoresta1=findViewById(R.id.txtSegundoresta);
        txtResultadoresta1=findViewById(R.id.txtResultadoresta);
        btnResulresta1=findViewById(R.id.btnResulresta);

        btnResulresta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1= Integer.valueOf(txtPrimeroresta1.getText().toString() ) ;
                int valor2= Integer.valueOf(txtSegundoresta1.getText().toString() ) ;
                int resultado= valor1 - valor2;
                txtResultadoresta1.setText(" "+ resultado);
            }
        });

    }
}

