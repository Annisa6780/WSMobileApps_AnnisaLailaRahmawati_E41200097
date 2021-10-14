package com.example.intent;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//intent whatsapp guna untuk menyambungkan ke link whatsapp yang dituju
    public void Hubungi (View view) {
        String url = "https://api.whatsapp.com/send?phone=6281234261277&text=";
        Intent Hubungi = new Intent(Intent.ACTION_VIEW);
        Hubungi.setData(Uri. parse(url));
        startActivity(Hubungi);
    }
//explicit intent untuk berpindah halaman yang dituju
    public void Daftar (View view) {
        Intent SecondActivity = new Intent(MainActivity.this, com.example.intent.Daftar.class);
        startActivity(SecondActivity);
    }
}