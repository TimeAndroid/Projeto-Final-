package com.example.kaio.findpackrecycler.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kaio.findpackrecycler.Helpers.Clicavel;
import com.example.kaio.findpackrecycler.Helpers.ModeloBase;
import com.example.kaio.findpackrecycler.R;

import java.util.List;

public class KaioAdapter extends RecyclerView.Adapter<KaioAdapter.ViewHolder>{


    List<ModeloBase>listModelo;
    Context c;
    Clicavel clicavel;


    @NonNull
    @Override
    public KaioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.itemrecycler,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull KaioAdapter.ViewHolder holder, int position) {

        ModeloBase modeloBase = listModelo.get(position);
        holder.bind(modeloBase.getNome(),modeloBase.getTexto());

    }

    @Override
    public int getItemCount() {
        return listModelo.size();
    }

    public void setClicKlistener(Clicavel clicavel){
        this.clicavel=clicavel;
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{


        TextView text;
        TextView text2;


        public ViewHolder(View itemView) {
            super(itemView);

            text = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
            itemView.setTag(itemView);
            itemView.setOnClickListener((View.OnClickListener) this);
        }

        public void bind(String nome, String texto) {
            this.text = text;
            this.text2 = text2;

        }


        @Override
        public void onClick(View v) {
            if (clicavel != null) clicavel.onClick(v, getAdapterPosition());
        }


    }
}
