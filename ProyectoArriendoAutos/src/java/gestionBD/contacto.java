/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kevin
 */
public class contacto {

    public static String mensajeContacto(String nom, String ape, String email, String mensaj) {
        mensajes msg = new mensajes();
        String mensaje = null;
        Connection conexion = null;
        Statement sentencia = null;
        String nombreBD = "arriendoauto";
        String url = "jdbc:mysql://localhost:3306/" + nombreBD;
        String usuario = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            sentencia = conexion.createStatement();
            String SQL = "INSERT INTO contacto("
                    + "nombre, apellido, email, mensaje) "
                    + "VALUES('" + nom + "','" + ape + "','" + email + "','" + mensaj + "')";
            sentencia.executeUpdate(SQL);
            mensaje = "<script>alert('DATOS ENVIADOS !!!');"
                    + "location.href='contacto.jsp';"
                    + "</script>";
            sentencia.close();
            conexion.close();   
        } catch (Exception Error) {
            mensaje = msg.errorExceptionmensajeContacto();
        }return mensaje;
    }
}
