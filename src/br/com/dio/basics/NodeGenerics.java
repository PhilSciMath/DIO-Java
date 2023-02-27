// Refactoring of the class Node to be generic.

package br.com.dio.basics;

public class NodeGenerics<T> {
    private T content;      // The content can be any type now.
    private NodeGenerics<T> nextNode;

    public NodeGenerics(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public NodeGenerics<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeGenerics<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "NodeGenerics{" +
                "content=" + content +
                '}';
    }
}
