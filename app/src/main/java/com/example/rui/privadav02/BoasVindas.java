package com.example.rui.privadav02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BoasVindas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_boas_vindas);///alterar isto layout_1recyclerview para este layout_1recyclerview
        Thread logoTimer = new Thread(){
            public void  run(){
                try {
                    sleep (3000); //// ao fim de 5 segundos a aplicação adormece
                    Intent boasvindas = new Intent("com.exemple.rui.PRIVADA");
                    startActivity(boasvindas);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();

                }
            }

        };
        logoTimer.start();
    }
}

///// creditos https://www.youtube.com/watch?annotation_id=annotation_890738&feature=iv&index=8&list=PLB03EA9545DD188C3&src_vid=sWOXbDYwIXo&v=P4PqZKmQjjs