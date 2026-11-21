package no_lineales;

import java.util.LinkedHashSet;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicado
        System.out.println(set);
    }
}
