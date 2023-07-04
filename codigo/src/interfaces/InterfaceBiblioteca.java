package interfaces;

import models.*;
import repositories.UsuarioRepository;

import java.util.List;

public interface InterfaceBiblioteca {
    void salvar(Livro livro);
    void excluir(int id);
    List<Livro> listarLivros();
    void realizarEmprestimoLivro(Livro livro, Usuario usuario);
    void atualizarStatusLivro(int idLivro);
}
