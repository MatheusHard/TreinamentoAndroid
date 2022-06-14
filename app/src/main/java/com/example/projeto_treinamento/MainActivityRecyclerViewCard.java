package com.example.projeto_treinamento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.projeto_treinamento.adapters.AdapterCardView;
import com.example.projeto_treinamento.adapters.AdapterPrimeiro;

public class MainActivityRecyclerViewCard extends AppCompatActivity {

    private RecyclerView recyclerViewCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler_view_card);
        recyclerViewCard = findViewById(R.id.recyclerViewCard);

        AdapterCardView adapterCardView = new AdapterCardView();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewCard.setLayoutManager(layoutManager);
        recyclerViewCard.setHasFixedSize(true);
        recyclerViewCard.setAdapter(adapterCardView);
    }
}