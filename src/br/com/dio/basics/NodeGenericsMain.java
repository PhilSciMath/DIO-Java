// This uses the Node class to illustrate how nodes work.

package br.com.dio.basics;

public class NodeGenericsMain {
    public static void main(String[] args) {

        NodeGenerics<String> node1 = new NodeGenerics<>("content from node1");
        NodeGenerics<String> node2 = new NodeGenerics<>("content from node2");
        NodeGenerics<String> node3 = new NodeGenerics<>("content from node3");
        NodeGenerics<String> node4 = new NodeGenerics<>("content from node4");

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
