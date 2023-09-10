package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 8 - Somar os dígitos de todos os números da lista:

Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o 
resultado no console.
 */
public class D8 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
    public static void main(String[] args) {
        D8 d8 = new D8();

        System.out.println("Números: " + d8.numeros);
        
        // Soma numeros de lista inicial
        int somaValores = d8.numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma dos números: " + somaValores);

        // Usar o BinaryOperator com expressão lambda para somar 2 números inteiros
        // BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;

        // Transformar uma lista de inteiros em uma String
        String numerosString = d8.numeros.stream()
            .map(e -> e.toString())
            .reduce("", String::concat);
        // System.out.println("Numeros string: " + numerosString);

        // Transformar um String em uma lista de caracteres
        List<Character> numerosListChar = numerosString.chars()
            .mapToObj(c -> (char) c)
            .toList();
        // System.out.println("Numeros list char: " + numerosListChar);

        // Transformar uma lista de character em uma lista de inteiros
        List<Integer> digitosList = numerosListChar.stream()
            .map(c -> c - '0')
            .toList();
        System.out.println("Dígitos: " + digitosList);

        int somDigitos = digitosList.stream()
                .mapToInt(Integer::intValue)
                .sum();
                // .reduce(0, soma); // alternativa para somar Integers usando BinaryOperator
        System.out.println("Soma dos dígitos: " + somDigitos);

    }
}
