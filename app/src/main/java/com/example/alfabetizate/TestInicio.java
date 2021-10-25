package com.example.alfabetizate;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TestInicio extends AppCompatActivity {

    private Bundle savedInstanceState;
    MediaPlayer md1;
    MediaPlayer md2;
    MediaPlayer md3;
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_inicio);
        btn1 = (ImageButton) findViewById(R.id.imageButton2);
        md1 = MediaPlayer.create(this, R.raw.o);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md1.start();
            }
        });
        btn2 = (ImageButton) findViewById(R.id.imageButton5);
        md2 = MediaPlayer.create(this, R.raw.e);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md2.start();
            }
        });
        btn3 = (ImageButton) findViewById(R.id.imageButton7);
        md3 = MediaPlayer.create(this, R.raw.u);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md3.start();
            }
        });

        Button j= (Button) findViewById(R.id.Fin);
        j.setOnClickListener(this::onClick);
    }
    public void onClick(View v){
        Intent i = new Intent(TestInicio.this, menu.class);
        startActivity(i);


    }
}