package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    ImageView ivTakimLogo;
    TextView tvTakimAd,tvTakimAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ivTakimLogo=findViewById(R.id.iv_takim_logo);
        tvTakimAd=findViewById(R.id.tv_takim_ad);
        tvTakimAciklama=findViewById(R.id.tv_takim_aciklama);

        Takim takim=(Takim) getIntent().getSerializableExtra("secilenTakim");

        if (takim!=null){
            ivTakimLogo.setImageResource(takim.getLogo());
            tvTakimAd.setText(takim.getAd());
            tvTakimAciklama.setText(takim.getAciklama());
        }
    }
}