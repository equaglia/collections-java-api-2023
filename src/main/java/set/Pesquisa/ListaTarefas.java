package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

/* Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
contarTarefas(): Conta o número total de tarefas na lista de tarefas.
obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */
public class ListaTarefas {
   
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    // adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao, false));
    }

    // removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!tarefas.isEmpty()) {
            for (Tarefa tarefa : tarefas) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = tarefa;
                }
                break;
            }
            tarefas.remove(tarefaRemover);            
        } else {
            System.out.println("A lista está vazia");
        }
    }

    // exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    // contarTarefas(): Conta o número total de tarefas na lista de tarefas.
    public int contarTarefas() {
        return tarefas.size();
    }

    // obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    // obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    // marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    // marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }

    // limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        // listaTarefas.adicionarTarefa("Tarefa 6");
        // listaTarefas.adicionarTarefa("Tarefa 7");
        // listaTarefas.adicionarTarefa("Tarefa 8");
        // listaTarefas.adicionarTarefa("Tarefa 9");
        // listaTarefas.adicionarTarefa("Tarefa 10");
        // listaTarefas.adicionarTarefa("Tarefa 11");
        // listaTarefas.adicionarTarefa("Tarefa 12");
        // listaTarefas.adicionarTarefa("Tarefa 13");
        // listaTarefas.adicionarTarefa("Tarefa 14");
        // listaTarefas.adicionarTarefa("Tarefa 15");
        // listaTarefas.adicionarTarefa("Tarefa 16");

        listaTarefas.exibirTarefas();

        System.out.println("Contagem de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        
        System.out.println("\nTarefas 1, 4 e 5 concluídas");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 4");
        listaTarefas.marcarTarefaConcluida("Tarefa 5");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        
        System.out.println("\nTarefas 1 pendente");
        listaTarefas.marcarTarefaPendente("Tarefa 1");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());   


        listaTarefas.limparListaTarefas();

        System.out.println("\nLista Limpa");

        listaTarefas.exibirTarefas();


        System.out.println("Contagem de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

    }
}
