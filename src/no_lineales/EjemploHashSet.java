package no_lineales;

import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicado, se ignora
        System.out.println(set);
        System.out.println("¿Contiene Python? " + set.contains("Python"));
    }
}
