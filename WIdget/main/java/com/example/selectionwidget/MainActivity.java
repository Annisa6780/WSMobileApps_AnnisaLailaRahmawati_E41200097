package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    //membuat data smp untuk autocomplete
    private  static final  String[] smp = new String[] {
            "SMP Negeri 1 Candi", "SMP Negeri 2 Candi", "SMP Negeri 3 Candi",
            "SMP Negeri 1 Sidoarjo", "SMP Negeri 2 Sidoarjo", "SMP Negeri 4 Sidoarjo",
            "SMP Negeri 5 Sidoarjo", "Smp Negeri 6 Sidoarjo"
    };

    //pendeklarasian spinner
    Spinner spinner;

    //pendeklarasian listview
    ListView listViewJurusan;

    @Override
    //untuk menyiapkan dasar aktivitas yang akan dilakukan
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //autocomplete
        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapterAutoComplete = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, smp);
        editText.setAdapter(adapterAutoComplete);

    //spinner
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this, R.array.sma, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterSpinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?>  parent, View view, int i, long l) {
                String sma = parent.getItemAtPosition(i).toString();
                Toast.makeText(parent.getContext(), "Kamu Memilih " +sma, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    //listView
        listViewJurusan = findViewById(R.id.lvJur);
        String[] jurusan = {"IPA", "IPS", "BAHASA"};
        ArrayAdapter<String>jurusanAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, jurusan);
        listViewJurusan.setAdapter(jurusanAdapter);

        listViewJurusan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String jurusan = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(), "Jurusan yang kamu pilih " +jurusan, Toast.LENGTH_SHORT).show();
            }
        });
    }
}