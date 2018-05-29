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
import gestionBD.mensajes;

public class cliente {

    Connection conexion = null;
    Statement sentencia = null;
    String nombreBD = "arriendoAuto";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    ResultSet rs = null;
    String usuario = "root";
    String contraseña = "1234";

    /*INSTANCIA CLASE MENSAJES*/
    mensajes msg = new mensajes();

    /*INGRESO DE CLIENTES*/
    public String ingresoCliente(String nombre, String apellido, String telefono, String email, String direccion, String fechaNacimiento) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "insert into cliente(nombre,apellido,teléfono,email,direccion,fecha_nacimiento)values ('" + nombre + "','" + apellido + "','" + telefono + "','" + email + "','" + direccion + "','" + fechaNacimiento + "')";
            sentencia.execute(SQL);

            mensaje = "<script>alert('DATOS INGRESADOS CON EXITO !!!');"
                    + "location.href='ingresoCliente.jsp';"
                    + "</script>";

            sentencia.close();
            conexion.close();
        } catch (Exception Error) {
            mensaje = msg.errorExceptionIngresoCliente();
        }

        return mensaje;
    }

    /*INGRESO DE CLIENTES*/

 /*ELIMINAR CLIENTES*/
    public String eliminarClientes(String id) {
        String mensaje = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "delete from cliente where id_cliente='" + id + "'";
            sentencia.execute(SQL);
            mensaje = "<script> alert('CLIENTE ELIMINADO CON EXITO');"
                    + "location.href='eliminarCliente.jsp';"
                    + "</script>";
            sentencia.close();
            conexion.close();
        } catch (Exception Error) {

            mensaje = msg.errorExceptionEliminarCliente();

        }

        return mensaje;
    }

    /*ELIMINAR CLIENTES*/
    public String actualizarCliente(String nombre, String apellido, String telefono, String email, String direccion, String id) {
        String mensaje = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "update cliente set nombre ='" + nombre + "',apellido ='" + apellido + "',direccion ='" + direccion + "',teléfono='" + telefono + "',email='" + email + "',direccion='" + direccion + "' where id_cliente ='" + id + "'";
            sentencia.executeUpdate(SQL);

            mensaje = "<script>"
                    + "alert('DATOS MODIFICADOS CON EXITO');"
                    + "location.href='eliminarCliente.jsp';"
                    + "</script>";
            sentencia.close();
            conexion.close();
        } catch (Exception Error) {

            mensaje = msg.errorExceptionActualizarCliente();

        }

        return mensaje;
    }
}
