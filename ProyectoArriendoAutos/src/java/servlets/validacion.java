package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import gestionBD.vendedor;/*IMPORTACION CLASE VALIDARDATOS*/
import gestionBD.cliente;/*IMPORTACION CLASE CLIENTE*//*IMPORTACION CLASE CLIENTE*/
import gestionBD.contacto;/*IMPORTACION CLASE CONTACTO*/

@WebServlet(name = "validacion", urlPatterns = {"/validacion"})
public class validacion extends HttpServlet {

    /*VARIABLE QUE GUARDARA EL BOTON GENERAL DE TODOS LOS FORMULARIOS*/
    String valorBoton;
    /*VARIABLES USUARIO Y PASSWORD FORMULARIO LOGIN*/
    String user;
    String pass;
    /*VARIABLES DE CLIENTES FORMULARIO DE INGRESO CLIENTE Y ACTUALIZAR CLIENTE*/
    String nombre;
    String apellido;
    String telefono;
    String correo;
    String direccion;
    String fechaNacimiento;
    /*VARIABLES DE FORMULARIO CONTACTO*/
    String nom;
    String ape;
    String email;
    String mensaj;

    /*VARIABLE ID CLIENTE DE FORMULARIO PARA ELIMINAR UN CLIENTE*/
    String idCliente;
    /*INSTANCIA CLASE VALIDARDATOS.JAVA*/
    vendedor validarLogin = new vendedor();
    /*INSTANCIA CLASE CLIENTE.JAVA*/
    cliente cientesOpciones = new cliente();
    /*INSTANCIA CLASE CONTACTO.JAVA*/
    contacto contact = new contacto();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /*REQUEST BOTON LOGIN*/
            this.valorBoton = request.getParameter("boton");

            /*REQUEST USUARIO Y CONTRASEÑA*/
            user = request.getParameter("usuario");
            pass = request.getParameter("contrasena");
            
            /*REQUEST CONTACTO*/
            nom = request.getParameter("nom");
            ape = request.getParameter("ape");
            email = request.getParameter("email");
            mensaj = request.getParameter("mensaj");

            /*REQUEST NOMBRE,APELLIDO,TELEFONO,CORREO,DIRECCION,FECHAMACIMIENTO*/
            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            telefono = request.getParameter("telefono");
            correo = request.getParameter("correo");
            direccion = request.getParameter("direccion");
            fechaNacimiento = request.getParameter("fechaNacimiento");
            /*REQUEST ID FORMULARIO ELIMINAR CLIENTE*/
            idCliente = request.getParameter("id");
            /*INSTANCIA CLASE LISTARCLIENTE.JAVA CON PARAMETRO ID*/
            cliente verDatos = new cliente(idCliente);
            /*INTANCIA CLASE */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validacion</title>");
            out.println("</head>");
            out.println("<body>");
            if (this.valorBoton.equals("0")) {
                out.println("<h1>" + this.validarLogin.validacionDatosVendedor(user, pass) + "</h1>");
            } else if (this.valorBoton.equals("1")) {
                out.println("<h1>" + this.cientesOpciones.ingresoCliente(nombre, apellido, telefono, correo, direccion, fechaNacimiento) + "</h1>");
            } else if (this.valorBoton.equals("2")) {
                out.println("<h1>" + this.cientesOpciones.eliminarClientes(this.idCliente) + "</h1>");
            } else if (this.valorBoton.equals("3")) {
                out.println("<h1>" + this.cientesOpciones.actualizarCliente(nombre, apellido, telefono, correo, direccion, this.idCliente) + "</h1>");
            } else if (this.valorBoton.equals("4")) {
                request.getSession().setAttribute("id", idCliente);
                response.sendRedirect("eliminarCliente.jsp");
            } else if (this.valorBoton.equals("5")) {
                out.println("<h1>"+this.cientesOpciones.actualizarCliente(nombre, apellido, telefono, correo, direccion, idCliente));
            } else if (this.valorBoton.equals("6")){
                out.println("<h1>");
            } else if (this.valorBoton.equals("Enviar")) {
                out.println("<h1>"+this.contact.mensajeContacto(nom, ape, email, mensaj)+"</h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
