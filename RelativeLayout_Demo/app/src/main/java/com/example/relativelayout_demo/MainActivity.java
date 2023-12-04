package com.example.relativelayout_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgMic, imgPlay, imgExit;
    TextView tvMic, tvPlay, tvExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setUpUI();

    }
    private void initUI(){
        imgMic = findViewById(R.id.img_mic);
        tvMic = findViewById(R.id.tv_mic);

        imgPlay = findViewById(R.id.img_play);
        tvPlay = findViewById(R.id.tv_play);

        imgExit = findViewById(R.id.img_exit);
        tvExit = findViewById(R.id.tv_exit);
    }
    private void setUpUI(){
        imgMic.setImageResource(R.drawable.ic_mic);
        tvMic.setText("Push to talk");
    }
}