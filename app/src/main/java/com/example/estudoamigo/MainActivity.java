package com.example.estudoamigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) this.getApplication()).setLogin("aluno");
        ((App) this.getApplication()).setPassword("ifrs");

        edtName = findViewById(R.id.edtName);
        edtSenha = findViewById(R.id.edtPass);
    }

    //Checando se o login esta correto
    public void loginCheck(View v) {
        String login = edtName.getText().toString().toLowerCase();
        String senha = edtSenha.getText().toString().toLowerCase();

        if (login.equals(((App) this.getApplication()).getLogin()) && senha.equals(((App) this.getApplication()).getPassword())) {
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);
            this.finish();
        } else {
            Toast.makeText(this, "Login Incorreto", Toast.LENGTH_LONG).show();
        }
    }

    //Quando a tela ser finalizada
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Login Realizado com Sucesso", Toast.LENGTH_SHORT).show();
    }
}
