package com.sofia.eiameapp.upperbar.artikel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.sofia.eiameapp.Home;
import com.sofia.eiameapp.R;
import com.sofia.eiameapp.adapter.ViewPagerArtikelAdapter;
import com.sofia.eiameapp.adapter.ViewPagerKasusAnalisisAdapter;
import com.sofia.eiameapp.databinding.UpperbarArtikelActivityBinding;
import com.sofia.eiameapp.upperbar.kasusanalisis.KasusAnalisisActivity;

public class ArtikelActivity extends AppCompatActivity {

    UpperbarArtikelActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.upperbar_artikel_activity);

        ViewPagerArtikelAdapter adapter = new ViewPagerArtikelAdapter(getSupportFragmentManager());
        binding.viewPagerArtikel.setAdapter(adapter);
        binding.tabLayoutArtikel.setupWithViewPager(binding.viewPagerArtikel);

        binding.btnBack.setOnClickListener(v->{
            backToHome();
        });
    }

    private void backToHome(){
        Intent a = new Intent(ArtikelActivity.this, Home.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backToHome();
    }
}