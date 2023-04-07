package br.com.dio.datastructures.linked_lists;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("test1");
        myLinkedList.add("test2");
        //myLinkedList.add("test3");    // bug, adding one more shows no output. Loop?

        System.out.println("The content of the nodes:");
        System.out.println("    " + myLinkedList.get(0));
        System.out.println("    " + myLinkedList.get(1));
        //System.out.println("    " + myLinkedList.get(2));     // bug.

        System.out.println("The whole list:");
        System.out.println("    " + myLinkedList);

    }


}
