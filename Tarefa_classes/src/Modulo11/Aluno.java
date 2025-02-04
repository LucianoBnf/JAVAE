package Modulo11;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Double nota;
    private String curso;
    private String sala;

    public Aluno(String nome,String curso, Double nota){
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }
    public Aluno(String nome,String curso, Double nota,String sala){
        this(nome, curso, nota);
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return  this.nome ;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}




