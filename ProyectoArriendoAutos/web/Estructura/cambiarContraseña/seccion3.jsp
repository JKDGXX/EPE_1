<%
String usuarioVendedor=(String)session.getAttribute("usuario");
%>
<form action="validacion" method="post" id="formularioCambiarContraseņa">
    <h1 id="tituloFormulario">Cambio De Contraseņa</h1>

    <div id="divCampos" >
        <label for="Usuario"><strong>Usuario</strong></label>
        <input id="inputUsuario" type="text" name="usuario" value="<%=usuarioVendedor%>" readonly="readonly">
    </div>
    <div id="divCampos">
        <label for="contraseņa actual"><strong>Contraseņa Actual</strong></label>
        <input type="password" name="contrasenaActual" required>
    </div>
    <div id="divCampos">
        <label for="contraseņa nueva"><strong>Contraseņa Nueva</strong></label>
        <input type="password" name="contrasenaNueva" required>
    </div>
    <div id="divButton">
        <button type="submit" class="btn btn-secondary" name="boton" value="6">Enviar</button>
    </div>
</form>
