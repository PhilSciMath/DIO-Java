package br.com.dio.datastructures.doubly_linked_lists;

public class DoublyLinkedList<T> {

    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;
    private int listSize;

    public DoublyLinkedList(){
        this.firstNode = null;
        this.lastNode = null;
        this.listSize = 0;
    }

    public int size(){
        return this.listSize;
    }

    public void add(T element){
        DoubleNode<T> newNode = new DoubleNode<>(element);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);
        if (firstNode == null){
            firstNode = newNode;
        }
        if (lastNode != null){
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T elelment){
        DoubleNode<T> helperNode = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<>(elelment);
        newNode.setNextNode(helperNode);
        if (newNode.getNextNode() != null){
            newNode.setPreviousNode(helperNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
        if (index == 0){
            firstNode = newNode;
        }else{
            newNode.getPreviousNode().setNextNode(newNode);
        }
        listSize++;
    }

    public void remove(int index){
        if (index == 0){
            firstNode = firstNode.getNextNode();
            if (firstNode != null){
                firstNode.setPreviousNode(null);
            }
        }else{
            DoubleNode<T> helperNode = getNode(index);
            helperNode.getPreviousNode().setNextNode(helperNode.getNextNode());
            if (helperNode != lastNode){
                helperNode.getNextNode().setPreviousNode(helperNode.getPreviousNode());
            }else {
                lastNode = helperNode;
            }
        }
        this.listSize--;
    }

    public T get(int index){
        return  this.getNode(index).getContent();
    }

    private DoubleNode<T> getNode(int index){
        DoubleNode<T> helperNode = firstNode;
        for (int i = 0; (i < index) && (helperNode != null); i++){
            helperNode = helperNode.getNextNode();
        }
        return helperNode;
    }

    @Override
    public String toString() {
        String returnString = "";
        DoubleNode<T> helperNode = firstNode;
        for (int i = 0; i < size(); i++){
            returnString += "[Node{content=" + helperNode.getContent() + "}] --> ";
            helperNode = helperNode.getNextNode();
        }
        returnString += "null";
        return returnString;
    }

}
