package lineales;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.addFirst(0);
        lista.addLast(2);
        System.out.println(lista);
        lista.removeFirst();
        System.out.println("Primero: " + lista.getFirst());
    }
}
