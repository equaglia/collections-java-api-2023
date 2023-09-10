package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto 
por 3 quanto por 5 e exiba o resultado no console.
 */
public class D19 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    // List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 5, 4, 3);
    // List<Integer> numeros = Arrays.asList(15, 30, 45, 60);

    public static void main(String[] args) {
        D19 d19 = new D19();
        int divisiveisPor3ePor5 = d19.numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("Soma dos numeros divisiveis tanto por 3 quanto por 5: " + divisiveisPor3ePor5);


    }
}
