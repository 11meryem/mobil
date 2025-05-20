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

    ListView lvTakimlar;
    ArrayList<Takim> liste;


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

        lvTakimlar=findViewById(R.id.lv_takim);
        liste=new ArrayList<>();

        liste.add(new Takim(R.drawable.ts,"Trabzon Spor","1967",getString(R.string.tsAciklama)));
        liste.add(new Takim(R.drawable.antalyaspor,"Antalya Spor","1966",getString(R.string.antalyaAciklama)));
        liste.add(new Takim(R.drawable.kayserispor,"Kayseri Spor","1975",getString(R.string.kayseriAciklama)));
        liste.add(new Takim(R.drawable.samsunspor,"Samsun Spor","1927",getString(R.string.samsunAciklama)));

        TakimAdapter adapter=new TakimAdapter(this,liste);
        lvTakimlar.setAdapter(adapter);

        lvTakimlar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Takim secilenTakim=liste.get(i);
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("secilenTakim",secilenTakim);
                startActivity(intent);
            }
        });
    }
}