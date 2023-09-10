package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 12 - Encontre o produto de todos os números da lista:

Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o 
resultado no console.
 */
public class D12 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); // 217728000
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // 5040
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4); // 24
    // List<Integer> numeros = Arrays.asList(1, 2); // 2

    public static void main(String[] args) {
        D12 d12 = new D12();
        System.out.println("Produto: " + d12.numeros.stream()
                .reduce(1, (a, b) -> a * b));
    }
}
