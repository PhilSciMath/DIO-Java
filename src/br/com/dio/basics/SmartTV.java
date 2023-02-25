package br.com.dio.basics;

public class SmartTV {

    static boolean isOn = false;
    static int channel = 1;
    static int soundVolume = 25;

    // Switching state to on/off
    static public void powerOn(){
        isOn = true;
    }
    static public void powerOff(){
        isOn = false;
    }

    // Switching volume up/down
    static public void volumeUP(){
        soundVolume++;
        System.out.println("Increasing volume to: " + soundVolume);
    }
    static public void volumeDown(){
        soundVolume--;
        System.out.println("Decreasing volume to: " + soundVolume);
    }

    // Switching channel up/down by 1
    static public void switchChannelUp(){
        channel++;
    }
    static public void switchChannelDown(){
        channel--;
    }

   // Switching channel up/down by a given amount.
    static public void setChannelUp(int newChannel){
        channel += newChannel;
    }
    static public void setChannelDown(int newChannel){
        channel -= newChannel;
    }

}
