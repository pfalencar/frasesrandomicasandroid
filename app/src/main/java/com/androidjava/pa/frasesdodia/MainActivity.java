package com.androidjava.pa.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int numeroAnterior = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase (View view) {
        String[] frases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o asdifoasjdfoia jsdf",
                "Que o dia seja leve, que a tristeza seja breve e que o dia fjaosdifj aposdifopasidjf ",
                "Que o dia comece bem e termine ainda melhor.",
                "Pra hoje: sorrisos bobos, uma mente tranquila e um coração asdfjio oaisdofij aisjoi ",
                "Sempre que o sol nasce você tem uma nova oportunidade de  fai iasidf oiajsdfh"
        };

        int numeroAtual = new Random().nextInt(frases.length);


        while (numeroAtual == numeroAnterior) {
            numeroAtual = new Random().nextInt(frases.length);
        }

        TextView texto = findViewById(R.id.textView3);
        texto.setText(frases [numeroAtual]);
        numeroAnterior = numeroAtual;
    }
}
