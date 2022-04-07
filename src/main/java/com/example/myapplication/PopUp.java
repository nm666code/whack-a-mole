package com.example.myapplication;

import android.widget.ImageView;

import java.util.TimerTask;

public class PopUp extends TimerTask {
    MainActivity myFindViewByID;

    public PopUp(Object mainActivity){
        myFindViewByID=(MainActivity)mainActivity;
    }

    @Override
    public void run() {
        ImageView imgFp = (ImageView) myFindViewByID.findViewById(R.id.imageView);
        imgFp.setImageResource(R.drawable.mole);
    }
}
