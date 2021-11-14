package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GunungPan extends AppCompatActivity {
    Button back,exGun;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alam2open);
        back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GunungPan.this,MenuFragment.class);
                startActivity(intent);
                finish();
            }
        });

        exGun = findViewById(R.id.btn_exGun);
        exGun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GunungPan.this,Alam2.class);
                startActivity(intent);
            }
        });
    }
}
