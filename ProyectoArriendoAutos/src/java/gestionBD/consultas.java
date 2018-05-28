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

public class consultas {

    Connection conexion = null;
    Statement sentencia = null;
    String nombreBD = "arriendoAuto";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    ResultSet rs = null;
    ResultSet rs2 = null;
    String usuario = "root";
    String contraseña = "";

    public String validacionDatosUsuario(String user, String pass) {
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

    public String ingresoCliente(String nombre, String apellido,String telefono,String email,String direccion,String fechaNacimiento){
        String mensaje=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(url, usuario, contraseña);
            sentencia=conexion.createStatement();
            
            String SQL="insert into cliente(nombre,apellido,teléfono,email,direccion,fecha_nacimiento)values ('" + nombre + "','" + apellido + "','" + telefono +"','" +email+ "','" +direccion+ "','" +fechaNacimiento+"')";
            sentencia.execute(SQL);
            
            mensaje="<script>alert('DATOS INGRESADOS CON EXITO !!!');"
                    + "location.href='menuAdministrador.jsp';"
                    + "</script>";
            
            sentencia.close();
            conexion.close();
        }catch(Exception Error){
            mensaje="<script>alert('ERROR AL INGRESAR DATOS !!!');"
                    + "location.href='menuAdministrador.jsp';"
                    + "</script>";
        }
    
        return mensaje;
    }
}
