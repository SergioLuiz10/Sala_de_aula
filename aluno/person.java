package aluno;

import java.util.Objects;

public class person {
    protected String nome;
     protected double nota;

    public person(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Double.compare(nota, person.nota) == 0 && Objects.equals(nome, person.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
