package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Lingkaran extends AppCompatActivity {
    TextView judul;
    EditText jari1;
    EditText jari2;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_lingkaran);

        jari1 = findViewById(R.id.jari1);
        jari2 = findViewById(R.id.jari2);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuasLingkaran();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar5);

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

    private void  hitungLuasLingkaran(){
        String jari1Str = jari1.getText().toString();
        String jari2Str = jari2.getText().toString();

        if(!jari1Str.isEmpty() && !jari2Str.isEmpty()){
            double jari1 = Double.parseDouble(jari1Str);
            double jari2 = Double.parseDouble(jari2Str);

            double luas = Math.PI * jari1 * jari2;
            txtResult.setText(String.valueOf(luas));
        }else {
            Toast.makeText(this, "Masukkan nilai jari-jari", Toast.LENGTH_SHORT).show();
        }
    }
}
