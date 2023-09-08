package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:
public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    // adicionarNumero(int numero): Adiciona um número à lista.
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
    
    // ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente()
    {
        List<Integer> ordemAscendente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(ordemAscendente);
        // } else {
        //     System.out.println("Lista Vazia");
        }
        return ordemAscendente;

    }

    // ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente()
    {
        List<Integer> ordemDescendente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(ordemDescendente, Collections.reverseOrder());
        // } else {
        //     System.out.println("Lista Vazia");
        }
        return ordemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        System.out.println("Lista Vazia");
        System.out.println("Lista Ordenada Ascendente:" + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Lista Ordenada Descendente:" + ordenacaoNumeros.ordenarDescendente());
        
        System.out.println("\nAdicionando 20 números...");
        ordenacaoNumeros.adicionarNumero(19);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(11);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(17);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(14);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(16);
        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(18);
        ordenacaoNumeros.adicionarNumero(12);

        System.out.println("Lista Ordenada Ascendente:" + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Lista Ordenada Descendente:" + ordenacaoNumeros.ordenarDescendente());
    }
}
