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

    String nombre;
    String apellido;
    String telefono;
    String email;
    String direccion;

    /*INSTANCIA CLASE MENSAJES*/
    mensajes msg = new mensajes();

    public cliente(String id) {

        this.listarCliente(id);

    }

    public cliente() {

    }

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

    /*ACTUALIZAR CLIENTES*/
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

    /*ACTUALIZAR CONTRASEÑA DEL USUARIO*/
    public String cambiarContraseñaUsuario(String passNueva, String user, String pass) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "update usuario set contraseña='" + passNueva + "'where usuario='" + user + "' and contraseña='" + pass + "'";
            sentencia.executeQuery(SQL);
            mensaje = "<script> alert('DATOS ACTUALIZADOS CON EXITO !!! ');"
                    + "location.href='';"
                    + "</script>";

            sentencia.close();
            conexion.close();
        } catch (Exception Error) {
            this.msg.errorGeneral();
        }

        return mensaje;
    }
    

    /*LISTAR CLIENTE*/
    public void listarCliente(String id) {

        nombre = "";
        apellido = "";
        telefono = "";
        email = "";
        direccion = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            sentencia = conexion.createStatement();
            String SQL = "select * from cliente where id_cliente='" + id + "'";
            rs = sentencia.executeQuery(SQL);

            int c = 0;
            while (rs.next()) {
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                telefono = rs.getString("teléfono");
                email = rs.getString("email");
                direccion = rs.getString("direccion");
            }

        } catch (Exception Error) {

        }

    }


    /*RETORNO DE DATOS*/
    public String getNombre() {

        return this.nombre;
    }

    public String getApellido() {

        return this.apellido;
    }

    public String getTelefono() {

        return this.telefono;
    }

    public String getEmail() {

        return this.email;
    }

    public String getDireccion() {

        return this.direccion;
    }

}
