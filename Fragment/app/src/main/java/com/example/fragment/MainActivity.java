package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation; //mendeklarasikan bottom navigation


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk menambahkan item menu dalam kode
        bottomNavigation = findViewById(R.id.bottom_navigasi);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChatFragment()).commit();

        //untuk mengakses ketika item bottom navigasi di klik
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null; //membuat objek dari fragment dan memberi nilai awal 0

                //untuk memberkan kodisi switch case yang nantinya bila diklik
                //akan menampilkan fragment
                switch (item.getItemId()) {
                    case R.id.nav_chats:
                        selectedFragment = new ChatFragment();
                        break;
                    case R.id.nav_status:
                        selectedFragment = new StatusFragment();
                        break;
                    case R.id.nav_call:
                        selectedFragment = new CallsFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;
            }
        });
    }
}