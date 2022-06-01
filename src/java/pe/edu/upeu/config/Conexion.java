/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author NITRO5
 */
public class Conexion {

    private static final String URL = "jdbc:postgresql://ec2-34-231-177-125.compute-1.amazonaws.com:5432/ddbh5lg0kffc44";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USER = "uzqeactcvutsro";
    private static final String PASS = "738645dfd5c6c71da8ce571d35661687831b85325b99cb7588512d59c00aa367";
    
    private static Connection cx = null;

    public static Connection getConex() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:" + e);
        }
        return cx;
    }
}
