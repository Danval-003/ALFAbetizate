package com.example.alfabetizate;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    MediaPlayer md1, md2, md3, md4, md5, md6, md7, md8, md9, md10, md11, md12, md13, md14, md15, md16,md17, md18, md19, md20, md21, md22, md23, md24, md25, md26, md27 ;
    Button btnAct, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16,btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnAct=(Button) findViewById(R.id.button32);
        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this, Test1.class);
                startActivity(i);
            }
        });
        btn1 = (Button) findViewById(R.id.button14);
        md1 = MediaPlayer.create(this, R.raw.a);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md1.start();
            }
        });
        btn2 = (Button) findViewById(R.id.button15);
        md2 = MediaPlayer.create(this, R.raw.b);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md2.start();
            }
        });
        btn3 = (Button) findViewById(R.id.button16);
        md3 = MediaPlayer.create(this, R.raw.c);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md3.start();
            }
        });
        btn4 = (Button) findViewById(R.id.button17);
        md4 = MediaPlayer.create(this, R.raw.d);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md4.start();
            }
        });
        btn5 = (Button) findViewById(R.id.button18);
        md5 = MediaPlayer.create(this, R.raw.e);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md5.start();
            }
        });
        btn6 = (Button) findViewById(R.id.button19);
        md6 = MediaPlayer.create(this, R.raw.f);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md6.start();
            }
        });
        btn7 = (Button) findViewById(R.id.button20);
        md7 = MediaPlayer.create(this, R.raw.g);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md7.start();
            }
        });
        btn8 = (Button) findViewById(R.id.button21);
        md8 = MediaPlayer.create(this, R.raw.h);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md8.start();
            }
        });
        btn9 = (Button) findViewById(R.id.button22);
        md9 = MediaPlayer.create(this, R.raw.i);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md9.start();
            }
        });
        btn10 = (Button) findViewById(R.id.button23);
        md10 = MediaPlayer.create(this, R.raw.j);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md10.start();
            }
        });
        btn11 = (Button) findViewById(R.id.button24);
        md11 = MediaPlayer.create(this, R.raw.k);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md11.start();
            }
        });
        btn12 = (Button) findViewById(R.id.button25);
        md12 = MediaPlayer.create(this, R.raw.l);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md12.start();
            }
        });
        btn13 = (Button) findViewById(R.id.button26);
        md13 = MediaPlayer.create(this, R.raw.m);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md13.start();
            }
        });
        btn14 = (Button) findViewById(R.id.button27);
        md14 = MediaPlayer.create(this, R.raw.n);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md14.start();
            }
        });
        btn15 = (Button) findViewById(R.id.button7);
        md15 = MediaPlayer.create(this, R.raw.nn);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md15.start();
            }
        });
        btn16 = (Button) findViewById(R.id.button8);
        md16 = MediaPlayer.create(this, R.raw.o);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md16.start();
            }
        });
        btn17 = (Button) findViewById(R.id.button9);
        md17 = MediaPlayer.create(this, R.raw.p);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md17.start();
            }
        });
        btn18 = (Button) findViewById(R.id.button10);
        md18 = MediaPlayer.create(this, R.raw.q);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md18.start();
            }
        });
        btn19 = (Button) findViewById(R.id.button11);
        md19 = MediaPlayer.create(this, R.raw.r);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md19.start();
            }
        });
        btn20 = (Button) findViewById(R.id.button12);
        md20 = MediaPlayer.create(this, R.raw.s);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md20.start();
            }
        });
        btn21 = (Button) findViewById(R.id.button13);
        md21 = MediaPlayer.create(this, R.raw.t);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md21.start();
            }
        });
        btn22 = (Button) findViewById(R.id.button6);
        md22 = MediaPlayer.create(this, R.raw.u);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md22.start();
            }
        });
        btn23 = (Button) findViewById(R.id.button4);
        md23 = MediaPlayer.create(this, R.raw.v);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md23.start();
            }
        });
        btn24 = (Button) findViewById(R.id.button28);
        md24 = MediaPlayer.create(this, R.raw.w);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md24.start();
            }
        });
        btn25 = (Button) findViewById(R.id.button29);
        md25 = MediaPlayer.create(this, R.raw.x);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md25.start();
            }
        });
        btn26 = (Button) findViewById(R.id.button30);
        md26 = MediaPlayer.create(this, R.raw.y);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md26.start();
            }
        });
        btn27 = (Button) findViewById(R.id.button31);
        md27 = MediaPlayer.create(this, R.raw.z);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                md27.start();
            }
        });


    }
}