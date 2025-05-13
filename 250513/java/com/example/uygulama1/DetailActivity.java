package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    ImageView ivAfis;

    TextView tvAd,tvKonu;

    RatingBar rbar;

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

        ivAfis=findViewById(R.id.iv_afis);
        tvAd=findViewById(R.id.tv_ad);
        tvKonu=findViewById(R.id.tv_konu);

        Film film=(Film)getIntent().getSerializableExtra("secilenFilm");
        if(film!=null){
            ivAfis.setImageResource(film.getAfis());
            tvAd.setText(film.getAd());
            tvKonu.setText(film.getKonu());
        }

    }
}