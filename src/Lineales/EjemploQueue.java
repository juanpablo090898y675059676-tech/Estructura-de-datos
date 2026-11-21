package lineales;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("Cliente 1");
        cola.add("Cliente 2");
        cola.add("Cliente 3");
        System.out.println("Atendiendo: " + cola.poll());
        System.out.println("Siguiente: " + cola.peek());
        System.out.println("Cola: " + cola);
    }
}
