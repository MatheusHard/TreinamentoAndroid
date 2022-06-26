package com.example.projeto_treinamento.ui.recycler_view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_treinamento.R;
import com.example.projeto_treinamento.adapters.AdapterPrimeiro;
import com.example.projeto_treinamento.adapters.recycler_on_click.RecyclerItemClickListener;
import com.example.projeto_treinamento.models.Filme;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerViewPrimeiro;
    private List<Filme> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.activity_main_recycler_view, container, false);

        this.criarFilmes();
        recyclerViewPrimeiro = view.findViewById(R.id.recyclerViewPrimeiro);

        AdapterPrimeiro adapterPrimeiro = new AdapterPrimeiro(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewPrimeiro.setLayoutManager(layoutManager);
        recyclerViewPrimeiro.setHasFixedSize(true);
        recyclerViewPrimeiro.setAdapter(adapterPrimeiro);
        recyclerViewPrimeiro.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));

        recyclerViewPrimeiro.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getContext(),
                        recyclerViewPrimeiro,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filme f = list.get(position);
                             //   Intent i = new Intent(MainActivity_Recycler_View.this, MainActivityRecerDados.class);
                                //Bundle bundle = new Bundle();
                                //bundle.putSerializable("filme", f);
                                //i.putExtras(bundle);
                              //  i.putExtra("filme", f);
                                //startActivity(i);

                                Toast.makeText(getContext(), "TESTES"+ f.getTitle(), Toast.LENGTH_LONG).show();
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
        return view;
    }

    public void criarFilmes(){

        Filme f1 = new Filme("Rei LEao", "anime", 2000);
        Filme f2 = new Filme("A Coisa", "ficcao", 2001);
        Filme f3 = new Filme("Voltados Mortos Vivos", "terror", 1986);
        Filme f4 = new Filme("Silent Hill", "terror", 1986);
        Filme f5 = new Filme("Joe e as BAratas", "terror", 1986);
        Filme f6 = new Filme("Tubarao", "terror", 1986);

        this.list.add(f1);
        this.list.add(f2);
        this.list.add(f3);
        this.list.add(f4);
        this.list.add(f5);
        this.list.add(f6);



    }



}

