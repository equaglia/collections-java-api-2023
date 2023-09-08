package main.java.set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "[" + nome + ", matricula=" + matricula + ", " + nota + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aluno aluno)) {
            return false;
        }
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return (int) (getMatricula() ^ (getMatricula() >>> 32));
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}