package controllers;

import models.Livro;
import repositories.LivroRepository;

import java.util.List;

public class LivroController {
    private LivroRepository repository;

    public LivroController() {
        repository = new LivroRepository();
    }

    public void adicionarLivro(Livro livro) {
        repository.salvar(livro);
    }

    public void excluirLivro(int id) {
        repository.excluir(id);
    }

    public List<Livro> listarTodosLivros() {
        return repository.listarTodos();
    }
}
