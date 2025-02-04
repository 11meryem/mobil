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

    EditText editText_cihazAdi,editText_cihazGucu,editText_kullanilanSaat;
    Button button_hesapla;
    TextView textView_tuketim;


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

        editText_cihazAdi=findViewById(R.id.editText_cihazAdi);
        editText_cihazGucu=findViewById(R.id.editTextNumber_cihazGucu);
        editText_kullanilanSaat=findViewById(R.id.editTextNumber_kullanilanSaat);
        button_hesapla=findViewById(R.id.button_hesapla);
        textView_tuketim=findViewById(R.id.textView_tuketim);

        button_hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cihazAdi=editText_cihazAdi.getText().toString();
                double guc=Double.parseDouble(editText_cihazGucu.getText().toString());
                double saat=Double.parseDouble(editText_kullanilanSaat.getText().toString());

                ElektrikliCihaz cihaz=new ElektrikliCihaz();

                cihaz.cihazAdi=cihazAdi;
                cihaz.cihazGucu=guc;
                cihaz.gunlukKullanimSaati=saat;

                double sonuc=cihaz.aylikKullanim();

                textView_tuketim.setText("Aylık Tüketim: "+sonuc);
            }
        });
    }
}