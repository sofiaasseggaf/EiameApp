package com.sofia.eiameapp.middlebar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.sofia.eiameapp.Home;
import com.sofia.eiameapp.R;
import com.sofia.eiameapp.databinding.MiddlebarBlackHatBinding;
import com.sofia.eiameapp.upperbar.Pendahuluan;

public class BlackHat extends AppCompatActivity {

    MiddlebarBlackHatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.middlebar_black_hat);

        binding.btnBack.setOnClickListener(v->{
            backToHome();
        });

    }

    private void backToHome(){
        Intent a = new Intent(BlackHat.this, Home.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backToHome();
    }
}