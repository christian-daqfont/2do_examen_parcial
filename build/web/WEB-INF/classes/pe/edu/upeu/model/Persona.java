package pe.edu.upeu.model;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private int idpersona;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Date fecha; 
    private String estado;

}
