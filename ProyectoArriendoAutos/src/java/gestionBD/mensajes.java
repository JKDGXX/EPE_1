package gestionBD;

public class mensajes {

    /*MENSAJE SALIR SESION*/
    public String salirSesion() {

        String mensaje = "<script>"
                + "var op;"
                + "op=confirm('¿Desea Salir?');"
                + "if(op){"
                + "location.href='login.jsp';"
                + "}else{"
                + "location.href='menuAdministrador.jsp';"
                + "}"
                + "</script>";

        return mensaje;
    }

    /*MENSAJE ERROR INGRESO CLIENTE */
    public String errorExceptionIngresoCliente() {

        String mensaje = "<script>alert('ERROR AL INGRESAR DATOS !!!');"
                + "location.href='ingresoCliente.jsp';"
                + "</script>";

        return mensaje;
    }

    /*MENSAJE ERROR ELIMINAR CLIENTE*/
    public String errorExceptionEliminarCliente() {

        String mensaje = "<script>alert('ERROR AL ELIMINAR CLIENTES !!!');"
                + "location.href='eliminarCliente.jsp';"
                + "</script>";

        return mensaje;
    }

    /*MENSAJE ERROR ACTUALIZAR CLIENTE*/
    public String errorExceptionActualizarCliente() {

        String mensaje = "<script>alert('ERROR AL ACTUALIZAR CLIENTE !!!');"
                + "location.href='ingresoCliente.jsp';"
                + "</script>";

        return mensaje;
    }
    
    /*MENSAJE DE ERROR GENERAL*/
    public String errorGeneral(){
        String mensaje="<script>"
                + "alert('ERROR !!!');"
                + "</script>";
        return mensaje;
    }

    String errorExceptionmensajeContacto() {

        String mensaje = "<script>alert('ERROR AL ENVIAR DATOS !!!');"
                + "location.href='contacto.jsp';"
                + "</script>";

        return mensaje;    }
}
