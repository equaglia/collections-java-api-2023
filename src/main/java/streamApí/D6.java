package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 6 - Verificar se a lista contém algum número maior que 10:

Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o 
resultado no console.
 */
public class D6 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

    public static void main(String[] args) {
        D6 d6 = new D6();
        boolean resultado = d6.numeros.stream()
                .anyMatch(n -> n > 10);
        System.out.println("Lista contém algum número maior que 10? " + resultado);
    }
}
