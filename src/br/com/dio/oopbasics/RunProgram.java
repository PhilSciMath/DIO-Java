package br.com.dio.oopbasics;
/*
    Simple exercise to practice basic concepts like class, attributes, methods, and
    how to create objects and run the program from another class containing the
    Main method.
 */
public class RunProgram {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("blue");
        car1.setBrand("Ford");
        car1.setTankCapacity(400.0f);

        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.fullTankPrice(5.0f));

        Car car2 = new Car("Nissan", "yellow", 350.0f);
        System.out.println("\n" + car2.getBrand());
        System.out.println(car2.getColor());
        System.out.println(car2.getTankCapacity());
        System.out.println(car2.fullTankPrice(4.95f));

        car1.setBrand("Batmobile");
        System.out.println("\n" + car1.getBrand());
    }

}
