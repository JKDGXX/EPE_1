package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import gestionBD.mensajes;

public class factura {

    Connection conexion = null;
    Statement sentencia = null;
    String nombreBD = "arriendoAuto";
    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
    ResultSet rs = null;
    String usuario = "root";
    String contraseña = "1234";

    /*INGRESO DE CLIENTES*/
    public String ingresoCliente(String idUsuario, String idCliente, String idVehiculo, String fecha, String monto) {
        String mensaje = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            String SQL = "insert into factura(id_usuario,id_cliente,id_vehiculo,fecha,monto)values ('" + idUsuario + "','" + idCliente + "','" + idVehiculo + "','" + fecha + "','" + monto + "')";
            sentencia.execute(SQL);

            mensaje = "<script>alert('DATOS INGRESADOS CON EXITO !!!');"
                    + "location.href='ingresarFactura.jsp';"
                    + "</script>";

            sentencia.close();
            conexion.close();
        } catch (Exception Error) {

            mensaje = "<script>alert('ERROR!!!');"
                    + "location.href='ingresarFactura.jsp';"
                    + "</script>";

        }

        return mensaje;
    }
}
