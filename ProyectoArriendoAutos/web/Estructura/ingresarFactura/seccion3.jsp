<%@page import="gestionBD.vendedor"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String usuarioVe = (String) session.getAttribute("usuario");
    String contraseñaV = (String) session.getAttribute("contrasena");
    vendedor v = new vendedor(usuarioVe, contraseñaV);


%>
<div  class="container" id="posicionFormulario">
    <div class="row main">
        <div class="main-login main-center">
            <h5 style="text-align: center;">Ingreso De Factura</h5>
            <form method="post" action="validacion">

                <div class="form-group">
                    <label for="idUsuario" class="cols-sm-2 control-label">ID Usuario</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <input style="text-align: center;" type="text" class="form-control" name="idUsuario" id="name"  value="<%=v.idVendedor()%>" readonly = "readonly"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="idCliente" class="cols-sm-2 control-label">ID Cliente</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="idCliente" id="email"  placeholder="Ingrese ID Cliente"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="idVehiculo" class="cols-sm-2 control-label">ID Vehiculo</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="idVehiculo" id="username"  placeholder="Ingrese ID Vehiculo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="fecha" class="cols-sm-2 control-label">Fecha</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                            <input type="date" class="form-control" name="fecha" id="password"  placeholder="Ingrese Fecha"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="monto" class="cols-sm-2 control-label">Monto</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-gsroup-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="monto" id="confirm"  placeholder="Ingrese Monto"/>
                        </div>
                    </div>
                </div>
                <div style="text-align: center;">
                    <button type="submit" name="boton" value="8" class="btn btn-secondary">Ingresar</button>
                </div>
            </form>
        </div>
    </div>
</div>

<div id="centroButton">                           
    <a href="menuAdministrador.jsp"><button type="submit" class="btn btn-secondary">Volver</button></a>
</div>
<br>
<br>
<br>
<br>
<div class="container" id="posicionTabla">
    <h2 style="text-align: center;">Cliente</h2>
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
                String SQL = " select * from cliente;";
                resultados = sentencia.executeQuery(SQL);

                out.println("<thead>"
                        + "<tr>"
                        + "<th>ID CLIENTE</th>"
                        + "<th>NOMBRE DEL CLIENTE</th>"
                        + "<th>APELLIDO DEL CLIENTE</th>"
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
                    String fecha = resultados.getString("fecha_nacimiento");
        %>
        <tbody>
            <tr>
                <td><%=id%></td>
                <td><%=nombre%></td>
                <td><%=apellido%></td>
                <td><%=telefono%></td>
                <td><%=email%></td>
                <td><%=direccion%></td>
                <td><%=fecha%></td>
            </tr>
        </tbody>
        <%                            }
                sentencia.close();
                conexion.close();
            } catch (Exception e) {

                out.println("<script> alert('ERROR AL VER DATOS');</script>");

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
<div class="container" id="posicionTabla">
    <h2 style="text-align: center;">Vehiculos</h2>
    <table class="table">
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, contraseña);

                sentencia = conexion.createStatement();
                String SQL = " select * from vehiculos;";
                resultados = sentencia.executeQuery(SQL);

                out.println("<thead>"
                        + "<tr>"
                        + "<th>ID VEHICULO</th>"
                        + "<th>TIPO</th>"
                        + "<th>MARCA</th>"
                        + "<th>COLOR</th>"
                        + "<th>MODELO</th>"
                        + " </tr>"
                        + "</thead>");
                while (resultados.next()) {

                    int id = resultados.getInt("id_vehiculo");
                    String tipo = resultados.getString("tipo");
                    String marca = resultados.getString("marca");
                    String color = resultados.getString("color");
                    String modelo = resultados.getString("modelo");
        %>
        <tbody>
            <tr>
                <td><%=id%></td>
                <td><%=tipo%></td>
                <td><%=marca%></td>
                <td><%=color%></td>
                <td><%=modelo%></td>
            </tr>
        </tbody>
        <%                            }
                sentencia.close();
                conexion.close();
            } catch (Exception e) {

                out.println("<script> alert('ERROR AL VER DATOS');</script>");

            }
        %>
    </table>
</div>

<div style="text-align: center;">                           
    <a href="menuAdministrador.jsp"><button type="submit" class="btn btn-secondary">Volver</button></a>
</div>