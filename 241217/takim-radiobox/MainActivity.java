package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageTakim;
    RadioButton rbTurkiye,rbEyup,rbTrabzon;
    Button btnSec;
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
        imageTakim=findViewById(R.id.imageTakim);
        rbTurkiye=findViewById(R.id.rbTurkiye);
        rbEyup=findViewById(R.id.rbEyup);
        rbTrabzon=findViewById(R.id.rbTrabzon);
        btnSec=findViewById(R.id.btnSec);

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbTurkiye.isChecked()){
                    imageTakim.setImageResource(R.drawable.turkiye);
                }
                else if (rbEyup.isChecked()) {
                    imageTakim.setImageResource(R.drawable.eyupsp);
                }
                else{
                    imageTakim.setImageResource(R.drawable.trabzon);
                }
            }
        });
    }
}