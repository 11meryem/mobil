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
    EditText editText1,editText2;
    Button btnTopla,btnCikar,btnCarp,btnBol;
    TextView tvSonuc;


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

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        btnTopla=findViewById(R.id.btnTopla);
        btnCikar=findViewById(R.id.btnCikar);
        btnCarp=findViewById(R.id.btnCarp);
        btnBol=findViewById(R.id.btnBol);
        tvSonuc=findViewById(R.id.tvSonuc);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int sayi1=Integer.parseInt(editText1.getText().toString());
            int sayi2=Integer.parseInt(editText2.getText().toString());
            int sonuc=sayi1+sayi2;
            tvSonuc.setText("Sonuç:  "+sonuc);
            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(editText1.getText().toString());
                int sayi2=Integer.parseInt(editText2.getText().toString());
                int sonuc=sayi1-sayi2;
                tvSonuc.setText("Sonuç:  "+sonuc);
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(editText1.getText().toString());
                int sayi2=Integer.parseInt(editText2.getText().toString());
                int sonuc=sayi1*sayi2;
                tvSonuc.setText("Sonuç:  "+sonuc);
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(editText1.getText().toString());
                int sayi2=Integer.parseInt(editText2.getText().toString());
                float sonuc;
                if(sayi2!=0){
                    sonuc=sayi1/sayi2;
                    tvSonuc.setText("Sonuç:  "+sonuc);
                }
                else{
                    tvSonuc.setText("Sıfıra bölme hatası");
                }
            }
        });
    }
}