package com.study.tasknavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Publicacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacao);
    }

    public void voltar (View view){
        Intent i = new Intent();
        i.setClass(Publicacao.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
