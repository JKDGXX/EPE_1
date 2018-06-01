/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionBD;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

public class vendedor {

    Connection conexion = null;
    Statement sentencia = null;
    String nombreBD = "arriendoAuto";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    ResultSet rs = null;
    ResultSet rs2 = null;
    String usuario = "root";
    String contraseña = "1234";

    String nombre;
    String apellido;
    String nombreUsuario;
    String telefono;
    String correo;
    String direccion;
    String fechaNacimiento;

    public vendedor(String user, String pass) {
        verDetallesDeCuenta(user, pass);
    }

    public vendedor() {

    }

    /*VALIDACION DATOS LOGIN*/
    public String validacionDatosVendedor(String user, String pass) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "select * from vendedor join usuario on vendedor.id_vendedor=usuario.id_vendedor  where usuario='" + user + "' and contraseña='" + pass + "'";
            rs = sentencia.executeQuery(SQL);

            if (rs.next()) {

                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");

                mensaje = "<script>alert('BIENVENIDO " + nombre + " " + apellido + "');"
                        + "location.href='menuAdministrador.jsp';"
                        + "</script>";

            } else {

                mensaje = "<script>"
                        + "alert('Datos Incorrectos !!!');"
                        + "location.href='login.jsp';"
                        + "</script>";
            }
            sentencia.close();
            conexion.close();

        } catch (Exception Error) {

            String e = Error.getMessage();
            mensaje = "<script>alert('Error');"
                    + "location.href='login.jsp';"
                    + "</script>";

        }
        return mensaje;
    }

    /*VALIDACION DATOS LOGIN*/

 /*ACTUALIZAR CONTRASEÑA DEL USUARIO*/
    public String cambiarContraseñaUsuario(String passNueva, String passActual, String usuario) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, this.usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "update usuario set contraseña='" + passNueva + "'where contraseña='" + passActual + "' and usuario='" + usuario + "'";
            sentencia.executeUpdate(SQL);

            mensaje = "<script> alert('CONTRASEÑA ACTUALIZADA CON EXITO !!! ');"
                    + "location.href='cambiarContrasena.jsp';"
                    + "</script>";

            sentencia.close();
            conexion.close();
        } catch (Exception Error) {
            mensaje = "<script> alert('ERROR EN EL SISTEMA!!! ');"
                    + "location.href='cambiarContraseña.jsp';"
                    + "</script>";

        }

        return mensaje;
    }

    /*DETALLES DE LA CUENTA*/
    public void verDetallesDeCuenta(String user, String pass) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "select * from vendedor join usuario on vendedor.id_vendedor=usuario.id_vendedor  where usuario='" + user + "' and contraseña='" + pass + "'";
            rs = sentencia.executeQuery(SQL);

            while (rs.next()) {
                this.nombre = rs.getString("nombre");
                this.apellido = rs.getString("apellido");
                this.nombreUsuario = rs.getString("usuario");
                this.telefono = rs.getString("teléfono");
                this.correo = rs.getString("email");
                this.direccion = rs.getString("dirección");
                this.fechaNacimiento = rs.getString("fecha_nacimiento");
            }

            sentencia.close();
            conexion.close();

        } catch (Exception Error) {

            String e = Error.getMessage();
            mensaje = "<script>alert('Error');"
                    + "location.href='login.jsp';"
                    + "</script>";

        }
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    public String getApellido(){
        
        return this.apellido;
    }
    public String getNombreUsuario(){
        
        return this.nombreUsuario;
    }
    public String getTelefono(){
        
       return this.telefono;
    }
    public String getCorreo(){
        
        return this.correo;
    }
    public String getDireccion(){
        
        return this.direccion;
    }
    public String getFechaNacimiento(){
        
        return this.fechaNacimiento;
    }
}