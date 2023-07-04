package repositories;

import enums.StatusLivro;
import models.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros;

    public LivroRepository() {
        livros = new ArrayList<Livro>();
    }

    public void salvar(Livro livro) {
        livros.add(livro);
    }

    public void excluir(int idLivro) {
        Livro livroEscluir = livros.stream().filter(l -> l.getId() == idLivro).findAny().orElse(null);
    }
    public List<Livro> listarTodos() {
        return this.livros;
    }

    public void atualizarStatusLivro(int idLivro) {
        Livro livroDevolver = this.livros.stream().filter(l -> l.getId() == idLivro ).findAny().orElse(null);
        livroDevolver.setStatusLivro(StatusLivro.Diponivel);
    }
}
