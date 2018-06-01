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
public class vehiculos {

    Connection conexion = null;
    Statement sentencia = null;
    String nombreBD = "arriendoauto";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    ResultSet rs = null;
    String usuario = "root";
    String contraseña = "1234";

    String tipo;
    String marca;
    String color;
    String modelo;

    /*INSTANCIA CLASE MENSAJES*/
    mensajes msg = new mensajes();

    /*INGRESO DE CLIENTES*/
    public String ingresoVehiculos(String tipo, String marca, String color, String modelo) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "insert into vehiculos(tipo,marca,color,modelo)values ('" + tipo + "','" + marca + "','" + color + "','" + modelo + "' )";
            sentencia.execute(SQL);

            mensaje = "<script>alert('DATOS INGRESADOS CON EXITO !!!');"
                    + "location.href='ingresarVehiculos.jsp';"
                    + "</script>";

            sentencia.close();
            conexion.close();
        } catch (Exception Error) {
            mensaje = msg.errorExceptionIngresoCliente();
        }

        return mensaje;
    }

    /*INGRESO DE VEHICULOS*/
    
}
