package com.example.bottommenu;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import Fragment.Menu1;
import Fragment.Menu2;
import Fragment.Menu3;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnItemSelectedListener(navListener);
        //Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Menu1())
                .commit();

    }
    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.menu_bangundatar) {

                        selectedFragment = new Menu1();
                    } else if (item.getItemId() == R.id.menu_bangunruang) {
                        selectedFragment = new Menu2();
                    } else if (item.getItemId() == R.id.menu_profile) {
                        selectedFragment = new Menu3();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selectedFragment)
                            .commit();

                    return true;
                }
            };
}