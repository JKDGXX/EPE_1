package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gestionBD.consultas;

public final class menuAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DKD-Menu</title>\n");
      out.write("\n");
      out.write("        <!--LINKS BOOTSTRAP Y CSS LOCAL-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloMenuAdministrador.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--BARRA DE NAVEGACION-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"img/icono/logo.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">DKD</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item\" id=\"opcionesAdministrador\">\n");
      out.write("                        <div class=\"btn-group dropleft\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-light\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"img/icono/icono2.png\" width=\"20\" height=\"20\" alt=\"opcion\"></button>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <button class=\"dropdown-item\" type=\"button\">Detalles De La Cuenta</button>\n");
      out.write("                                <button class=\"dropdown-item\" type=\"button\">Cambiar Contraseña</button>\n");
      out.write("                                <button class=\"dropdown-item\" type=\"button\">Actualizar Datos</button>\n");
      out.write("                                <button class=\"dropdown-item\" type=\"button\">Salir</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--BARRA DE NAVEGACION-->\n");
      out.write("\n");
      out.write("        <!--FORMULARIO INGRESO CLIENTE-->\n");
      out.write("       \t<div  class=\"container\" id=\"posicionFormulario\">\n");
      out.write("            <div class=\"row main\">\n");
      out.write("                <div class=\"main-login main-center\">\n");
      out.write("                    <h5 style=\"text-align: center;\">Ingreso De Clientes</h5>\n");
      out.write("                    <form method=\"post\" action=\"ingresoCliente\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"nombre\" class=\"cols-sm-2 control-label\">Nombre</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"name\"  placeholder=\"Ingrese Nombre\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"apellido\" class=\"cols-sm-2 control-label\">Apellido</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"apellido\" id=\"email\"  placeholder=\"Ingrese Apellido\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"telefono\" class=\"cols-sm-2 control-label\">Ingrese Teléfono</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"telefono\" id=\"username\"  placeholder=\"Ingrese Telefono\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"correo\" class=\"cols-sm-2 control-label\">Correo</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" name=\"correo\" id=\"password\"  placeholder=\"Ingrese Correo\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"direccion\" class=\"cols-sm-2 control-label\">Direccion</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"direccion\" id=\"confirm\"  placeholder=\"Ingrese Direccion\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"fecha nacimiento\" class=\"cols-sm-2 control-label\">Fecha De Nacimiento</label>\n");
      out.write("                            <div class=\"cols-sm-10\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" name=\"fechaNacimiento\" id=\"confirm\"  placeholder=\"Ingrese Fecha De Nacimiento\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"centroButton\">\n");
      out.write("                            <button type=\"submit\">Ingresar</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--FORMULARIO INGRESO CLIENTE-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       <!--PIE DE PAGINA-->\n");
      out.write("        <footer>\n");
      out.write("            <p>© 2018<a style=\"color:#0a93a6; text-decoration:none;\" href=\"#\"> DKD-Ingenieria Informática</a>, Derechos Reservados.</p>\n");
      out.write("        </footer>\n");
      out.write("        <!--LINKS SCRIPTS-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
