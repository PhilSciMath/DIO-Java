package br.com.dio.datastructures.queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue();
        myQueue.enqueue(new Node("first-node"));
        myQueue.enqueue(new Node("second-node"));
        myQueue.enqueue(new Node("third-node"));
        myQueue.enqueue(new Node("fourth-node"));

        System.out.println(myQueue);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);
        myQueue.enqueue(new Node("last-node"));
        System.out.println(myQueue);
        System.out.println(myQueue.first());


    }

}
