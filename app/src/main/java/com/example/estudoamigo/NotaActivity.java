package com.example.estudoamigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NotaActivity extends AppCompatActivity {

    EditText edt1;
    EditText edt2;
    EditText edt3;

    TextView txt;
    TextView txt2;
    float media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);

        txt = findViewById(R.id.res);
        txt2 = findViewById(R.id.res2);
    }

    //Calcular Media e Mostrar na tela
    public void calc(View v){
        float nota1 = Float.parseFloat(edt1.getText().toString());
        float nota2 = Float.parseFloat(edt2.getText().toString());
        float nota3 = Float.parseFloat(edt3.getText().toString());

        media = ((nota1 + nota2 + nota3) / 3);

        txt.setText("Nota final: "+ media);
        if(media >= 6) {
            txt2.setText("APROVADO");
        } else{
            txt2.setText("REPROVADO");
        }
    }

    //Recuperar o valor da media e mostrar na tela
    public void onResume() {
        super.onResume();
        media = ((App) this.getApplication()).getMedia();
        if(media != 0.0f) {
            txt.setText("Nota final: " + media);
            if(media >= 6) {
                txt2.setText("APROVADO");
            } else{
                txt2.setText("REPROVADO");
            }
        }
    }

    //Salvar o valor da media quando sair da tela
    public void onPause() {
        super.onPause();
        ((App) this.getApplication()).setMedia(media);
    }
}
