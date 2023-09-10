package main.java.streamApí;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/* 
 * Desafio 18 - Verifique se todos os números da lista são iguais:

Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba 
o resultado no console.
 */
public class D18 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    // List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

    public static void main(String[] args) {
        D18 d18 = new D18();

        // BinaryOperator<Boolean> iguaisEmNumeros = (n1, n2) -> n1 == n2;

        List<Integer> numerosOrdenados = d18.numeros.stream()
                .sorted()
                .toList();

        Integer primeiro = numerosOrdenados.get(0);
        Integer ultimo = numerosOrdenados.get(numerosOrdenados.size() - 1);

        if (primeiro == ultimo) {
            System.out.println("Todos os números iguais: " + true);
        } else {
            System.out.println("Todos os números iguais: " + false);
        }
    }
}