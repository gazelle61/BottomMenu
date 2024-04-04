package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_PPanjang extends AppCompatActivity {
    TextView judul;
    EditText panjang;
    EditText lebar;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_ppanjang);

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuasPPanjang();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar2);

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

    private void  hitungLuasPPanjang(){
        String panjangStr = panjang.getText().toString();
        String lebarStr = lebar.getText().toString();

        if(!panjangStr.isEmpty() && !lebarStr.isEmpty()){
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);

            double luas = panjang * lebar;
            txtResult.setText(String.valueOf(luas));
        }else {
            Toast.makeText(this, "Masukkan nilai panjang dan lebar", Toast.LENGTH_SHORT).show();
        }
    }
}
