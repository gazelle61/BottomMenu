package Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.bottommenu.R;
import com.example.bottommenu.menu_Balok;
import com.example.bottommenu.menu_Bola;
import com.example.bottommenu.menu_Kerucut;
import com.example.bottommenu.menu_Kubus;
import com.example.bottommenu.menu_Tabung;

public class Menu2 extends Fragment {
    public Menu2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.menu2, container, false);

        Button btnKubus = view.findViewById(R.id.btnKubus);
        Button btnBalok = view.findViewById(R.id.btnBalok);
        Button btnTabung = view.findViewById(R.id.btnTabung);
        Button btnKerucut = view.findViewById(R.id.btnKerucut);
        Button btnBola = view.findViewById(R.id.btnBola);

        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), menu_Kubus.class);
                startActivity(intent);
            }
        });

        btnBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), menu_Balok.class);
                startActivity(intent);
            }
        });

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), menu_Tabung.class);
                startActivity(intent);
            }
        });

        btnKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), menu_Kerucut.class);
                startActivity(intent);
            }
        });

        btnBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), menu_Bola.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
