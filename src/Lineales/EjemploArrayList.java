package lineales;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.remove("Python");
        System.out.println("Tamaño: " + lista.size());
        for (String s : lista) {
            System.out.println(s);
        }
    }
}
