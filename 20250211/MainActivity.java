package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etDersAd,etYazili1,etYazili2;
    Button btnHesapla;
    TextView tvOrtalama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etDersAd=findViewById(R.id.etDersAd);
        etYazili1=findViewById(R.id.etYazili1);
        etYazili2=findViewById(R.id.etYazili2);
        btnHesapla=findViewById(R.id.btnHesapla);
        tvOrtalama=findViewById(R.id.tvOrtalama);


        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dersAdi=etDersAd.getText().toString();
                double yazili1=Double.parseDouble(etYazili1.getText().toString());
                double yazili2=Double.parseDouble(etYazili2.getText().toString());

                Ders ders=new Ders(dersAdi,yazili1,yazili2);
                double ortalama=ders.ortalamahesap();
                String durum=ders.gectiMi();
                tvOrtalama.setText("Ders Adı "+ders.getDersAdi()+"    Ders Ortalama "+ortalama+"   ( "+durum+" )");
            }
        });
    }
}