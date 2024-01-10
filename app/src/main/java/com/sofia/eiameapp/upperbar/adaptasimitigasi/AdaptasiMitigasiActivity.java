package com.sofia.eiameapp.upperbar.adaptasimitigasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.content.Intent;
import android.os.Bundle;
import com.sofia.eiameapp.Home;
import com.sofia.eiameapp.R;
import com.sofia.eiameapp.adapter.ViewPagerAdaptasiMitigasiAdapter;
import com.sofia.eiameapp.databinding.UpperbarAdaptasiMitigasiActivityBinding;
import com.sofia.eiameapp.upperbar.Pendahuluan;

public class AdaptasiMitigasiActivity extends AppCompatActivity {

    UpperbarAdaptasiMitigasiActivityBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.upperbar_adaptasi_mitigasi_activity);

        ViewPagerAdaptasiMitigasiAdapter adapter = new ViewPagerAdaptasiMitigasiAdapter(getSupportFragmentManager());
        binding.viewPagerAdaptasiMitigasi.setAdapter(adapter);
        binding.tabLayoutAdaptasiMitigasi.setupWithViewPager(binding.viewPagerAdaptasiMitigasi);

        binding.btnBack.setOnClickListener(v->{
            backToHome();
        });
    }

    private void backToHome(){
        Intent a = new Intent(AdaptasiMitigasiActivity.this, Home.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backToHome();
    }
}