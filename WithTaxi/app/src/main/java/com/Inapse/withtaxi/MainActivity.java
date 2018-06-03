package com.Inapse.withtaxi;

import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }
}