package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editSayi1,editSayi2;
    RadioButton rb_topla,rb_cikar,rb_carp,rb_bol;
    Button btnHesapla;
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
        editSayi1=findViewById(R.id.editSayi1);
        editSayi2=findViewById(R.id.editSayi2);
        rb_topla=findViewById(R.id.rb_topla);
        rb_cikar=findViewById(R.id.rb_cikar);
        rb_carp=findViewById(R.id.rb_carp);
        rb_bol=findViewById(R.id.rb_bol);
        btnHesapla=findViewById(R.id.btnHesapla);
        tvSonuc=findViewById(R.id.tvSonuc);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sayi1=Double.parseDouble(editSayi1.getText().toString());
                double sayi2=Double.parseDouble(editSayi2.getText().toString());
                double sonuc=0;
                if (rb_topla.isChecked()){
                    sonuc=sayi1+sayi2;
                }
                else if (rb_cikar.isChecked()) {
                    sonuc=sayi1-sayi2;
                }
                else if (rb_carp.isChecked()) {
                    sonuc=sayi1*sayi2;
                }
                else{
                    sonuc=sayi1/sayi2;
                }
                tvSonuc.setText("Sonuç : "+sonuc);
            }
        });
    }
}