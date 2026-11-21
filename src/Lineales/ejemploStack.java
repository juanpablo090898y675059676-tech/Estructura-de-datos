package lineales;

import java.util.Stack;

public class ejemploStack {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Tope: " + pila.peek());
        System.out.println("Sacado: " + pila.pop());
        System.out.println("Pila: " + pila);
    }
}
