package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class operaciones extends AppCompatActivity {
    Button btnSuma1;
    Button btnResta1;
    Button btnDivi1;
    Button btnMulti1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        btnSuma1 = findViewById(R.id.btnSuma);
        btnResta1 = findViewById(R.id.btnResta);
        btnMulti1 = findViewById(R.id.btnMulti);
        btnDivi1 = findViewById(R.id.btnDivi);

        btnSuma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar1 = new Intent(operaciones.this, suma.class);
                startActivity(pasar1);

            }
        });

        btnResta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar2 = new Intent(operaciones.this, resta.class);
                startActivity(pasar2);
            }
        });

        btnMulti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar3 = new Intent(operaciones.this, multi.class);
                startActivity(pasar3);

            }
        });

        btnDivi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar4 = new Intent(operaciones.this, divi.class);
                startActivity(pasar4);
            }
        });
    }
}
