package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

/* Conjunto de Palavras Únicas
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
removerPalavra(String palavra): Remove uma palavra do conjunto.
verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */
public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    // adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra)
    {
        this.palavrasUnicas.add(palavra);
    }

    // removerPalavra(String palavra): Remove uma palavra do conjunto.
    public void removerPalavra(String palavra)
    {
        if (!this.palavrasUnicas.isEmpty()){
            if (this.palavrasUnicas.contains(palavra)) {
                this.palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("Lista Vazia");
        }   
    }

    // verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
    public boolean verificarPalavra(String palavra)
    {
        return this.palavrasUnicas.contains(palavra);
    }

    // exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas()
    {
        if (this.palavrasUnicas.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (String palavra : this.palavrasUnicas) {
                System.out.println(palavra);
            }
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        System.out.println("Lista Vazia");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nConjunto de Palavras Únicas");
        conjuntoPalavrasUnicas.adicionarPalavra("A");
        conjuntoPalavrasUnicas.adicionarPalavra("B");
        conjuntoPalavrasUnicas.adicionarPalavra("C");
        conjuntoPalavrasUnicas.adicionarPalavra("A");
        conjuntoPalavrasUnicas.adicionarPalavra("B");
        conjuntoPalavrasUnicas.adicionarPalavra("C");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nRemovendo A");
        conjuntoPalavrasUnicas.removerPalavra("A");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nVerificando A");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("A"));

        System.out.println("\nVerificando B");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("B"));

        System.out.println("\nVerificando D");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("D"));
    }
}
