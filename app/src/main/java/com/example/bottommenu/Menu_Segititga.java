package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Segititga extends AppCompatActivity {
    TextView judul;
    EditText alas;
    EditText tinggi;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_segitiga);

        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuasSegitiga();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar4);

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {logout();}
        });
    }

    private void logout() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void  hitungLuasSegitiga(){
        String alasStr = alas.getText().toString();
        String tinggiStr = tinggi.getText().toString();

        if(!alasStr.isEmpty() && !tinggiStr.isEmpty()){
            double alas = Double.parseDouble(alasStr);
            double tinggi = Double.parseDouble(tinggiStr);

            double luas = 0.5 * alas * tinggi;
            txtResult.setText(String.valueOf(luas));
        }else {
            Toast.makeText(this, "Masukkan nilai alas dan tinggi", Toast.LENGTH_SHORT).show();
        }
    }
}
