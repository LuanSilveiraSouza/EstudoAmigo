package com.example.estudoamigo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TemaActivity extends AppCompatActivity{

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        text = findViewById(R.id.edt);

    }

    //Quando iniciar a activity
    public void onStart() {
        super.onStart();
        text.setText(((App) this.getApplication()).getTemaText());
    }

    //Quando pausar a activity
    public void onStop() {
        super.onStop();
        ((App) this.getApplication()).setTemaText(text.getText().toString());
    }

    //Limpar EditText
    public void limpar(View v) {
        text.setText("");
    }

    //Salvar texto do EditText e retornar ao menu
    public void salvar(View v){
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

}
