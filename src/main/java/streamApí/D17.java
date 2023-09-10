package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 17 - Filtrar os números primos da lista:

Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */
public class D17 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D17 d17 = new D17();
        List<Integer> primosEmNumeros = d17.numeros.stream()
                .filter(n -> ehPrimo(n.intValue()))
                .toList();

        System.out.println("Lista de primos: " + primosEmNumeros);
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}
