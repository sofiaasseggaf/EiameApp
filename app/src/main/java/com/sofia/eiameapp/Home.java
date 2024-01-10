package com.sofia.eiameapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.sofia.eiameapp.databinding.HomeBinding;
import com.sofia.eiameapp.middlebar.BlackHat;
import com.sofia.eiameapp.middlebar.BlueHat;
import com.sofia.eiameapp.middlebar.GreenHat;
import com.sofia.eiameapp.middlebar.RedHat;
import com.sofia.eiameapp.middlebar.WhiteHat;
import com.sofia.eiameapp.middlebar.YellowHat;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.AdaptasiMitigasiActivity;
import com.sofia.eiameapp.upperbar.artikel.ArtikelActivity;
import com.sofia.eiameapp.upperbar.kasusanalisis.KasusAnalisisActivity;
import com.sofia.eiameapp.upperbar.Pendahuluan;

public class Home extends AppCompatActivity {

    HomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.home);

        binding.btnPendahuluan.setOnClickListener(v->{
            Intent a = new Intent(Home.this, Pendahuluan.class);
            startActivity(a);
            finish();
        });

        binding.btnKasus.setOnClickListener(v->{
            Intent a = new Intent(Home.this, KasusAnalisisActivity.class);
            startActivity(a);
            finish();
        });

        binding.btnAdaptasi.setOnClickListener(v->{
            Intent a = new Intent(Home.this, AdaptasiMitigasiActivity.class);
            startActivity(a);
            finish();
        });

        binding.btnArtikel.setOnClickListener(v->{
            Intent a = new Intent(Home.this, ArtikelActivity.class);
            startActivity(a);
            finish();
        });

        binding.btnWhiteHatFacts.setOnClickListener(v->{
            Intent a = new Intent(Home.this, WhiteHat.class);
            startActivity(a);
            finish();
        });

        binding.btnRedHatEmotion.setOnClickListener(v->{
            Intent a = new Intent(Home.this, RedHat.class);
            startActivity(a);
            finish();
        });

        binding.btnYellowHatBenefit.setOnClickListener(v->{
            Intent a = new Intent(Home.this, YellowHat.class);
            startActivity(a);
            finish();
        });

        binding.btnGreenHatIdeas.setOnClickListener(v->{
            Intent a = new Intent(Home.this, GreenHat.class);
            startActivity(a);
            finish();
        });

        binding.btnBlueHatPlanning.setOnClickListener(v->{
            Intent a = new Intent(Home.this, BlueHat.class);
            startActivity(a);
            finish();
        });

        binding.btnBlackHatJudgement.setOnClickListener(v->{
            Intent a = new Intent(Home.this, BlackHat.class);
            startActivity(a);
            finish();
        });

    }
}