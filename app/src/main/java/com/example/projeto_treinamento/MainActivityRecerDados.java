package com.example.projeto_treinamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

import com.example.projeto_treinamento.models.Filme;

public class MainActivityRecerDados extends AppCompatActivity {

    private TextView textViewT;
    private TextView textViewG;
    private TextView textViewY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recer);
        textViewT = findViewById(R.id.textViewTitleR);
        textViewG = findViewById(R.id.textViewGenderR);
        textViewY = findViewById(R.id.textViewYearR);

        Filme f = (Filme) getIntent().getExtras().getSerializable("filme");
        textViewT.setText(f.getTitle());
        textViewG.setText(f.getGender());
        textViewY.setText(f.getYear());

    }


}