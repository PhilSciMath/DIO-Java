package br.com.dio.datastructures.queue;

public class Queue {

    private Node NodeRefToQueueEntry;

    public Queue(){
        this.NodeRefToQueueEntry = null;
    }

    public void enqueue(Node newNode){
        newNode.setNodeRef(NodeRefToQueueEntry);
        NodeRefToQueueEntry = newNode;
    }

    public Node first(){
        if(!this.isEmpty()){
            Node firstNode = NodeRefToQueueEntry;
            while(true){
                if(firstNode.getNodeRef() != null){
                    firstNode = firstNode.getNodeRef();
                }else {
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node dequeue(){
        if(!this.isEmpty()){
            Node firstNode = NodeRefToQueueEntry;
            Node helperNode = NodeRefToQueueEntry;

            while(true){
                if(firstNode.getNodeRef() != null){
                    helperNode = firstNode;
                    firstNode = firstNode.getNodeRef();
                }
                else {
                    helperNode.setNodeRef(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty(){
        if(NodeRefToQueueEntry == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node helperNode = NodeRefToQueueEntry;

        if(NodeRefToQueueEntry != null){
            while (true){
                returnString += "[Node{object = " + helperNode.getObject() + "}] ---> ";

                if(helperNode.getNodeRef() != null){
                    helperNode = helperNode.getNodeRef();
                }else{
                    returnString += "null";
                    break;
                }
            }
        }else{
            returnString = "null";
        }

        return returnString;
    }
}
