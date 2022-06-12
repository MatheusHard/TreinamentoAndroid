package com.example.projeto_treinamento.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_treinamento.R;
import com.example.projeto_treinamento.models.Filme;

import java.util.List;

public class AdapterPrimeiro extends RecyclerView.Adapter<AdapterPrimeiro.MyViewHolder> {
 private List<Filme> list;
    public AdapterPrimeiro(List<Filme> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista_filmes, parent, false);


        return new MyViewHolder(itemList) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    //Exibir os itens:

        Filme f = list.get(position);
        holder.title.setText(f.getTitle());
        holder.year.setText(f.getYear());
        holder.gender.setText(f.getGender());
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView year;
        TextView gender;

        public MyViewHolder(@NonNull View itemView) {


            super(itemView);
            title = itemView.findViewById(R.id.textViewTitle);
            year = itemView.findViewById(R.id.textViewYear);
            gender = itemView.findViewById(R.id.textViewGender);

        }
    }

}



