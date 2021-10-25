package com.example.alfabetizate;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    MediaPlayer md1, md2, md3, md4, md5, md6, md7, md8, md9, md10, md11, md12, md13, md14, md15, md16,md17, md18, md19, md20, md21, md22, md23, md24, md25, md26, md27 ;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16,btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn1 = (ImageButton) findViewById(R.id.button);
        md1 = MediaPlayer.create(this, R.raw.o);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md1.start();
            }
        });
    }
}