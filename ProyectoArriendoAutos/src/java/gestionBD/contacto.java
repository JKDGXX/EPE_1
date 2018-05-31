/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kevin
 */
public class contacto {

    Connection conexion = null;
    Statement sentencia = null;
    String nombreBD = "arriendoAuto";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    ResultSet rs = null;
    String usuario = "root";
    String contraseña = "";

    String nom;
    String ape;
    String email;
    String mensaj;

    /*INSTANCIA CLASE MENSAJES*/
    mensajes msg = new mensajes();

    public String mensajeContacto(String nom, String ape, String email, String mensaj) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "insert into contacto(nombre,apellido,email,mensaje)values ('" + nom + "','" + ape + "','" + email + "','" + mensaj + "')";
            sentencia.execute(SQL);

            mensaje = "<script>alert('DATOS ENVIADOS !!!');"
                    + "location.href='contacto.jsp';"
                    + "</script>";

            sentencia.close();
            conexion.close();
        } catch (Exception Error) {
            mensaje = msg.errorExceptionmensajeContacto();
        }

        return mensaje;
    }

}
