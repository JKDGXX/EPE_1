<%
    String usuarioV = (String) session.getAttribute("usuario");
%>
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
                <a class="nav-link"><strong>Usuario : <%=usuarioV%></strong> </a>
            </li>

            <li class="nav-item" id="opcionesAdministrador">
                <div class="btn-group dropleft">
                    <form action="validacion" method="post">
                        <button type="button" class="btn btn-light" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="img/icono/icono2.png" width="20" height="20" alt="opcion"></button>
                        <div class="dropdown-menu">
                            <button class="dropdown-item" type="submit" name="boton" value="detallesCuenta">Detalles De La Cuenta</button>
                            <button class="dropdown-item" type="submit" name="boton" value="cambiarContrasena">Cambiar Contraseña</button>
                            <button class="dropdown-item" type="submit" name="boton" value="actualizarDatos">Actualizar Datos</button>
                            <button class="dropdown-item" type="submit" name="boton" value="salirCuenta">Salir</button>
                        </div>
                    </form>
                </div>
            </li>
        </ul>
    </div>
</nav>
