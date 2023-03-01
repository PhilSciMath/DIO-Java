// This uses the Node class to illustrate how nodes work.

package br.com.dio.datastructures.generics;

public class Main {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("content from node1");
        Node<String> node2 = new Node<>("content from node2");
        Node<String> node3 = new Node<>("content from node3");
        Node<String> node4 = new Node<>("content from node4");

        // To make node n to point to node n+1:
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(null);

        // We can use a node to access the content from another one.
        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());

    }
}
