package lineales;

import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.add(15);
        vector.remove(Integer.valueOf(10));
        System.out.println("Vector: " + vector);
        System.out.println("Tamaño: " + vector.size());
    }
}
