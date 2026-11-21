package no_lineales;

import java.util.LinkedHashMap;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitales = new LinkedHashMap<>();
        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");
        capitales.put("Chile", "Santiago");
        for (String pais : capitales.keySet()) {
            System.out.println(pais + " -> " + capitales.get(pais));
        }
    }
}
