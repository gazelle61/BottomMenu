package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Persegi extends AppCompatActivity {

    TextView judul;
    EditText sisi1;
    EditText sisi2;
    Button btnKalkulasi;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_persegi);

        sisi1 = findViewById(R.id.sisi1);
        sisi2 = findViewById(R.id.sisi2);
        btnKalkulasi = findViewById(R.id.btnKalkulasi);
        txtResult = findViewById(R.id.txtResult);

        btnKalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {hitungLuasPersegi();
            }
        });

        Button btnKeluar = findViewById(R.id.btnKeluar);

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

    private void  hitungLuasPersegi(){
        String sisi1Str = sisi1.getText().toString();
        String sisi2Str = sisi2.getText().toString();

        if(!sisi1Str.isEmpty() && !sisi2Str.isEmpty()){
            double sisi1 = Double.parseDouble(sisi1Str);
            double sisi2 = Double.parseDouble(sisi2Str);

            double luas = sisi1 * sisi2;
            txtResult.setText(String.valueOf(luas));
        }else {
            Toast.makeText(this, "Masukkan nilai sisi", Toast.LENGTH_LONG).show();
        }
    }

}
