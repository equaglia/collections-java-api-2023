package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 2 - Imprima a soma dos números pares da lista:

Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */
public class D2 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D2 d2 = new D2();

        int soma = d2.numeros.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Soma dos pares: " + soma);
        }
}
