package repositories;

import enums.StatusLivro;
import interfaces.InterfaceBiblioteca;
import models.Biblioteca;
import models.Livro;
import models.Usuario;
import repositories.UsuarioRepository;

import java.util.List;

public class BibliotecaRepository{
    private Biblioteca biblioteca;


    public BibliotecaRepository () {

    }

    public void salvar(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }






}
