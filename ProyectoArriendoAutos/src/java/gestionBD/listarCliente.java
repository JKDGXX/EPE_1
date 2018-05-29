package gestionBD;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import gestionBD.mensajes;

public class listarCliente {

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
    String telefono;
    String email;
    String direccion;

    mensajes msg = new mensajes();

    public listarCliente(String id) {

        this.listarCliente(id);

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
    /**
     * **************************
     */
}
