package br.com.dio.datastructures.linked_lists;

public class LinkedList<T> {
    Node<T> entryReference;
    public LinkedList(){
        this.entryReference = null;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if(this.isEmpty()){
            entryReference = newNode;
            return;
        }
        Node<T> helperNode = entryReference;
        for(int i = 0; i < this.size() - 1; i++){
            helperNode = helperNode.getNextNode();
        }
        helperNode.setNextNode(newNode);
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    public T remove(int index){
        Node<T> targetNode = this.getNode(index);
        if(index == 0){
            entryReference = targetNode.getNextNode();
            return targetNode.getContent();
        }
        Node<T> priorNode = getNode(index - 1);
        priorNode.setNextNode(targetNode.getNextNode());
        return targetNode.getContent();
    }

    private Node<T> getNode(int index){
        indexValidation(index);
        Node<T> helperNode = entryReference;
        Node<T> returnNode = null;
        for(int i = 0; i <= index; i++){
            returnNode = helperNode;
            helperNode = helperNode.getNextNode();
        }
        return returnNode;
    }

    public int size(){
        int listSize = 0;
        Node<T> helperReference = entryReference;
        while(true){
            if(helperReference != null){
                listSize++;
                if(helperReference.getNextNode() != null){
                    helperReference = entryReference.getNextNode();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return listSize;
    }

    private void indexValidation(int index){
        String str1 = "No content on index ";
        String str2 = " of this list. It goes only to index ";
        if(index >= size()){
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException(str1 + index + str2 + lastIndex + ".");
        }
    }

    public boolean isEmpty(){
        if (entryReference == null) return true;
        return false;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> helperNode = entryReference;
        for(int i = 0; i < this.size(); i++){
            returnString += "[Node{content=" + helperNode.getContent() + "}] --> ";
            helperNode = helperNode.getNextNode();
        }
        returnString += null;
        return returnString;
    }
}
