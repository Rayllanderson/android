package com.rayllanderson.sorteio;

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

    public void selecionarBotao(View v){
        int n = new Random().nextInt(101);
        TextView txtResult = findViewById(R.id.txtResult); //pegando o id
        txtResult.setText("O Número sorteado foi: " + n);
    }
}