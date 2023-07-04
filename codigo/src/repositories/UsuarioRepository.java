package repositories;

import models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuarios;

    public UsuarioRepository() {
        usuarios = new ArrayList<Usuario>();
    }

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarTodos() {
        return this.listarTodos();
    }

}
