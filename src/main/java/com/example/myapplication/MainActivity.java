package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    PopUpTimer myPopUpTimer = new PopUpTimer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPopUpTimer.setup(this);
    }

    public void clickMole(View view) {
        ImageView imgFp = (ImageView) findViewById(R.id.imageView);
        imgFp.setImageResource(R.drawable.hole);
    }

}