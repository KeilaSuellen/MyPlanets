package com.example.myplanets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarPlanetasActivity extends AppCompatActivity {

    TextView txtRecebeNomePlanetas;
    ImageView imgRecebePlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_planetas_layout);

        txtRecebeNomePlanetas = findViewById(R.id.txtRecebeNomePlaneta);
        imgRecebePlanetas = findViewById(R.id.imgRecebePlaneta);


        Intent intent = getIntent();


        String nome = intent.getStringExtra("nome_planeta");
        int imagem = intent.getIntExtra("imagem_planeta", 0);


        txtRecebeNomePlanetas.setText(nome);
        imgRecebePlanetas.setImageResource(imagem);

        
    }
}