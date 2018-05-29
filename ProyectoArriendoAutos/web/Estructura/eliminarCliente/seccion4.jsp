<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<div class="container" id="posicionTabla">
        
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
        <br>
        <br>
        <br>
        <br>
