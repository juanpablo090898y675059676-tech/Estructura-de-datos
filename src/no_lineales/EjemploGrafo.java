package no_lineales;

import java.util.*;

public class EjemploGrafo {
    public static void main(String[] args) {
        Map<String, List<String>> grafo = new HashMap<>();
        grafo.put("A", Arrays.asList("B", "C"));
        grafo.put("B", Arrays.asList("A", "D"));
        grafo.put("C", Arrays.asList("A"));
        grafo.put("D", Arrays.asList("B"));

        for (String nodo : grafo.keySet()) {
            System.out.println(nodo + " conectado con " + grafo.get(nodo));
        }
    }
}
