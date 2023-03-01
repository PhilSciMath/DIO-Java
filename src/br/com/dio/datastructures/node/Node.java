// Example from Data Structures class, using nodes.

package br.com.dio.datastructures.node;

public class Node {
    private String content;      // the content
    private Node nextNode;       // the reference to the next node

    public Node(String content) {      
        this.nextNode = null;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                '}';
    }
}
