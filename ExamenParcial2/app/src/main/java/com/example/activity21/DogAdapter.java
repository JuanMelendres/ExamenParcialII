package com.example.activity21;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.DogViewHolder>   {


    public static class DogViewHolder extends RecyclerView.ViewHolder{

        public TextView txtPerrito, txtPeso;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPerrito = itemView.findViewById(R.id.tvRowPerrito);
            txtPeso = itemView.findViewById(R.id.tvRowPeso);

        }
    }

    private ArrayList<Dog> perritos;
    private View.OnClickListener listener;

    public DogAdapter(ArrayList<Dog> amigos, View.OnClickListener listener){

        this.perritos = amigos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {

        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.row_friend, parent, false);

        final TextView nombrePerrito = v.findViewById(R.id.tvRowPerrito);
        final TextView pesoPerrito = v.findViewById(R.id.tvRowPeso);


        Button b = v.findViewById(R.id.btnPerrito);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "PERRITO: " + nombrePerrito.getText().toString() , Toast.LENGTH_SHORT).show();
            }
        });
        Button c = v.findViewById(R.id.btnPeso);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "PESO: " + pesoPerrito.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        v.setOnClickListener(listener);

        DogViewHolder svh = new DogViewHolder(v);
        return svh;
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {

        holder.txtPerrito.setText(perritos.get(position).getPerrito());
        holder.txtPeso.setText(perritos.get(position).getPeso());
    }

    @Override
    public int getItemCount() {
        return perritos.size();
    }


}