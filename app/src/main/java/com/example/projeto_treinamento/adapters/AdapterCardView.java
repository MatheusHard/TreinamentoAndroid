package com.example.projeto_treinamento.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_treinamento.R;
import com.example.projeto_treinamento.models.Filme;
import com.example.projeto_treinamento.models.Postagem;

import java.util.ArrayList;
import java.util.List;

public class AdapterCardView extends RecyclerView.Adapter<AdapterCardView.MyViewHolder> {
    private List<Postagem> list = new ArrayList<>();;
    public AdapterCardView(List<Postagem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterCardView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_adapter, parent, false);


        return new MyViewHolder(itemList) ;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCardView.MyViewHolder holder, int position) {
        //Exibir os itens:

        Postagem p = list.get(position);
        holder.titleCard.setText(p.getTitle());
        holder.subTitleCard.setText(p.getSubTitle());
        holder.imageViewCard.setImageResource(p.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView titleCard;
        private TextView subTitleCard;
        private ImageView imageViewCard;

        public MyViewHolder(@NonNull View itemView) {


            super(itemView);
            titleCard = itemView.findViewById(R.id.textViewTitle_2);
            subTitleCard = itemView.findViewById(R.id.textViewSubTitle_2);
            imageViewCard = itemView.findViewById(R.id.imageViewTestes);

        }
    }

}



