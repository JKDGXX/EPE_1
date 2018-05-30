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
                                <form action="recibeBoton" method="post">
                                <button class="dropdown-item" type="button">Detalles De La Cuenta</button>
                                <button class="dropdown-item" type="button">Cambiar Contraseña</button>
                                <button class="dropdown-item" type="submit" name="boton" value="6">Actualizar Datos</button>
                                <button class="dropdown-item" type="sumbit" name="boton" value="3">Salir</button>
                                </form>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
