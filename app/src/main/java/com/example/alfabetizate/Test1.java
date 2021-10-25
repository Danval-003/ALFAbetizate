package com.example.alfabetizate;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


public class Test1 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_correcto);
        }

    public void respuestaCorrecta(View view) {
        Intent objI = new Intent(Test1.this,activityCorrecto.class);
        startActivity(objI);
    }

}

