package main.java.map.Pesquisa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Contagem de Palavras
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a 
quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
 */
public class ContagemPalavras {

    private Map<String, Integer> contagem;

    public ContagemPalavras(){
        this.contagem = new HashMap<>();
    }


    
    // adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
    public void adicionarPalavra(String palavra, Integer contagem)
    {
        this.contagem.put(palavra, contagem);
    }

    // removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
    public void removerPalavra(String palavra)
    {
        if (!this.contagem.isEmpty()){
            this.contagem.remove(palavra);
        } else {
            System.out.println("Contagem Vazia");        
        }
    }

    // exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
    public void exibirContagemPalavras()
    {
        if (!this.contagem.isEmpty()){
            for (String palavra : this.contagem.keySet()) {
                System.out.println(palavra + " - " + this.contagem.get(palavra));
            }
            
        } else {
            System.out.println("Contagem Vazia");
            
        }
    }

    // encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
    public void encontrarPalavraMaisFrequente()
    {
        if (this.contagem.isEmpty()) {
            System.out.println("Contagem Vazia");
        } else {
            Map.Entry<String, Integer> max = Collections.max(this.contagem.entrySet(), Map.Entry.comparingByValue());
            System.out.println(max.getKey() + " - " + max.getValue());
        }
    }
    

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("Java", 1);
        contagem.adicionarPalavra("Python", 2);
        contagem.adicionarPalavra("PHP", 3);
        contagem.adicionarPalavra("C#", 4);
        contagem.exibirContagemPalavras();

        System.out.println("\nRemovendo Java");
        contagem.removerPalavra("Java");
        contagem.exibirContagemPalavras();

        System.out.println("\nPalavra mais frequente");
        contagem.encontrarPalavraMaisFrequente();
    }
}
