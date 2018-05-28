
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DKD Arriendo de Vehículos</title>

        <!--LINKS BOOTSTRAP Y CSS LOCAL-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/estiloQuienesSomos.css">
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
                    <img class="d-block w-100" id="altura_img_carrousel" src="img/carouselQuienesSomos/quienesSomos.png" alt="First slide">
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
            <div id="centro">
                <h1>Nuestra Empresa</h1>
                <p>
                    DKD es una compañía dedicada al arriendo de vehículos desde 1986. Más de 30 años de experiencia avalan nuestro trabajo, consolidándonos como uno de los principales rent a car de la ciudad de Santiago.
                    <br>
                    <br>
                    Nos enorgullecemos de ser una empresa chilena que ha ganado la confianza de innumerables turistas nacionales y extranjeros y de algunas de las más importantes empresas del país, como también diversos organismos gubernamentales.
                    <br>
                    <br>
                    <h2>Nuestro compromiso:</h2>
                    <br>
                    -Ofrecer una flota variada y en excelente estado<br>
                    -Ofrecer los mejores precios a quienes reserven con tiempo<br>
                    -Política de transparencia: nos comprometemos a no tener cobros ocultos<br>
                    -Servicio 24/365: estamos siempre disponibles para atenderlo, donde sea que esté<br>
                    -Con DKD, puedes manejar tranquilo.<br>
                    <br>
                    <h2>Nuestros servicios:</h2>
                    <br>
                    -Arriendos a corto plazo para personas naturales y empresas<br>
                    -Convenios con empresas para arriendos a corto plazo o mensuales<br>
                    -Arriendos de largo plazo (leasing operativo)<br>
                </p>
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
