package com.example.alfabetizate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class botonInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_inicio);
        
        Button hablarAhoraButton = findViewById(R.id.Btt);
        hablarAhoraButton.setOnClickListener(this::onClick);

    }

    public void onClick(View v){
        Intent i = new Intent(botonInicio.this, TestInicio.class);
        startActivity(i);
    }
}