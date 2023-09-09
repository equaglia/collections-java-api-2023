package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

/* Dicionário
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas 
respectivas definições. Implemente os seguintes métodos:

adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
 */
public class Dicionario {
    
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    // adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    public void adicionarPalavra(String palavra, String definicao){
        this.dicionario.put(palavra, definicao);
    }
    
    // removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
    public void removerPalavra(String palavra){
        if (!dicionario.isEmpty()){
            this.dicionario.remove(palavra);
        } else {
            System.out.println("Dicionario Vazio");
        }
    }
    
    // exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    public void exibirPalavras()
    {
        for (String palavra : this.dicionario.keySet()) {
            System.out.println(palavra + " - " + this.dicionario.get(palavra));
        }
    }

    // pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    public String pesquisarPorPalavra(String palavra){
        return this.dicionario.get(palavra);
    }

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Linguagem de programação");
        dicionario.adicionarPalavra("Python", "Linguagem de programação");
        dicionario.adicionarPalavra("PHP", "Linguagem de programação");
        dicionario.adicionarPalavra("C#", "Linguagem de programação");

        dicionario.exibirPalavras();

        System.out.println("\nRemovendo Java");
        dicionario.removerPalavra("Java");
        dicionario.exibirPalavras();

        System.out.println("\nVerificando Java");
        System.out.println(dicionario.pesquisarPorPalavra("Java"));

        System.out.println("\nVerificando C#");
        System.out.println(dicionario.pesquisarPorPalavra("C#"));
        
    }
}
