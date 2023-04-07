package br.com.dio.datastructures.doubly_linked_lists;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<String> myList = new DoublyLinkedList<>();

        myList.add("test-1");
        myList.add("test-2");
        myList.add("test-3");
        myList.add("test-4");
        myList.add("test-5");
        myList.add("test-6");

        System.out.println(myList);
        myList.remove(3);
        System.out.println(myList);
        myList.add(3, "batman");
        System.out.println(myList);
        System.out.println(myList.get(3));
    }

}
