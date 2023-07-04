import controllers.BibliotecaController;
import controllers.LivroController;
import controllers.UsuarioController;
import enums.StatusLivro;
import models.*;
import repositories.BibliotecaRepository;
import repositories.LivroRepository;
import repositories.UsuarioRepository;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LivroRepository livroRepository = new LivroRepository();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        BibliotecaRepository bibliotecaRepository = new BibliotecaRepository();
        //criar Livros
        Livro livro1 = new Livro(1, "A volta dos que não foram", StatusLivro.Diponivel);
        Livro livro2 = new Livro(2, "A volta dos que não foram", StatusLivro.Diponivel);
        Livro livro3 = new Livro(3, "A volta dos que não foram", StatusLivro.Diponivel);
        //Criar um Usuário
        Usuario usuario = new Usuario(1, "João da Silva");
        //Criar uma Biblioteca
        Biblioteca biblioteca = new Biblioteca(1);





        //criando controllers
        LivroController livroController = new LivroController();
        UsuarioController usuarioController = new UsuarioController();
        BibliotecaController bibliotecaController = new BibliotecaController(livroRepository, usuarioRepository);

        //adicionar livros
        bibliotecaController.cadastraLivro(livro1);
        bibliotecaController.cadastraLivro(livro2);
        bibliotecaController.cadastraLivro(livro3);
        bibliotecaController.adicionarUsuario(usuario);

        //fazer emprestimo
        bibliotecaController.realizarEmprestimoLivro(livro1);


        //listar livros
        List<Livro> livros = livroRepository.listarTodos();
        for(Livro livro: livros) {
            System.out.println(livro);
        }




        }

}