package com.example.uygulama1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmAdapter extends BaseAdapter {

    Context context;
    ArrayList<Film> filmler;

    public FilmAdapter(Context context,ArrayList<Film>filmler){
        this.context=context;
        this.filmler=filmler;
    }

    @Override
    public int getCount() {
        return filmler.size();
    }

    @Override
    public Object getItem(int i) {
        return filmler.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView ivSatirAfis;
        TextView tvSatirAd,tvSatirYil,tvSatirYonetmen;

        Film film=filmler.get(i);

        if (view == null){
           view=View.inflate(context,R.layout.satir,null);
        }

        //xml'de tanımlı bileşenler ayarlanır
        ivSatirAfis=view.findViewById(R.id.iv_satir_afis);
        tvSatirAd=view.findViewById(R.id.tv_satir_ad);
        tvSatirYil=view.findViewById(R.id.tv_satir_yil);
        tvSatirYonetmen=view.findViewById(R.id.tv_satir_yonetmen);


        ivSatirAfis.setImageResource(film.getAfis());
        tvSatirAd.setText(film.getAd());
        tvSatirYil.setText(String.valueOf(film.getYil()));
        tvSatirYonetmen.setText(film.getYonetmen());



        return view;
    }
}
