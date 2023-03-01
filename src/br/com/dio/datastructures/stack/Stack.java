// Implementation of a stack (pile) class.

package br.com.dio.datastructures.stack;

public class Stack {

    private Node refTopNode;

    public Stack() {
        this.refTopNode = null;
    }

    // Methods: pop, top, push, isEmpty.
    public Node top(){
        return refTopNode;
    }

    public void push(Node newNode){
        Node storeRef = refTopNode;
        refTopNode = newNode;
        refTopNode.setRefNextNode(storeRef);
    }

    public Node pop(){
        if(!this.isEmpty()){
            Node poppedNode = refTopNode;
            refTopNode = refTopNode.getRefNextNode();
            return poppedNode;
        }
        return null;
    }

    public boolean isEmpty(){
        if(refTopNode == null) return true;
        return false;
    }

    @Override
    public String toString(){
        String strReturn = "-------------------\n";
        strReturn += "     Stack\n";
        strReturn += "-------------------\n";

        Node helperNode = refTopNode;

        while (true){
            if(helperNode != null){
                strReturn += "[Node{data=" + helperNode.getData() + "}]\n";
                helperNode = helperNode.getRefNextNode();
            }
            else break;
        }
        strReturn += "====================\n";
        return strReturn;
    }

}
