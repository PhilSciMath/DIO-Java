/*
 * This illustrates the very basics of how to use methods from other classes.
 * The SmartTV class is defined just to be used here.
 */


package br.com.dio.basics;

public class SmartTVUser {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("Is the TV on? " + SmartTV.isOn);
        System.out.println("Channel: " + SmartTV.channel);
        System.out.println("Volume: " + SmartTV.soundVolume);

        System.out.println("--------------");
        SmartTV.powerOn();
        SmartTV.setChannelUp(15);

        System.out.println("Is the TV on? " + SmartTV.isOn);
        System.out.println("Channel: " + SmartTV.channel);
        SmartTV.volumeUP();

    }
}