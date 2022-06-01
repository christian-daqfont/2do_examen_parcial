package pe.edu.upeu.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.model.Usuario;

@WebService(serviceName = "UsuarioWebService")
public class UsuarioWebService {
UsuarioDao usuDao = new UsuarioDaoImpl();

    @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "username") String username, 
                        @WebParam(name = "password") String password, 
                        @WebParam(name = "idpersona") int idpersona, 
                        @WebParam(name = "idrol") int idrol, 
                        @WebParam(name = "fecha") String fecha, 
                        @WebParam(name = "estado") String estado) {
        return usuDao.create(new Usuario(0, username,
                                                password,
                                                fecha,
                                                estado,
                                                idpersona,
                                                idrol));
    }

    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "username") String username, 
                      @WebParam(name = "password") String password, 
                      @WebParam(name = "idpersona") int idpersona, 
                      @WebParam(name = "idrol") int idrol, 
                      @WebParam(name = "fecha") String fecha, 
                      @WebParam(name = "estado") String estado) {
        return usuDao.update(new Usuario(0,
                                         username,
                                         password,
                                         fecha,
                                         estado,
                                         idpersona,
                                         idrol));
    }

    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "idusuario") int idusuario) {
        return usuDao.delete(idusuario);
    }

    @WebMethod(operationName = "read")
    public Usuario read(@WebParam(name = "idusuario") int idusuario) {
        return usuDao.read(idusuario);
    }

    @WebMethod(operationName = "readAll")
    public List<Usuario> readAll() {
        return usuDao.readAll();
    }

}
