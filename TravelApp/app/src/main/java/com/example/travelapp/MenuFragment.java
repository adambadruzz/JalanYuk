package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuFragment extends AppCompatActivity {
    LinearLayout gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

//

        BottomNavigationView navigationView = findViewById(R.id.bottmNavMenu);
        NavController navController = Navigation.findNavController(this,R.id.fragment);

        NavigationUI.setupWithNavController(navigationView,navController);



    }




}
