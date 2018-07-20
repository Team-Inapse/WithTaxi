package com.Inapse.withtaxi.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.Inapse.withtaxi.R;
import com.Inapse.withtaxi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private  ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.MainLogo.getLayoutParams().height =  getApplicationContext().getResources().getDisplayMetrics().widthPixels/3;
        binding.MainLogo.getLayoutParams().width =  getApplicationContext().getResources().getDisplayMetrics().widthPixels/3;
        binding.MainLogo.requestLayout();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
        binding.btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
    }
}