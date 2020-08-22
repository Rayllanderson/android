package com.rayllanderson.new_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        txtResultado = findViewById(R.id.txtResult);
    }

    public void calcular(View v){
       try{
           double precoAlcool = Double.parseDouble(this.editPrecoAlcool.getText().toString());
           double precoGasolina = Double.parseDouble(this.editPrecoGasolina.getText().toString());
           if ((precoAlcool/precoGasolina) >= 0.7){
               this.txtResultado.setText("Melhor usar Gasolina!");
           }else this.txtResultado.setText("Melhor usar Álcool!");
       }catch (NumberFormatException e){
           this.txtResultado.setText("Um ou mais campos estão vazios");
       }
    }



}