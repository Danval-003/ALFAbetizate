package com.example.alfabetizate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class botonInicio extends AppCompatActivity {

    TTSManager ttsManager=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_inicio);

        ttsManager= new TTSManager();
        ttsManager.init(this);

        Button hablarAhoraButton = findViewById(R.id.Btt);
        hablarAhoraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = "Hola mundo";
                ttsManager.initQueue(texto);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

    public void onClick(View v){
        Intent i = new Intent(botonInicio.this, TestInicio.class);
        startActivity(i);
    }
}