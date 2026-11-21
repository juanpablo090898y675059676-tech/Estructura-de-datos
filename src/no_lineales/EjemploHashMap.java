package no_lineales;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 45);
        notas.put("Luis", 38);
        notas.put("Sara", 50);
        System.out.println("Nota de Luis: " + notas.get("Luis"));
        for (String nombre : notas.keySet()) {
            System.out.println(nombre + ": " + notas.get(nombre));
        }
    }
}
