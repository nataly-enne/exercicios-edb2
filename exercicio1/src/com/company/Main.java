package com.company;

public class Main {

    public static void main(String[] args) {
	    ListaLigada lista = new ListaLigada();

	    lista.insert(10);
        lista.insert(20);
        lista.insert(30);

        Node current = lista.getRoot();

        while (current != null){
            System.out.println(current.getValor());
            current = current.getNext();
        }

    }
}
