package main.java.streamApí;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
 * Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e 
exiba o resultado no console.
 */
public class D9 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D9 d9 = new D9();
        Collections.shuffle(d9.numeros);

        d9.numeros.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
