package com.example.myapplication;

import java.util.Timer;

public class PopUpTimer {
    Timer myTimer = new Timer();
    public void setup(Object mainActivity){
        myTimer.schedule(new PopUp(mainActivity),1000,5000);
    }
}
