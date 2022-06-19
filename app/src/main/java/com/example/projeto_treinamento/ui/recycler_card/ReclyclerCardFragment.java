package com.example.projeto_treinamento.ui.recycler_card;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_treinamento.R;
import com.example.projeto_treinamento.adapters.AdapterCardView;
import com.example.projeto_treinamento.models.Postagem;

import java.util.ArrayList;
import java.util.List;

public class ReclyclerCardFragment extends Fragment {

    private RecyclerView recyclerViewCard;
    private List<Postagem> list = new ArrayList<>();

    public static ReclyclerCardFragment newInstance() {
        return new ReclyclerCardFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_main_recycler_view_card, container, false);

        recyclerViewCard = view.findViewById(R.id.recyclerViewCard);


        /********************************************/
        this.criarPostagens();

        AdapterCardView adapterCardView = new AdapterCardView(this.list);

        //Layout Normal:
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        //Layout Grid:
        //RecyclerView.LayoutManager layoutManager= new GridLayoutManager(getContext(), 2);
        recyclerViewCard.setLayoutManager(layoutManager);
        recyclerViewCard.setHasFixedSize(true);
        recyclerViewCard.setAdapter(adapterCardView);

        return view;
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