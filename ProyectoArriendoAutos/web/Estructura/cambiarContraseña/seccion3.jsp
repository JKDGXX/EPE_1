<%
String usuarioVendedor=(String)session.getAttribute("usuario");
%>
<form action="validacion" method="post" id="formularioCambiarContraseña">
    <h1 id="tituloFormulario">Cambio De Contraseña</h1>

    <div id="divCampos" >
        <label for="Usuario"><strong>Usuario</strong></label>
        <input id="inputUsuario" type="text" name="usuario" value="<%=usuarioVendedor%>" readonly="readonly">
    </div>
    <div id="divCampos">
        <label for="contraseña actual"><strong>Contraseña Actual</strong></label>
        <input type="password" name="contrasenaActual" required>
    </div>
    <div id="divCampos">
        <label for="contraseña nueva"><strong>Contraseña Nueva</strong></label>
        <input type="password" name="contrasenaNueva" required>
    </div>
    <div id="divButton">
        <button type="submit" class="btn btn-secondary" name="boton" value="6">Enviar</button>
    </div>
</form>
