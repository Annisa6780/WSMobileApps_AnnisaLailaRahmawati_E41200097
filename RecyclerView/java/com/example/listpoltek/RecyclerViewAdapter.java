package com.example.listpoltek;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private  ArrayList<String> gambarPoltek = new ArrayList<>();
    private  ArrayList<String> namaPoltek = new ArrayList<>();
    private  ArrayList<String> infoPoltek = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> gambarPoltek, ArrayList<String> namaPoltek, ArrayList<String> infoPoltek, Context context) {
        this.gambarPoltek = gambarPoltek;
        this.namaPoltek = namaPoltek;
        this.infoPoltek = infoPoltek;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //menambahkan layout yang sudah dibuat
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent,false);
        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        //memasukkan data per item
        Glide.with(context).asBitmap().load(gambarPoltek.get(position)).into(holder.gambarPoltek);
        holder.namaPoltek.setText(namaPoltek.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //untuk mencoba apakah dapat berjalan dengan baik
               // Toast.makeText(context, namaPoltek.get(position), Toast.LENGTH_SHORT).show();

                //untuk mengirimkan data
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("gambar_poltek", gambarPoltek.get(position));
            intent.putExtra("nama_poltek", namaPoltek.get(position));
            intent.putExtra("info_poltek", infoPoltek.get(position));

            context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaPoltek.size();
    }

    //untuk menentukan pemegang tampilan
    public class ViewHolder extends  RecyclerView.ViewHolder {
        //konstruktuktor
        CircleImageView gambarPoltek;
        TextView namaPoltek;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarPoltek = itemView.findViewById(R.id.gambarPoltek);
            namaPoltek = itemView.findViewById(R.id.namaPoltek);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }

}
