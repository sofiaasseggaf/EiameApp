package com.sofia.eiameapp.upperbar.kasusanalisis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.sofia.eiameapp.Home;
import com.sofia.eiameapp.R;
import com.sofia.eiameapp.adapter.ViewPagerKasusAnalisisAdapter;
import com.sofia.eiameapp.databinding.UpperbarKasusAnalisisActivityBinding;
import com.sofia.eiameapp.upperbar.adaptasimitigasi.AdaptasiMitigasiActivity;

public class KasusAnalisisActivity extends AppCompatActivity {

    UpperbarKasusAnalisisActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.upperbar_kasus_analisis_activity);

        ViewPagerKasusAnalisisAdapter adapter = new ViewPagerKasusAnalisisAdapter(getSupportFragmentManager());
        binding.viewPagerKasusAnalisis.setAdapter(adapter);
        binding.tabLayoutKasusAnalisis.setupWithViewPager(binding.viewPagerKasusAnalisis);

        binding.btnBack.setOnClickListener(v->{
            backToHome();
        });
    }

    private void backToHome(){
        Intent a = new Intent(KasusAnalisisActivity.this, Home.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backToHome();
    }
}