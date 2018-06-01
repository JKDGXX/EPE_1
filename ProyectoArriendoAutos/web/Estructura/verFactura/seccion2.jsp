<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<div class="container" id="posicionTabla">
    <h2 style="text-align: center;">Factura</h2>
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
                String SQL = " select factura.id_factura,cliente.nombre,cliente.apellido,cliente.teléfono,cliente.email,cliente.direccion,vehiculos.marca,vehiculos.modelo,factura.fecha,factura.monto from factura inner join cliente on factura.id_cliente = cliente.id_cliente inner join usuario on factura.id_usuario = usuario.id_usuario inner join vehiculos on factura.id_vehiculo = vehiculos.id_vehiculo;";
                resultados = sentencia.executeQuery(SQL);

                out.println("<thead>"
                        + "<tr>"
                        + "<th>ID FACTURA</th>"
                        + "<th>NOMBRE DEL CLIENTE</th>"
                        + "<th>APELLIDO DEL CLIENTE</th>"
                        + "<th>TELÉFONO</th>"
                        + "<th>EMAIL</th>"
                        + "<th>DIRECCION</th>"
                        + "<th>VEHÍCULO</th>"
                        + "<th>MODELO</th>"
                        + "<th>FECHA</th>"
                        + "<th>MONTO</th>"
                        + " </tr>"
                        + "</thead>");
                while (resultados.next()) {

                    int id = resultados.getInt("id_factura");
                    String nombre = resultados.getString("nombre");
                    String apellido = resultados.getString("apellido");
                    String telefono = resultados.getString("teléfono");
                    String email = resultados.getString("email");
                    String direccion = resultados.getString("direccion");
                    String marca = resultados.getString("marca");
                    String modelo = resultados.getString("modelo");
                    String fecha = resultados.getString("fecha");
                    String monto = resultados.getString("monto");
        %>
        <tbody>
            <tr>
                <td><%=id%></td>
                <td><%=nombre%></td>
                <td><%=apellido%></td>
                <td><%=telefono%></td>
                <td><%=email%></td>
                <td><%=direccion%></td>
                <td><%=marca%></td>
                <td><%=modelo%></td>
                <td><%=fecha%></td>
                <td><%=monto%></td>
            </tr>
        </tbody>
        <%                            }
                sentencia.close();
                conexion.close();
            } catch (Exception e) {

                out.println("<script> alert('ERROR AL VER FACTURA');</script>");

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
<br>
<br>
<br>
<br>
<br>
<br>
<br>
