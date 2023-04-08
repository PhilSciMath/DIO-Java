package br.com.dio.datastructures.binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;
    public BinaryTree(){
        this.root = null;
    }

    public void insert(T content){
        BinNode<T> fresh = new BinNode<>(content);
        this.root = insert(root, fresh);
    }

    private BinNode<T> insert(BinNode<T> current, BinNode<T> fresh){
        if (current == null)
            return fresh;
        else if (fresh.getContent().compareTo(current.getContent()) < 0)
            current.setLeftNode(insert(current.getLeftNode(), fresh));
        else
            current.setRightNode(insert(current.getRightNode(), fresh));
        return current;
    }

    public void printInOrder(){
        System.out.println("\nIn Order:");
        printInOrder(this.root);
    }

    private void printInOrder(BinNode<T> current){
        if (current != null){
            printInOrder(current.getLeftNode());
            System.out.print(current.getContent() + ", ");
            printInOrder(current.getRightNode());
        }
    }

    public void printPostOrder(){
        System.out.println("\nPost Order:");
        printPostOrder(this.root);
    }

    private void printPostOrder(BinNode<T> current){
        if (current != null){
            printPostOrder(current.getLeftNode());
            printPostOrder(current.getRightNode());
            System.out.print(current.getContent() + ", ");
        }
    }

    public void printPreOrder(){
        System.out.println("\nPre Order:");
        printPreOrder(this.root);
    }

    private void printPreOrder(BinNode<T> current){
        if (current != null){
            System.out.print(current.getContent() + ", ");
            printPreOrder(current.getLeftNode());
            printPreOrder(current.getRightNode());
        }
    }

    public void remove(T content){
        try{
            BinNode<T> current = this.root;
            BinNode<T> parent = null;
            BinNode<T> child = null;
            BinNode<T> temp = null;

            while (current != null && !current.getContent().equals(content)){
                parent = current;
                if (content.compareTo(current.getContent()) < 0) {
                    current = current.getLeftNode();
                }else {
                    current = current.getRightNode();
                }
            }
            if (current == null) {
                System.out.println("(Try) Nothing found.");
            }

            if(parent == null){
                if (current.getRightNode() == null){
                    this.root = current.getLeftNode();
                } else if (current.getLeftNode() == null) {
                    this.root = current.getRightNode();
                }else{
                    for (temp = current, child = current.getLeftNode();
                        child.getRightNode() != null;
                        temp = child, child = child.getLeftNode()
                    ){
                        if (child != current.getLeftNode()) {
                            temp.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }
                    }
                    child.setRightNode(root.getRightNode());
                    root = child;
                }
            } else if (current.getRightNode() == null) {
                if (parent.getLeftNode() == current){
                    parent.setLeftNode(current.getLeftNode());
                }else{
                    parent.setRightNode(current.getLeftNode());
                }
            } else if (current.getLeftNode() == null) {
                if (parent.getLeftNode() == current){
                    parent.setLeftNode(current.getRightNode());
                }else{
                    parent.setRightNode(current.getRightNode());
                }
            }else{
                for (temp = current, child = current.getLeftNode();
                    child.getRightNode() != null;
                    temp = child, child = child.getRightNode()
                ){
                    if (child != current.getLeftNode()){
                        temp.setRightNode(child.getLeftNode());
                        child.setLeftNode(current.getLeftNode());
                    }
                    child.setRightNode(current.getRightNode());
                    if (parent.getLeftNode() == current){
                        parent.setLeftNode(child);
                    }else {
                        parent.setRightNode(child);
                    }
                }
            }
        }catch (NullPointerException error){
            System.out.println("(Catch) Nothing found.");
        }

    }

}
