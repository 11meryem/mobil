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

    ListView lvFilmler;

    ArrayList<Film> liste;


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

        lvFilmler=findViewById(R.id.lv_filmler);

        liste=new ArrayList<>();
        liste.add(new Film(R.drawable.i_robot,"I Robot",2014,"Alex Proyas",getString(R.string.irobot_aciklama),3));
        liste.add(new Film(R.drawable.ice_age,"ice Age",2002,"Chirs  Wedge",getString(R.string.iceage_aciklama),2.5f));
        liste.add(new Film(R.drawable.inception,"inception",2010,"Christtopher Nolan",getString(R.string.inception_aciklama),4));
        liste.add(new Film(R.drawable.ip_man,"Ip Man",2008,"Wilson yip",getString(R.string.ipman_aciklama),1));
        liste.add(new Film(R.drawable.iron_man,"Iron Man",2008,"Jon Favreau",getString(R.string.ironman_aciklama),4.5f));

        FilmAdapter adapter=new FilmAdapter(this,liste);
        lvFilmler.setAdapter(adapter);

        lvFilmler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Film secilenFilm=liste.get(i);
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("secilenFilm",secilenFilm);
                startActivity(intent);

            }
        });

    }
}