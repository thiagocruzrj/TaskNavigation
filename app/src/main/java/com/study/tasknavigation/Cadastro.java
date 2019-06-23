package com.study.tasknavigation;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cadastro(View view){
        AlertDialog.Builder msg = new AlertDialog.Builder(Cadastro.this);
        msg.setTitle("Cadastro");
        msg.setMessage("Cadastro Relatizado com Sucesso !");
        msg.show();
    }

    public void voltar (View view){
        Intent i = new Intent();
        i.setClass(Cadastro.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
