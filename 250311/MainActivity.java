package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Ulke> ulkeArrayList;
    int siraNo;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        ulkeArrayList=new ArrayList<>();

        Ulke turkey=new Ulke("türkiye","Ankara","Türkçe","Lira","Ülkedir",1,R.drawable.turkey);
        Ulke germany=new Ulke("Almanya","Alman","Almanca","Lira","Ülkedir",2,R.drawable.germany);
        Ulke japan=new Ulke("Japonya","Ankara","Türkçe","Lira","Ülkedir",3,R.drawable.japan);

        ulkeArrayList.add(turkey);
        ulkeArrayList.add(germany);
        ulkeArrayList.add(japan);

        binding.imgUlkeler.setImageResource(ulkeArrayList.get(0).foto);
        binding.twAd.setText("Ad: "+ulkeArrayList.get(0).ad);
        binding.twBaskent.setText("Başkent: "+ulkeArrayList.get(0).baskent);
        binding.twDil.setText("Dil: "+ulkeArrayList.get(0).dil);
        binding.twParaBirimi.setText("Para Birimi: "+ulkeArrayList.get(0).paraBirimi);
        binding.twBilgi.setText("Bilgi: "+ulkeArrayList.get(0).bilgi);
        siraNo=0;


    }
    public void geriGelme(View view){
        if(siraNo>0){
            siraNo--;
            binding.imgUlkeler.setImageResource(ulkeArrayList.get(siraNo).foto);
            binding.twAd.setText("Ad: "+ulkeArrayList.get(siraNo).ad);
            binding.twBaskent.setText("Başkent: "+ulkeArrayList.get(siraNo).baskent);
            binding.twDil.setText("Dil: "+ulkeArrayList.get(siraNo).dil);
            binding.twParaBirimi.setText("Para Birimi: "+ulkeArrayList.get(siraNo).paraBirimi);
            binding.twBilgi.setText("Bilgi: "+ulkeArrayList.get(siraNo).bilgi);
        }
    }

    public void ileriGelme(View view){
        if(siraNo<ulkeArrayList.size()-1){
            siraNo++;
            binding.imgUlkeler.setImageResource(ulkeArrayList.get(siraNo).foto);
            binding.twAd.setText("Ad: "+ulkeArrayList.get(siraNo).ad);
            binding.twBaskent.setText("Başkent: "+ulkeArrayList.get(siraNo).baskent);
            binding.twDil.setText("Dil: "+ulkeArrayList.get(siraNo).dil);
            binding.twParaBirimi.setText("Para Birimi: "+ulkeArrayList.get(siraNo).paraBirimi);
            binding.twBilgi.setText("Bilgi: "+ulkeArrayList.get(siraNo).bilgi);
        }
    }

}