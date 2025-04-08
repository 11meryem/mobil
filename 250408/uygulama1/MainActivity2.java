package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvSonucu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvSonucu=findViewById(R.id.tvSonuc);


        Intent intent=getIntent();

        String ad=intent.getStringExtra("ad");
        String soyad=intent.getStringExtra("soyad");
        int dg=intent.getIntExtra("yil", 0);

        int yas=2025-dg;

        tvSonucu.setText("Hosgeldin  "+ad+" "+soyad+"\n Yaşınız "+yas);

    }
}