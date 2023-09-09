package main.java.map.Ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* Livraria Online
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza 
um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon 
Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui 
atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes 
métodos:

adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
 */
public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    // adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        this.livros.put(link, new Livro(titulo, autor, preco));
    }


    


    // removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> livro : this.livros.entrySet()) {
            if (livro.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(livro.getKey());
            }
        }
        if (!chavesRemover.isEmpty()) {
            for (String chave : chavesRemover) {
                this.livros.remove(chave);
            }
        } else {
            System.out.println("Livro não encontrado");
        }        
    }

    // exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return new TreeMap<>(livros);
    }

    // pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor)
    {
        Map<String, Livro> livrosAutor = new HashMap<>();
        for (Map.Entry<String, Livro> livro : this.livros.entrySet()) {
            if (livro.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosAutor.put(livro.getKey(), livro.getValue());
            }
        }
        return livrosAutor;
    }

    // obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
    public Livro obterLivroMaisCaro() {
        double maiorPreco = 0;
        Livro livroMaisCaro = null;
        for (Map.Entry<String, Livro> livro : this.livros.entrySet()) {
            if (livro.getValue().getPreco() > maiorPreco) {
                livroMaisCaro = livro.getValue();
                maiorPreco = livro.getValue().getPreco();
            }
        }
        return livroMaisCaro;
        
    }

    // exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
    public Livro exibirLivroMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        for (Map.Entry<String, Livro> livro : this.livros.entrySet()) {
            if (livro.getValue().getPreco() < menorPreco) {
                livroMaisBarato = livro.getValue();
                menorPreco = livro.getValue().getPreco();
            }
        }
        return livroMaisBarato;
    }


    public static void main(String[] args) {
        
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("https://www.amazon.com.br/Livro-Teste-1", "Livro de teste 1", "Autor A", 10.0);
        livraria.adicionarLivro("https://www.amazon.com.br/Livro-Teste-2", "Livro de teste 2", "Autor B", 20.0);
        livraria.adicionarLivro("https://www.amazon.com.br/Livro-Teste-3", "Livro de teste 3", "Autor B", 30.0);

        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

        System.out.println(livraria.pesquisarLivrosPorAutor("Autor A"));

        System.out.println("LIvro mais caro: " + livraria.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livraria.exibirLivroMaisBarato());

        System.out.println("\nRemovendo livro de teste 1");
        livraria.removerLivro("Livro de teste 1");
        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());

    }
}
