package com.example.alfabetizate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TestInicio extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_inicio);
        Button j= (Button) findViewById(R.id.Fin);
        j.setOnClickListener(this::onClick);
    }
    public void onClick(View v){
        Intent i = new Intent(TestInicio.this, menu.class);
        startActivity(i);
    }
}