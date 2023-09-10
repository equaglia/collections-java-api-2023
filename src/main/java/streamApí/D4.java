package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 4 - Remova todos os valores ímpares:

Utilize a Stream API para remover os valores ímpares da lista e imprima a lista 
resultante no console.
 */
public class D4 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D4 d4 = new D4();
        List<Integer> numerosPares = d4.numeros.stream()
            .filter(n -> n % 2 == 0)
            .toList();
        System.out.println(numerosPares);

    }
}
