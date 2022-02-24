package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        TextView texto = findViewById(R.id.textResultado);//pega o id que configuramos
        String[] frases = {
                "Bom dia",
                "Boa noite",
                "Boa semana",
                "Vai dormir",
                "Tchau",
        };
        //Random gera numeros aleatorios
        int numero = new Random().nextInt(5);//5 numeros aleatorios 0 a 4(5)
        texto.setText(frases[numero]);
    }
}