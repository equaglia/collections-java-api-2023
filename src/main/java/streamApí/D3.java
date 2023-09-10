package main.java.streamApí;

import java.util.Arrays;
import java.util.List;

/* 
 * Desafio 3 - Verifique se todos os números da lista são positivos:

Com a ajuda da Stream API, verifique se todos os números da lista são positivos 
e exiba o resultado no console.
 */
public class D3 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    // static List<Integer> numeros = Arrays.asList(1, -2, 3, 4, 5, 6, 7, -8, 9, 10, 5, 4, 3);
    // static List<Integer> numeros = Arrays.asList();

    int positivos = (int) numeros.stream()
        .filter(n -> n > 0)
        .count();

    public static void main(String[] args) {
        D3 d3 = new D3();
        
        if (d3.numeros.size() == 0) {
            System.out.println("Nenhum número encontrado.");
            
        } else {
            System.out.println("Quantidade de positivos: " + d3.positivos);
            
            if (d3.numeros.stream().allMatch(n -> n > 0)) {
                System.out.println("Todos os números são positivos");
                
            } else {
                System.out.println("Alguns números não são positivos");
            }
        }
    }
}
