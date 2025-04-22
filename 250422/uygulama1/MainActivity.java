package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ulke> ulkeler;
    ListView lvUlkeler;

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

        lvUlkeler=findViewById(R.id.lv_ulkeler);
        ulkeler=new ArrayList<>();

        ulkeler.add(new Ulke(R.drawable.turkiye,"Türkiye","Ankara",80000000,"TL","Türkçe","+90",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.almanya,"Almanya","Berlin",83000000,"TL","Almanca","+90",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.abd,"ABD","Washington",33000000,"USD DOLARI","Ingilizce","+90",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.japonya,"Japonya","Tokyo",12000000,"JAPON YENİ","Japonca","+90",getString(R.string.tr_aciklama)));


        UlkelerAdapter adapter=new UlkelerAdapter(ulkeler,this);
        lvUlkeler.setAdapter(adapter);

    }
}