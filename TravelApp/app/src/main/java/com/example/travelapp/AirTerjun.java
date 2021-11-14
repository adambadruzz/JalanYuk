package com.example.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AirTerjun extends AppCompatActivity {

    Button back;
    Button btnEx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alam1open);

        back = findViewById(R.id.backHome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AirTerjun.this, MenuFragment.class));
                finish();
            }
        });

        btnEx = findViewById(R.id.btn_exAir);
        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AirTerjun.this, Alam1.class));
            }
        });
    }
}
