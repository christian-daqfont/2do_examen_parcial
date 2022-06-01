package pe.edu.upeu.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private String fecha; 
    private String estado;
    private int idpersona;
    private int idrol;
    
}
