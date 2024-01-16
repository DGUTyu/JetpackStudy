package com.dongnaoedu.databinding3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.dongnaoedu.databinding3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setNetworkImage("https://www.imooc.com/static/img/index/logo2020.png");
        activityMainBinding.setLocalImage(R.drawable.angelinajolie);
    }
}