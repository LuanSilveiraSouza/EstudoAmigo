package com.example.estudoamigo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void clickTema (View v) {
        Intent i = new Intent (this, TemaActivity.class);
        startActivity(i);
    }

    public void clickCalendario (View v) {
        Intent i = new Intent(this, CalendarioActivity.class);
        startActivity(i);
    }

    public void clickNota(View v) {
        Intent i = new Intent(this, NotaActivity.class);
        startActivity(i);
    }

    //Quando o botao de voltar do android for pressionado
    public void onBackPressed(){
        AlertDialog.Builder adBuilder = new AlertDialog.Builder(this);
        adBuilder.setMessage("Você está prestes a fechar o App. Tem certeza disso ?");
        adBuilder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        adBuilder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = adBuilder.create();
        alertDialog.show();
    }
}
