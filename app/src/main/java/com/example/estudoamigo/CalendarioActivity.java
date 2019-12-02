package com.example.estudoamigo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class CalendarioActivity extends AppCompatActivity {

    CalendarView calendar;
    EditText edt;
    TextView txt;
    Button btn;

    int anoAtual;
    int mesAtual;
    int diaAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        calendar = findViewById(R.id.calendarView);
        edt = findViewById(R.id.edt);
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);

        //Escutador de eventos do calendario
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                btn.setVisibility(View.VISIBLE);
                edt.setVisibility(View.VISIBLE);

                anoAtual = year;
                mesAtual = month;
                diaAtual = day;

                updateCalendar();
            }
        });
    }

    //Salvar mensagem de determinado dia
    public void addDay (View v) {
        if(((App) this.getApplication()).getMsg(anoAtual, mesAtual, diaAtual).equals("")) {
            ((App) this.getApplication()).addDia(anoAtual, mesAtual, diaAtual, edt.getText().toString());
        }
        edt.setText("");
        updateCalendar();
    }

    //Mostrar a mensagem do dia selecionado
    public void updateCalendar() {
        txt.setText(((App) this.getApplication()).getMsg(anoAtual, mesAtual, diaAtual));
    }
}
