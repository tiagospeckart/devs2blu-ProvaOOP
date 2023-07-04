package models;

import enums.StatusLivro;

public class Livro {
    private int id;
    private String nome;
    private StatusLivro statusLivro;

    public Livro() {

    }

    public Livro(int id, String nome, StatusLivro statusLivro) {
        this.id = id;
        this.nome = nome;
        this.statusLivro = statusLivro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", statusLivro=" + statusLivro +
                '}';
    }
}
