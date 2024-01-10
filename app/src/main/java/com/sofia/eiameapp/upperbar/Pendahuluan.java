package com.sofia.eiameapp.upperbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.sofia.eiameapp.Home;
import com.sofia.eiameapp.R;
import com.sofia.eiameapp.databinding.UpperbarPendahuluanBinding;

public class Pendahuluan extends AppCompatActivity {

    UpperbarPendahuluanBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.upperbar_pendahuluan);

        binding.btnBack.setOnClickListener(v->{
            backToHome();
        });

    }

    private void backToHome(){
        Intent a = new Intent(Pendahuluan.this, Home.class);
        startActivity(a);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backToHome();
    }
}