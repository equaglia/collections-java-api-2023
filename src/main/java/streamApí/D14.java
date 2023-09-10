package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 14 - Encontre o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class D14 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D14 d14 = new D14();

        List<Integer> primosEmNumeros = d14.numeros.stream()
                .filter(n -> ehPrimo(n.intValue()))
                .toList();

        System.out.println(primosEmNumeros);

        /*
         * System.out.println("Maior numero primo na lista: ");
         * primosEmNumeros.stream()
         * .max(Integer::compareTo)
         * .ifPresent(System.out::println);
         */

        Integer maiorNumeroPrimo = primosEmNumeros.stream()
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println("Maior numero primo na lista: " + maiorNumeroPrimo);
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
