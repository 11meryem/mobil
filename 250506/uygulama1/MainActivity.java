package com.example.uygulama1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvUlkeler;
    ArrayList<Ulke> liste;
    UlkeAdapter adapter;

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

        lvUlkeler =findViewById(R.id.lv_ulkeler);
        liste=new ArrayList<>();
        liste.add(new Ulke(R.drawable.turkiye,"Türkiye","Ankara",1234568,getString(R.string.aciklama_turkiye)));
        liste.add(new Ulke(R.drawable.almanya,"Almanya","Berlin",1234568,getString(R.string.aciklama_almanya)));
        liste.add(new Ulke(R.drawable.japonya,"Japonya","Tokyo",12345678,getString(R.string.aciklama_japonya)));

        UlkeAdapter adapter=new UlkeAdapter(this,liste);
        lvUlkeler.setAdapter(adapter);

        lvUlkeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Ulke secilenUlke=liste.get(i);
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("secilenUlke",secilenUlke);
                startActivity(intent);
            }
        });

    }
}