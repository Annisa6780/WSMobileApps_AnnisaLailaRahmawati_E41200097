package com.example.listpoltek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoPoltek;
    TextView textViewNamaPoltek, textViewInfoPoltek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoPoltek = findViewById(R.id.imageViewFotoPoltek);
        textViewNamaPoltek = findViewById(R.id.textViewNamaPoltek);
        textViewInfoPoltek = findViewById(R.id.textViewInfoPoltek);

        getIncomingExtra();

    }

    private void getIncomingExtra() {
    //melakukan cek
        if (getIntent().hasExtra("gambar_poltek")&& getIntent().hasExtra("nama_poltek")&& getIntent().hasExtra("info_poltek")) {
           //mengambil data
            String gambarPoltek = getIntent().getStringExtra("gambar_poltek");
            String namaPoltek = getIntent().getStringExtra("nama_poltek");
            String infoPoltek = getIntent().getStringExtra("info_poltek");

            setDataActivity(gambarPoltek, namaPoltek, infoPoltek);
        }
    }

    private void setDataActivity(String gambarPoltek, String namaPoltek, String infoPoltek) {

        Glide.with(this).asBitmap().load(gambarPoltek).into(imageViewFotoPoltek);
        textViewNamaPoltek.setText(namaPoltek);
        textViewInfoPoltek.setText(infoPoltek);

    }

}