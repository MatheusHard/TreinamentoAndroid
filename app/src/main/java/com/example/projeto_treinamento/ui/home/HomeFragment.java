package com.example.projeto_treinamento.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_treinamento.R;
import com.example.projeto_treinamento.databinding.FragmentHomeBinding;
import com.example.projeto_treinamento.models.Postagem;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private RecyclerView recyclerViewCard;
    private List<Postagem> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /**********
        recyclerViewCard = root.findViewById(R.id.recyclerViewCard);
        this.criarPostagens();

        AdapterCardView adapterCardView = new AdapterCardView(this.list);

        //Layout Normal:
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //Layout Grid:
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(getActivity(), 2);
        recyclerViewCard.setLayoutManager(layoutManager);
        recyclerViewCard.setHasFixedSize(true);
        recyclerViewCard.setAdapter(adapterCardView);*/

        final TextView textView = binding.textHome;

        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
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