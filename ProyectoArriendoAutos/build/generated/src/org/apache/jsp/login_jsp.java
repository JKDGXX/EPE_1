package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("    <head lang=\"es\">\n");
      out.write("        <title>DDK Arriendo De Autos</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!--LINKS BOOTSTRAP Y CSS LOCAL-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloLogin.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--BARRA DE NAVEGACION-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"img/icono/icono1.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">DDK</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">¿Quienes Somos?</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Contacto</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\" id=\"loginAdministrador\">\n");
      out.write("                        <a class=\"nav-link\" href=\"login.jsp\">Administrador</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--BARRA DE NAVEGACION-->\n");
      out.write("\n");
      out.write("        <!--FORMULARIO DE INGRESO AL SISTEMA-->\n");
      out.write("        <form id=\"formularioLogin\" action=\"validacionDatos\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"usuario\">Usuario</label>\n");
      out.write("                <input type=\"text\" name=\"usuario\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"ingrese usuario\" title=\"usuario\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"contrasena\">Contraseña</label>\n");
      out.write("                <input type=\"password\" name=\"contrasena\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"ingrese contraseña\" title=\"ingrese\">\n");
      out.write("            </div>\n");
      out.write("            <div id=\"centroButton\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" title=\"Ingresar\">Ingresar</button>\n");
      out.write("                <button type=\"reset\" class=\"btn btn-primary\" title=\"Resetear\">Limpiar</button>\n");
      out.write("            </div> \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--FORMULARIO DE INGRESO AL SISTEMA-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <h1 style=\"font-size:17px;\">DDK2018®<img src=\"img/icono/icono1.png\" width=\"20\" height=\"20\" alt=\"icono\"></h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--LINKS SCRIPTS-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
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
