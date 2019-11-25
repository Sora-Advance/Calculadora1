package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class multi extends AppCompatActivity {
    TextView txtPrimeromulti1;
    TextView txtSegundomulti1;
    TextView txtResultadomulti1;
    Button btnResulmulti1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        txtPrimeromulti1=findViewById(R.id.txtPrimeromulti);
        txtSegundomulti1=findViewById(R.id.txtSegundomulti);
        txtResultadomulti1=findViewById(R.id.txtResultadomulti);
        btnResulmulti1=findViewById(R.id.btnResulmulti);

        btnResulmulti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.valueOf(txtPrimeromulti1.getText().toString());
                int valor2 = Integer.valueOf(txtSegundomulti1.getText().toString());
                int resultado = valor1 * valor2;
                txtResultadomulti1.setText(" " + resultado);
            }
        });
    }
}
