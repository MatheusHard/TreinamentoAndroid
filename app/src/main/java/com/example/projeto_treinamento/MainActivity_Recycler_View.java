package com.example.projeto_treinamento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.projeto_treinamento.R;
import com.example.projeto_treinamento.adapters.AdapterPrimeiro;
import com.example.projeto_treinamento.adapters.recycler_on_click.RecyclerItemClickListener;
import com.example.projeto_treinamento.models.Filme;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity_Recycler_View extends AppCompatActivity{

    private RecyclerView recyclerViewPrimeiro;
    private List<Filme> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler_view);

        this.criarFilmes();
        recyclerViewPrimeiro = findViewById(R.id.recyclerViewPrimeiro);

        AdapterPrimeiro adapterPrimeiro = new AdapterPrimeiro(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewPrimeiro.setLayoutManager(layoutManager);
        recyclerViewPrimeiro.setHasFixedSize(true);
        recyclerViewPrimeiro.setAdapter(adapterPrimeiro);
        recyclerViewPrimeiro.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerViewPrimeiro.addOnItemTouchListener(
        new RecyclerItemClickListener(
                getApplicationContext(),
                recyclerViewPrimeiro,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Filme f = list.get(position);
                        Intent i = new Intent(MainActivity_Recycler_View.this, MainActivityRecerDados.class);
                        //Bundle bundle = new Bundle();
                        //bundle.putSerializable("filme", f);
                        //i.putExtras(bundle);
                        i.putExtra("filme", f);
                        startActivity(i);

                        Toast.makeText(getApplicationContext(), "TESTES"+ f.getTitle(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }
        )
        );
    }

    public void criarFilmes(){

        Filme f1 = new Filme("Rei LEao", "anime", "2000");
        Filme f2 = new Filme("A Coisa", "ficcao", "2001");
        Filme f3 = new Filme("Voltados Mortos Vivos", "terror", "1986");
        Filme f4 = new Filme("Silent Hill", "terror", "1986");
        Filme f5 = new Filme("Joe e as BAratas", "terror", "1986");
        Filme f6 = new Filme("Tubarao", "terror", "1986");

        this.list.add(f1);
        this.list.add(f2);
        this.list.add(f3);
        this.list.add(f4);
        this.list.add(f5);
        this.list.add(f6);



    }



}




















