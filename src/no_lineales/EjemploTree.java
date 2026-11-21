package no_lineales;

public class EjemploTree {
    static class Nodo {
        int valor;
        Nodo izq, der;
        Nodo(int valor) { this.valor = valor; }
    }

    static Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) return new Nodo(valor);
        if (valor < raiz.valor) raiz.izq = insertar(raiz.izq, valor);
        else raiz.der = insertar(raiz.der, valor);
        return raiz;
    }

    static void inorden(Nodo raiz) {
        if (raiz == null) return;
        inorden(raiz.izq);
        System.out.print(raiz.valor + " ");
        inorden(raiz.der);
    }

    public static void main(String[] args) {
        Nodo raiz = null;
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) raiz = insertar(raiz, v);
        System.out.print("Recorrido inorden: ");
        inorden(raiz);
    }
}
