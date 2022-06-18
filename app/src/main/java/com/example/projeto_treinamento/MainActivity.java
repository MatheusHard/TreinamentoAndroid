package com.example.projeto_treinamento;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button buttonSnack;
    private Button buttonRecyclerCard;
    private Button buttonRecycler;
    private Button buttonDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.identificadores();

        buttonRecycler.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity_Recycler_View.class);
            startActivity(i);
        });
        buttonRecyclerCard.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivityRecyclerViewCard.class);
            startActivity(i);
        });
      buttonSnack.setOnClickListener(view -> {
          //Snack :
          Snackbar.make(
                  view,
                  "Snack Barr",
                  Snackbar.LENGTH_SHORT
          ).show();


      });
      buttonDrawer.setOnClickListener(view -> {
          Intent i = new Intent(MainActivity.this, MainActivityNavigationDrawer.class);
          startActivity(i);

      });

    }
    private void identificadores(){

        buttonRecycler = findViewById(R.id.buttonRecycler);
        buttonRecyclerCard = findViewById(R.id.buttonCard);
        buttonSnack = findViewById(R.id.buttonSnack);
        buttonDrawer = findViewById(R.id.buttonDrawer);
    }
}