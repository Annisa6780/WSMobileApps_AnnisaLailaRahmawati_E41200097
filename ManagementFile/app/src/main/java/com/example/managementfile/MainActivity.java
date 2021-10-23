package com.example.managementfile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    //memamggil sebuah fungsi
    EditText editText;
    private int STORAGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText2); //findviewbyid = (untuk fragment yang menyediakan UI dalam layout activity)
    }

    //membuat method ketika menekan tombol next
    public void next(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    //membuat method ketika menyimpan di public
    public void  savePublic (View view) {
        //permission to access external storage
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
        String info = editText.getText().toString();
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS); //Folder name
        File myFile = new File(folder, "myData1.txt"); //filename
        writeData(myFile, info);
        editText.setText("");
    }

    //membuat method ketika menyimpan ata secara private
    public void savePrivate (View view) {
        String info = editText.getText().toString();
        File folder = getExternalFilesDir("Ila");//folder name
        File myFile = new File(folder, "myData2.txt"); // filename
        writeData(myFile, info);
        editText.setText("");
    }

    //membuat method ketika menuliskan data
    private void  writeData (File myFile, String data) {
        FileOutputStream fileOutputStream = null;
        try {
            System.out.println("Tes");
            fileOutputStream = new FileOutputStream(myFile);
                fileOutputStream.write(data.getBytes());
                Toast.makeText(this, "Done" + myFile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}