package br.com.dio.datastructures.circularlists;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularList() {
        this.tail = null;
        this.head = null;
        this.listSize = 0;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if(this.listSize == 0){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        }else{
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    private Node<T> getNode(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("Empty list!");
        if(index == 0) return this.tail;
        Node<T> helperNode = this.tail;
        for (int i = 0; (i < index) && (helperNode != null); i++){
            helperNode = helperNode.getNextNode();
        }
        return helperNode;
    }

    public int size(){
        return this.listSize;
    }

    public boolean isEmpty(){
        if(this.listSize == 0) return true;
        return false;
    }

    public void remove(int index){
        if(index >= this.listSize)
            throw new IndexOutOfBoundsException("Index greater than list size.");
        Node<T> helperNode = this.tail;
        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        }else if(index == 1){
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        }else{
            for(int i = 0; i < index - 1; i++)
                helperNode = helperNode.getNextNode();
            helperNode.setNextNode(helperNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> helperNode = this.tail;
        for (int i = 0; i < size(); i++){
            returnString += "[Node{content=" + helperNode.getContent() + "}] --->";
            helperNode = helperNode.getNextNode();
        }
        if(this.size() != 0)
            returnString += "(back to start.)";
        else returnString += "[]";
        return returnString;
    }
}
