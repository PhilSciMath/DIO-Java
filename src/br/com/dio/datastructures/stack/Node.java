// Implementation of a node to create a stack.

package br.com.dio.datastructures.stack;

public class Node {

    private int data;
    private Node refNextNode = null;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRefNextNode() {
        return refNextNode;
    }

    public void setRefNextNode(Node refNextNode) {
        this.refNextNode = refNextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
