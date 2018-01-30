package com.example.lieberson.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView jogar;
    private String[] opcao = {"cara, coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.botaoJogarId);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int numeroAleatorio = random.nextInt(2);

                //opcao[numeroAleatorio]
                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);


            }
        });





    }
}
