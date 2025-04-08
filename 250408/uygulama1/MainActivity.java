package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etAdi,etSoyadi,etYil;
    private Button btnGonder;


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

        etAdi=findViewById(R.id.etAd);
        etSoyadi=findViewById(R.id.etSoyad);
        etYil=findViewById(R.id.etDg);
        btnGonder=findViewById(R.id.btnGonder);



        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);

                intent1.putExtra("ad",etAdi.getText().toString());
                intent1.putExtra("soyad",etSoyadi.getText().toString());
                intent1.putExtra("yil",Integer.parseInt(etYil.getText().toString()));

                startActivity(intent1);
            }
        });

    }
}