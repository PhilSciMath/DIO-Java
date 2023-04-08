package br.com.dio.datastructures.circular_lists;

public class Main {

    public static void main(String[] args) {

        CircularList<String> myList = new CircularList<>();

        myList.add("num1");
        myList.add("num2");
        myList.add("num3");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3)); // no errors, returns to start!!

        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList);

    }

}
