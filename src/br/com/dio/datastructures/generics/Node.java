// Refactoring of the class Node to be generic.

package br.com.dio.datastructures.generics;

public class Node<T> {
    private T content;      // The content can be any type now.
    private Node<T> nextNode;

    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}
