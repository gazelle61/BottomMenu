package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menu_Kerucut extends AppCompatActivity {
    TextView judul;
    EditText jari1;
    EditText jari2;
    EditText tinggi;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_kerucut);

        jari1 = findViewById(R.id.jari1);
        jari2 = findViewById(R.id.jari2);
        tinggi = findViewById(R.id.tinggi);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuasKerucut();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar9);

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    private void logout() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void  hitungLuasKerucut(){
        String jari1Str = jari1.getText().toString();
        String jari2Str = jari2.getText().toString();
        String tinggiStr = tinggi.getText().toString();

        if(!jari1Str.isEmpty() && !jari2Str.isEmpty() && !tinggiStr.isEmpty()){
            double jari1 = Double.parseDouble(jari1Str);
            double jari2 = Double.parseDouble(jari2Str);
            double tinggiValue = Double.parseDouble(tinggiStr);

            double luas = (1.0/3.0) * Math.PI * jari1 * jari2 * tinggiValue;
            txtResult.setText(String.valueOf(luas));
        }else {
            Toast.makeText(this, "Masukkan nilai jari-jari dan tinggi", Toast.LENGTH_LONG).show();
        }
    }
}
