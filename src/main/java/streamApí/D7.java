package main.java.streamApí;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 
 * Desafio 7 - Encontrar o segundo número maior da lista:

Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no 
console.
 */
public class D7 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D7 d7 = new D7();
        int segundoNumeroMaior = d7.numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Segundo número maior: " + segundoNumeroMaior);
    }
}
