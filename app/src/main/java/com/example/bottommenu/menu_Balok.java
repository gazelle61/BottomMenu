package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menu_Balok extends AppCompatActivity {

    TextView judul;
    EditText panjang;
    EditText lebar;
    EditText tinggi;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_balok);

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        tinggi = findViewById(R.id.tinggi);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungVolumeBalok();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar7);

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

    private void hitungVolumeBalok() {
        String panjangStr = panjang.getText().toString();
        String lebarStr = lebar.getText().toString();
        String tinggiStr = tinggi.getText().toString();

        if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
            double panjangValue = Double.parseDouble(panjangStr);
            double lebarValue = Double.parseDouble(lebarStr);
            double tinggiValue = Double.parseDouble(tinggiStr);

            double volume = panjangValue * lebarValue * tinggiValue;
            txtResult.setText(String.valueOf(volume));
        } else {
            Toast.makeText(this, "Masukkan nilai untuk panjang, lebar, dan tinggi", Toast.LENGTH_LONG).show();
        }
    }
}
