package com.example.projeto_treinamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonRecycler;
    private Button buttonRecyclerCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRecycler = findViewById(R.id.buttonRecycler);
        buttonRecyclerCard = findViewById(R.id.buttonCard);

        buttonRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity_Recycler_View.class);
                startActivity(i);
            }
        });
        buttonRecyclerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivityRecyclerViewCard.class);
                startActivity(i);
            }
        });
    }
}