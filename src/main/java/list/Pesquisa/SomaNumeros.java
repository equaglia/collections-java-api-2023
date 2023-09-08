package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;
    
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    /**
     * Adiciona um número à lista de números.
     * @param numero
     */
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    
    // calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma(){
        if (numeros.size() == 0) {
            throw new RuntimeException("Nenhum número encontrado.");
        }
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
    
    // encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
    public int encontrarMaiorNumero() {
        if (numeros.size() == 0) {
            throw new RuntimeException("Nenhum número encontrado.");
        }

        int maiorNumero = 0;
        for (int numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    // encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero() {
        if (numeros.size() == 0) {
            throw new RuntimeException("Nenhum número encontrado.");
        }

        int menorNumero = 0;
        for (int numero : numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    // exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros() {
        if (numeros.size() == 0) {
            System.out.println("Nenhum número encontrado.");
            
        } else {
            System.out.println("Numeros: ");   
            for (int numero : numeros) {
                System.out.print(numero + ", ");
            }
        }
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        
        System.out.println("Lista Vazia");
        somaNumeros.exibirNumeros();
        // System.out.println("Soma: " + somaNumeros.calcularSoma());
        // System.out.println("'Maior' numero: " + somaNumeros.encontrarMaiorNumero());
        // System.out.println("'Menor' numero: " + somaNumeros.encontrarMenorNumero());

        System.out.println("\nAdicionando 20 números...");
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(16);
        somaNumeros.adicionarNumero(17);
        somaNumeros.adicionarNumero(18);
        somaNumeros.adicionarNumero(19);
 
        somaNumeros.exibirNumeros();
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("'Maior' numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("'Menor' numero: " + somaNumeros.encontrarMenorNumero());

    }
}