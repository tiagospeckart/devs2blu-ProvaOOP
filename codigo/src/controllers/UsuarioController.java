package controllers;

import models.Livro;
import models.Usuario;
import repositories.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    UsuarioRepository repository;
    private List<Livro> livrosEmprestados;

    public UsuarioController(){
        repository = new UsuarioRepository();
        livrosEmprestados = new ArrayList<Livro>();
    }

    //public List<Usuario> listarUsuarios(){

    //}

    public void adicionarLivro(Livro livro) {
        this.livrosEmprestados.add(livro);
    }

    public List<Livro> listarLivros() {
        return this.livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}
