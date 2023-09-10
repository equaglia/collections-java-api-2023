package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o 
resultado no console.
 */
public class D11 {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); // 435
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // 140
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4); // 30
    // List<Integer> numeros = Arrays.asList(1, 2); // 5

    public static void main(String[] args) {
        D11 d11 = new D11();
        System.out.println("Soma dos quadrados: " + d11.numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum));
    }
}
