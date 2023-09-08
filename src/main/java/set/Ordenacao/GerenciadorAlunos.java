package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Lista de Alunos
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. 
Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.
 */
public class GerenciadorAlunos {
    
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    // adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
    public void adicionarAluno(String nome, Long matricula, double media) {
        this.alunos.add(new Aluno(nome, matricula, media));
    }

    // removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        if (!alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula() == matricula) {
                    alunoRemover = aluno;
                    break;
                }
            }
            alunos.remove(alunoRemover);
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
        if (alunoRemover != null) {
            System.out.println("Aluno removido com sucesso");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    // exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunos);
        if (!alunos.isEmpty()) {
            System.out.println("Alunos por Nome: " + alunosPorNome);
        } else {
            System.out.println("Conjunto Vazio");
        }
    }

    // exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunos.isEmpty()) {
            alunosPorNota.addAll(this.alunos);
            System.out.println("Alunos por Nota: " + alunosPorNota);
        } else {
            System.out.println("Conjunto Vazio");
        }
    }

    // exibirAlunos(): Exibe todos os alunos do conjunto.
    public Set<Aluno> exibirAlunos() {
        if (!alunos.isEmpty()) {
            return alunos;
        } else {
            throw new RuntimeException("Conjunto Vazio");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("João", 1L, 7.0);
        gerenciadorAlunos.adicionarAluno("Maria", 2L, 9.0);
        gerenciadorAlunos.adicionarAluno("Pedro", 3L, 8.0);
        gerenciadorAlunos.adicionarAluno("Ana", 4L, 6.0);
        gerenciadorAlunos.adicionarAluno("Joaquim", 5L, 10.0);
        gerenciadorAlunos.adicionarAluno("Joaquim", 5L, 10.0);

        System.out.println("Alunos: " + gerenciadorAlunos.exibirAlunos());
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

        System.out.println("\nRemovendo Pedro");
        gerenciadorAlunos.removerAluno(3L); 
        System.out.println("Alunos: " + gerenciadorAlunos.exibirAlunos());


    }
}

