package com.example.projeto_treinamento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.projeto_treinamento.adapters.AdapterCardView;
import com.example.projeto_treinamento.adapters.AdapterPrimeiro;
import com.example.projeto_treinamento.models.Filme;
import com.example.projeto_treinamento.models.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivityRecyclerViewCard extends AppCompatActivity {

    private RecyclerView recyclerViewCard;
    private List<Postagem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler_view_card);
        recyclerViewCard = findViewById(R.id.recyclerViewCard);
        this.criarPostagens();

        AdapterCardView adapterCardView = new AdapterCardView(this.list);

        //Layout Normal:
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //Layout Grid:
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(this, 2);
        recyclerViewCard.setLayoutManager(layoutManager);
        recyclerViewCard.setHasFixedSize(true);
        recyclerViewCard.setAdapter(adapterCardView);
    }

    private void criarPostagens() {

        Postagem f1 = new Postagem("MErcadinho Assis", "Promocoes", R.drawable.image_1);
        Postagem f2 = new Postagem("Restaurante Sabor d Mae", "Quentnhas", R.drawable.image_2);
        Postagem f3 = new Postagem("Bradesco", "Banco", R.drawable.image_5);

        this.list.add(f1);
        this.list.add(f2);
        this.list.add(f3);
        }
}