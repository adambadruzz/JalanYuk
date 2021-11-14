package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pantai3Warna extends AppCompatActivity {
    Button back,exPan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alam3open);

        back = findViewById(R.id.btnBack_pan);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(Pantai3Warna.this,MenuFragment.class);
                startActivity(intent);
            }
        });

        exPan = findViewById(R.id.btn_exPan);
        exPan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pantai3Warna.this,Alam3.class));
            }
        });
    }
}
