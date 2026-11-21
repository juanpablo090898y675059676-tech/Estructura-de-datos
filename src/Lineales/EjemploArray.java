package lineales;

public class EjemploArray {
    public static void main(String[] args) {
        // Arreglo de tamaño fijo
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorrer el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // Modificar un elemento
        numeros[2] = 99;
        System.out.println("Nuevo valor en posición 2: " + numeros[2]);
    }
}
