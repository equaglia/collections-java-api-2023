package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 16 - Agrupe os números em pares e ímpares:

Utilize a Stream API para agrupar os números em duas listas separadas, uma 
contendo os números pares e outra contendo os números ímpares da lista original, 
e exiba os resultados no console.
 */
public class D16 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D16 d16 = new D16();
        List<Integer> pares = d16.numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        List<Integer> impares = d16.numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println("Numeros pares: " + pares);

        System.out.println("Numeros impares: " + impares);
    }
}
