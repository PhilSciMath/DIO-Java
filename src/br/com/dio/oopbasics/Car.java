package br.com.dio.oopbasics;
/*
    Simple exercise to practice basic concepts like class, attributes, methods, and
    how to create objects and run the program from another class containing the
    Main method.
 */
public class Car {

    // attributes
    private String brand;
    private String color;
    private double tankCapacity;

    // constructors
    public Car(){

    }
    public Car(String brand, String color, double tankCapacity){
        this.brand = brand;
        this.color = color;
        this.tankCapacity = tankCapacity;
    }

    // getters and setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setTankCapacity(double tankCapacity){
        this.tankCapacity = tankCapacity;
    }
    public double getTankCapacity(){
        return this.tankCapacity;
    }

    // other methods
    // what is the price of a full tank?
    public double fullTankPrice(double costPerLiter){
        return this.tankCapacity * costPerLiter;
    }
}
