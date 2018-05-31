<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
                    String contraseña = "";

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conexion = DriverManager.getConnection(url, usuario, contraseña);

                        sentencia = conexion.createStatement();
                        String SQL = "select * from contacto";
                        resultados = sentencia.executeQuery(SQL);

                        out.println("<thead>"
                                + "<tr>"
                                + "<th>ID CONTACTO</th>"
                                + "<th>NOMBRE</th>"
                                + "<th>APELLIDO</th>"
                                + "<th>EMAIL</th>"
                                + "<th>MENSAJE</th>"
                                + " </tr>"
                                + "</thead>");
                        while (resultados.next()) {

                            int id = resultados.getInt("id_contacto");
                            String nom = resultados.getString("nombre");
                            String ape = resultados.getString("apellido");
                            String email = resultados.getString("email");
                            String mensaj = resultados.getString("mensaje");
                %>
                <tbody>
                    <tr>
                        <td><%=id%></td>
                        <td><%=nom%></td>
                        <td><%=ape%></td>
                        <td><%=email%></td>
                        <td><%=mensaj%></td>
                    </tr>
                </tbody>
                <%                            }
                        sentencia.close();
                        conexion.close();
                    } catch (Exception e) {

                        out.println("<script> alert('ERROR AL VER COMENTARIOS');</script>");

                    }
                %>
            </table>
        </div>

        <div style="text-align: center;">                           
            <a href="menuAdministrador.jsp"><button type="submit" class="btn btn-secondary">Volver</button></a>
        </div>
