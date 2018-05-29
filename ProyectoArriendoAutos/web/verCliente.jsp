<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DKD - ver Clientes</title>
        <!--LINKS BOOTSTRAP Y CSS LOCAL-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/estiloVerCliente.css">

    </head>
    <body>
        <!--BARRA DE NAVEGACION-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">
                <img src="img/icono/logo.png" width="30" height="30" class="d-inline-block align-top" alt="">DKD</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.jsp">Inicio</a>
                    </li>

                    <li class="nav-item active">
                        <a class="nav-link" href="#"></a>
                    </li>

                    <li class="nav-item" id="opcionesAdministrador">
                        <div class="btn-group dropleft">
                            <button type="button" class="btn btn-light" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="img/icono/icono2.png" width="20" height="20" alt="opcion"></button>
                            <div class="dropdown-menu">
                                <button class="dropdown-item" type="button">Detalles De La Cuenta</button>
                                <button class="dropdown-item" type="button">Cambiar Contraseña</button>
                                <button class="dropdown-item" type="button">Actualizar Datos</button>
                                <button class="dropdown-item" type="button">Salir</button>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
        <!--BARRA DE NAVEGACION-->



        <!--TABLA DE CLIENTES-->
        <div class="container" id="posicionTabla">
            <h2 style="text-align: center;">Clientes</h2>
            <table class="table">
                <%
                    Connection conexion = null;
                    Statement sentencia = null;
                    ResultSet resultados = null;
                    String nombreBD = "arriendoauto";
                    String url = "jdbc:mysql://localhost:3306/" + nombreBD;
                    String usuario = "root";
                    String contraseña = "1234";

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conexion = DriverManager.getConnection(url, usuario, contraseña);

                        sentencia = conexion.createStatement();
                        String SQL = "select * from cliente";
                        resultados = sentencia.executeQuery(SQL);

                        out.println("<thead>"
                                + "<tr>"
                                + "<th>ID CLIENTE</th>"
                                + "<th>NOMBRE</th>"
                                + "<th>APELLIDO</th>"
                                + "<th>TELÉFONO</th>"
                                + "<th>EMAIL</th>"
                                + "<th>DIRECCION</th>"
                                + "<th>FECHA DE NACIMIENTO</th>"
                                + " </tr>"
                                + "</thead>");
                        while (resultados.next()) {

                            int id = resultados.getInt("id_cliente");
                            String nombre = resultados.getString("nombre");
                            String apellido = resultados.getString("apellido");
                            String telefono = resultados.getString("teléfono");
                            String email = resultados.getString("email");
                            String direccion = resultados.getString("direccion");
                            String fechaNacimiento = resultados.getString("fecha_nacimiento");
                %>
                <tbody>
                    <tr>
                        <td><%=id%></td>
                        <td><%=nombre%></td>
                        <td><%=apellido%></td>
                        <td><%=telefono%></td>
                        <td><%=email%></td>
                        <td><%=direccion%></td>
                        <td><%=fechaNacimiento%></td>
                    </tr>
                </tbody>
                <%                            }
                        sentencia.close();
                        conexion.close();
                    } catch (Exception e) {

                        out.println("<script> alert('ERROR AL VER CLIENTES');</script>");

                    }
                %>
            </table>
        </div>

        <div style="text-align: center;">                           
            <a href="menuAdministrador.jsp"><button type="submit" class="btn btn-secondary">Volver</button></a>
        </div>

        <footer>
            <p>© 2018<a style="color:#0a93a6; text-decoration:none;" href="#"> DDK-Ingenieria Informatica</a>, Derechos Reservados.</p>
        </footer>
        <!--LINKS SCRIPTS-->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>    

    </body>
</html>
