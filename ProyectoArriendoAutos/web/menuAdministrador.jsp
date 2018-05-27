<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="gestionBD.consultas"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DKD-Menu</title>

        <!--LINKS BOOTSTRAP Y CSS LOCAL-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/estiloMenuAdministrador.css">

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
                        <a class="nav-link" href="#">Inicio</a>
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

        <!--FORMULARIO INGRESO CLIENTE-->
       	<div  class="container" id="posicionFormulario">
            <div class="row main">
                <div class="main-login main-center">
                    <h5 style="text-align: center;">Ingreso De Clientes</h5>
                    <form method="post" action="ingresoCliente">

                        <div class="form-group">
                            <label for="nombre" class="cols-sm-2 control-label">Nombre</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="nombre" id="name"  placeholder="Ingrese Nombre"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="apellido" class="cols-sm-2 control-label">Apellido</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="apellido" id="email"  placeholder="Ingrese Apellido"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="telefono" class="cols-sm-2 control-label">Ingrese Teléfono</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="telefono" id="username"  placeholder="Ingrese Telefono"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="correo" class="cols-sm-2 control-label">Correo</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="email" class="form-control" name="correo" id="password"  placeholder="Ingrese Correo"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="direccion" class="cols-sm-2 control-label">Direccion</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="direccion" id="confirm"  placeholder="Ingrese Direccion"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="fecha nacimiento" class="cols-sm-2 control-label">Fecha De Nacimiento</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="date" class="form-control" name="fechaNacimiento" id="confirm"  placeholder="Ingrese Fecha De Nacimiento"/>
                                </div>
                            </div>
                        </div>

                        <div id="centroButton">
                            <button type="submit">Ingresar</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
        <!--FORMULARIO INGRESO CLIENTE-->



       <!--PIE DE PAGINA-->
        <footer>
            <p>© 2018<a style="color:#0a93a6; text-decoration:none;" href="#"> DKD-Ingenieria Informática</a>, Derechos Reservados.</p>
        </footer>
        <!--LINKS SCRIPTS-->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>    

    </body>
</html>
