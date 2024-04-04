package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menu_Kubus extends AppCompatActivity {
    TextView judul;
    EditText sisi1;
    EditText sisi2;
    EditText sisi3;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_kubus);

        sisi1 = findViewById(R.id.sisi1);
        sisi2 = findViewById(R.id.sisi2);
        sisi3 = findViewById(R.id.sisi3);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungVolumeKubus();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar6);

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

    private void hitungVolumeKubus() {
        String sisi1Str = sisi1.getText().toString();
        String sisi2Str = sisi2.getText().toString();
        String sisi3Str = sisi3.getText().toString();

        if (!sisi1Str.isEmpty() && !sisi2Str.isEmpty() && !sisi3Str.isEmpty()) {
            double sisi1Value = Double.parseDouble(sisi1Str);
            double sisi2Value = Double.parseDouble(sisi2Str);
            double sisi3Value = Double.parseDouble(sisi3Str);

            double volume = sisi1Value * sisi2Value * sisi3Value;
            txtResult.setText(String.valueOf(volume));
        } else {
            Toast.makeText(this, "Masukkan nilai untuk semua sisi", Toast.LENGTH_LONG).show();
        }
    }
}
