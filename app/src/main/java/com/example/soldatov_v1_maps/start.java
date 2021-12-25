package com.example.soldatov_v1_maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class start extends AppCompatActivity implements OnClickListener {


    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart =  findViewById(R.id.btnStart);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(start.this, foto.class);
        startActivity(intent);
    }
}