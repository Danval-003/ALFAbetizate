package com.example.alfabetizate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class TestInicio extends AppCompatActivity {

    private Bundle savedInstanceState;
    MediaPlayer md1;
    MediaPlayer md2;
    MediaPlayer md3;
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    private RadioGroup z;
    private RadioGroup k;
    private RadioGroup d;
    private Integer elec1=null;
    private Integer elec2=null;
    private Integer elec3=null;
    private final Context context= this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        SharedPreferences sharprefs= getSharedPreferences("ArchivoSP", MODE_PRIVATE);

        setContentView(R.layout.activity_test_inicio);
        Button j= (Button) findViewById(R.id.Fin);
        z= (RadioGroup) findViewById(R.id.radioGroup23);
        k= (RadioGroup) findViewById(R.id.radioGroup2);
        d= (RadioGroup) findViewById(R.id.radioGroup3);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elec1 = z.getCheckedRadioButtonId();
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elec2 = k.getCheckedRadioButtonId();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elec3 = d.getCheckedRadioButtonId();
                System.out.println(elec3);
            }
        });
        j.setOnClickListener(this::onClick);

    }
    public void onClick(View v){
        elec1 = z.getCheckedRadioButtonId();
        elec2 = k.getCheckedRadioButtonId();
        elec3 = d.getCheckedRadioButtonId();
        System.out.println(elec3);
        if(elec1!=null&&elec2!=null&&elec3!=null){
            RadioButton oe=(RadioButton) findViewById(elec1);
            RadioButton oeq=(RadioButton) findViewById(elec3);
            RadioButton oq=(RadioButton) findViewById(elec2);
            SharedPreferences sharpref= getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor = sharpref.edit();
            editor.putString("Test","true,"+oe.getText()+","+oeq.getText()+","+oq.getText());

            Intent i = new Intent(TestInicio.this, menu.class);
            startActivity(i);

        }
    }

}