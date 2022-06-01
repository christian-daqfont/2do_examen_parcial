package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Usuario;

public interface UsuarioDao {
    int create(Usuario usuario);
    int update(Usuario usuario);
    int delete(int id);
    Usuario read(int id);
    List<Usuario> readAll();
}
