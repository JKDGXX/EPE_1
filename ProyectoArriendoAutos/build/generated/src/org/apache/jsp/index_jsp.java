package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/Estructura/index/bootstrapindex.jsp");
    _jspx_dependants.add("/Estructura/index/seccion1.jsp");
    _jspx_dependants.add("/Estructura/index/seccion2.jsp");
    _jspx_dependants.add("/Estructura/index/seccion3.jsp");
    _jspx_dependants.add("/Estructura/index/seccion4.jsp");
    _jspx_dependants.add("/Estructura/index/seccion5.jsp");
    _jspx_dependants.add("/scripts.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloIndex.css\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<title>Inicio</title>\n");
      out.write('\r');
      out.write('\n');
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                <img src=\"img/icono/logo.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">DKD</a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Inicio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Vehículos</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"quienesSomos.jsp\">¿Quienes Somos?</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"contacto.jsp\">Contacto</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"nav-item\" id=\"opcionesAdministrador\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"login.jsp\">Administrador</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("            <ol class=\"carousel-indicators\">\r\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"carousel-item active\">\r\n");
      out.write("                    <img class=\"d-block w-100\" id=\"altura_img_carrousel\" src=\"img/carousel/img1.png\" alt=\"First slide\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img class=\"d-block w-100\" id=\"altura_img_carrousel\" src=\"img/carousel/img2.png\" alt=\"Second slide\">\r\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                        <h5>No hay limites</h5>\r\n");
      out.write("                        <p>Llega a donde tu quieras.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <img class=\"d-block w-100\" id=\"altura_img_carrousel\" src=\"img/carousel/img3.jpg\" alt=\"Third slide\">\r\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                        <h5>Automóviles Electricos</h5>\r\n");
      out.write("                        <p>También nos preocupamos de cuidar nuestro planeta.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Previous</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Next</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<div id=\"contenedor\">\r\n");
      out.write("            <div id=\"titulo\">\r\n");
      out.write("                <h1>¿Por qué elegir DKD?</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"izquierda\">\r\n");
      out.write("                <h1>El mejor precio y servicio</h1>\r\n");
      out.write("                <p>Los viajeros con un presupuesto apreciarán nuestros precios con todo incluido y un servicio personalizado.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"centro\">\r\n");
      out.write("                <h1>Precios todo incluido, sin sorpresas</h1>\r\n");
      out.write("                <p>En DKD, los precios cotizados incluyen todos los cargos. No hay sorpresas desagradables cuando recoges tu auto, ¡garantizado!</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"derecha\">\r\n");
      out.write("                <h1>La mejor flota de alquiler en Chile</h1>\r\n");
      out.write("                <p>DKD tiene un vehículo de último modelo para satisfacer todas las necesidades: autos de todos los tamaños, camionetas, minivans y furgones de carga.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("        <footer>\r\n");
      out.write("            <p>© 2018<a style=\"color:#0a93a6; text-decoration:none;\" href=\"#\"> DKD-Ingenieria Informática</a>, Derechos Reservados.</p>\r\n");
      out.write("        </footer>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>    \r\n");
      out.write("\r\n");
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
