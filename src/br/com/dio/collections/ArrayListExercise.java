package br.com.dio.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

    public static void main(String[] args) {

        // creating arraylist and adding items at the same time
        List<WeatherTemperature> temp = new ArrayList<>(){{
            add(new WeatherTemperature(32.3, "January"));
            add(new WeatherTemperature(35.8, "February"));
            add(new WeatherTemperature(39.5, "March"));
        }};

        // adding stuff in later
        temp.add(new WeatherTemperature(41.2, "April"));
        temp.add(new WeatherTemperature(36.1, "May"));
        temp.add(new WeatherTemperature(31.2, "June"));

        System.out.println(temp);

        // calculate the average temperature for the semester
        double avg = 0;
        for (WeatherTemperature weatherTemperature : temp) {
            avg += weatherTemperature.getTemperature();
            //System.out.print(" " + weatherTemperature.getTemperature());
        }
        avg = avg / temp.size();
        System.out.format("\nSemester Average = %.1f\n", avg);

        // show all temperatures above average with the respective months
        System.out.println("\nTemperatures above average: ");
        for (WeatherTemperature weatherTemperature: temp){
            if (weatherTemperature.getTemperature() > avg){
                System.out.println(weatherTemperature.getTemperature() + " - " +
                        weatherTemperature.getMonth()
                        );}
        }

    }

}

class WeatherTemperature {
    private double temperature;
    private String month;

    public WeatherTemperature() {
    }

    public WeatherTemperature(double temperature, String month) {
        this.temperature = temperature;
        this.month = month;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "WeatherTemperature{" +
                "temperature=" + temperature +
                ", month='" + month + '\'' +
                '}';
    }
}