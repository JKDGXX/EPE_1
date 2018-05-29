<body background="img/contacto/fondo.png">
    <div class="form-style-10">
        <h1>Contacto<span>Envianos un correo a través de este formulario</span></h1>
        <form action="correo.php" method="Post">
            <div class="inner-wrap">
                <label>Nombre <input type="text" name="nombre" required/></label>
                <label>Apellido <input type="text" name="apellido" required/></label>
                <label>Email <input type="email" name="email" required/></label>
                <label>Mensaje <textarea name="mensaje" required></textarea></label>
            </div>

            <div class="button-section" style="text-align: center;">
                <input type="submit" name="enviar" value="Enviar">
            </div>
        </form>
    </div>
</body>