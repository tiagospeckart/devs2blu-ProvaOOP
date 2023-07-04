package controllers;

import enums.StatusLivro;
import models.*;
import repositories.BibliotecaRepository;
import repositories.LivroRepository;
import repositories.UsuarioRepository;

public class BibliotecaController {

    private BibliotecaRepository bibliotecaRepository;
    private LivroRepository livroRepository;
    private UsuarioRepository usuarioRepository;

    public BibliotecaController(LivroRepository livroRepository, UsuarioRepository usuarioRepository) {
        this.bibliotecaRepository = new BibliotecaRepository();
        this.livroRepository =  livroRepository;
        this.usuarioRepository = usuarioRepository;

    }

    public void cadastraBiblioteca(Biblioteca biblioteca) {
        bibliotecaRepository.salvar(biblioteca);
    }
    public void cadastraLivro(Livro livro) {
        livroRepository.salvar(livro);
    }

    public void excluirLivro(int id) {
        livroRepository.excluir(id);
    }

    public void ListarTodosLivros(){
        for(Livro livro: livroRepository.listarTodos()) {
            System.out.println(livro);
        }
    }

    public void realizarDevolucaoLivro(int idLivro) {
        livroRepository.atualizarStatusLivro(idLivro);
    }

    public void realizarEmprestimoLivro(Livro livro) {
        Livro  livroEmprestado = livroRepository.listarTodos().stream().filter(l -> l.getId() == livro.getId()).findAny().orElse(null);
        livroEmprestado.setStatusLivro(StatusLivro.Emprestado);



    }

    public void adicionarUsuario(Usuario usuario) {
        usuarioRepository.salvar(usuario);
    }
}
