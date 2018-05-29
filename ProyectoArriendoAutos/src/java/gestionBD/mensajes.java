/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionBD;

public class mensajes {

    public String salirSesion() {

        String mensaje = "<script>confirm('¿Desea Salir?');"
                + "location.href='login.jsp'"
                + "</script>";

        return mensaje;
    }

    public String errorException() {

        String mensaje = "<script>alert('ERROR AL INGRESAR DATOS !!!');"
                + "location.href='ingresoCliente.jsp';"
                + "</script>";

        return mensaje;
    }
}
