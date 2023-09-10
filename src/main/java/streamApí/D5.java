package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 5 - Calcule a média dos números maiores que 5:

Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class D5 {
    // List<Integer> numeros = Arrays.asList();
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,  5, 4, 3);
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D5 d5 = new D5();
        double media = d5.numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .average()
                .orElse(0);
        System.out.println("Média dos números maiores que 5: " + media);
    }
}
