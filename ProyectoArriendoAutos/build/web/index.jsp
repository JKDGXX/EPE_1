<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DKD Arriendo de Vehículos</title>

        <!--LINKS BOOTSTRAP Y CSS LOCAL-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/estiloIndex.css">
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
                        <a class="nav-link" href="#">Vehículos</a>
                    </li>

                    <li class="nav-item active">
                        <a class="nav-link" href="#">¿Quienes Somos?</a>
                    </li>

                    <li class="nav-item active">
                        <a class="nav-link" href="#">Contacto</a>
                    </li>

                    <li class="nav-item" id="opcionesAdministrador">
                        <a class="nav-link" href="#">Administrador</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!--BARRA DE NAVEGACION-->

        <!--CAROUSEL-->
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" id="altura_img_carrousel" src="img/carousel/img1.png" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" id="altura_img_carrousel" src="img/carousel/img2.png" alt="Second slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>No hay limites</h5>
                        <p>Llega a donde tu quieras.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" id="altura_img_carrousel" src="img/carousel/img3.jpg" alt="Third slide">
                    <div class="carousel-caption d-none d-md-block">
                        <h5>Automóviles Electricos</h5>
                        <p>También nos preocupamos de cuidar nuestro planeta.</p>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <!--CAROUSEL-->

        <div id="contenedor">
            <div id="titulo">
                <h1>¿Por qué elegir DKD?</h1>
            </div>
            
            <div id="izquierda">
                <h1>El mejor precio y servicio</h1>
                <p>Los viajeros con un presupuesto apreciarán nuestros precios con todo incluido y un servicio personalizado.</p>
            </div>

            <div id="centro">
                <h1>Precios todo incluido, sin sorpresas</h1>
                <p>En DKD, los precios cotizados incluyen todos los cargos. No hay sorpresas desagradables cuando recoges tu auto, ¡garantizado!</p>
            </div>
            
            <div id="derecha">
                <h1>La mejor flota de alquiler en Chile</h1>
                <p>DKD tiene un vehículo de último modelo para satisfacer todas las necesidades: autos de todos los tamaños, camionetas, minivans y furgones de carga.</p>
            </div>
        </div>
        
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
