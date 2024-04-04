package Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.bottommenu.Menu_Jajargenjang;
import com.example.bottommenu.Menu_Lingkaran;
import com.example.bottommenu.Menu_PPanjang;
import com.example.bottommenu.Menu_Persegi;
import com.example.bottommenu.Menu_Segititga;
import com.example.bottommenu.R;

public class Menu1 extends Fragment {
    public Menu1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.menu1, container, false);

        Button btnPersegi = view.findViewById(R.id.btnPersegi);
        Button btnPPanjang = view.findViewById(R.id.btnPPanjang);
        Button btnJajargenjang = view.findViewById(R.id.btnJajargenjang);
        Button btnSegitiga = view.findViewById(R.id.btnSegitiga);
        Button btnLingkaran = view.findViewById(R.id.btnLingkaran);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu_Persegi.class);
                startActivity(intent);
            }
        });

        btnPPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu_PPanjang.class);
                startActivity(intent);
            }
        });

        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu_Jajargenjang.class);
                startActivity(intent);
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu_Segititga.class);
                startActivity(intent);
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu_Lingkaran.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
