package com.company;

public class ListaLigada {
    private Node root;

    public Node getRoot(){
        return root;
    }

    public void insert(int valor){
        Node n = new Node(valor);
        if(root == null) {
            root = n;
            return;
        }
        Node current = this.getRoot();

        while (current.getNext() != null){
            current = current.getNext();
        }
        current = current.getNext();
    }

}
