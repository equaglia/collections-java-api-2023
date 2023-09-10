package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 15 - Verifique se a lista contém pelo menos um número negativo:

Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo 
e exiba o resultado no console.
 */
public class D15 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        D15 d15 = new D15();

        if (d15.numeros.stream()
                .anyMatch(n -> n < 0)) {
                    int resultado = d15.numeros.stream()
                        .filter(n -> n < 0)
                        .findAny()
                        .orElse(null);
                    System.out.println("Lista contem pelo menos um número negativo: " + resultado);
            
        } else {
            System.out.println("Lista não contem nenhum número negativo");
            
        }
    }
}
