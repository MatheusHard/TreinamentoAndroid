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

import java.util.List;

public class AdapterCardView extends RecyclerView.Adapter<AdapterCardView.MyViewHolder> {
    private List<Filme> list;
    //public AdapterCardView(List<Filme> list) {
      //  this.list = list;
    //}
    public AdapterCardView(){

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

        //Filme f = list.get(position);
        //holder.titleCard.setText(f.getTitle());
        holder.titleCard.setText("TITULO");
        holder.subTitleCard.setText("TEXTO SUB_TITULO");
        holder.imageViewCard.setImageResource(R.drawable.image_1);
    }

    @Override
    public int getItemCount() {
        return 6;
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



