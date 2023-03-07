package br.com.dio.datastructures.queue;

public class Node {

    private Object object;
    private Node NodeRef;

    public Node(){}

    public Node(Object object) {
        this.NodeRef = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNodeRef() {
        return NodeRef;
    }

    public void setNodeRef(Node NodeRef) {
        this.NodeRef = NodeRef;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
