<%@page import="gestionBD.vendedor"%>
<%
    String usuarioV = (String) session.getAttribute("usuario");
    String contrase�aV = (String) session.getAttribute("contrasena");
    vendedor verDatos = new vendedor(usuarioV, contrase�aV);
%>
<form id="formularioDetalleCuenta">
    <h1 style="font-size: 24px; text-align: center;">Detalles Cuenta</h1>
    <div id="inputCampos">
        <label style="text-align: center" for="nombreVendedor">Nombre</label>
        <input type="text" placeholder="<%=verDatos.getNombre()%>" readonly="readonly">
    </div>
    <div id="inputCampos">
        <label style="text-align: center" for="ApellidoVendedor">Apellido</label>
        <input type="text" placeholder="<%=verDatos.getApellido()%>" readonly="readonly">
    </div>
    <div id="inputCampos">
        <label style="text-align: center" for="nombreUsuario">Usuario</label>
        <input type="text" placeholder="<%=verDatos.getNombreUsuario()%>" readonly="readonly">
    </div>
    <div id="inputCampos">
        <label style="text-align: center" for="telefono">Tel�fono</label>
        <input type="text" placeholder="<%=verDatos.getTelefono()%>" readonly="readonly">
    </div>
    <div id="inputCampos">
        <label style="text-align: center" for="correo">Correo</label>
        <input type="text" placeholder="<%=verDatos.getCorreo()%>" readonly="readonly">
    </div>
    <div id="inputCampos">
        <label style="text-align: center" for="direccion">Direcci�n</label>
        <input type="text" placeholder="<%=verDatos.getDireccion()%>" readonly="readonly">
    </div>
    <div id="inputCampos">
        <label style="text-align: center" for="fechaNacimiento">Fecha De Nacimiento</label>
        <input type="text" placeholder="<%=verDatos.getFechaNacimiento()%>" readonly="readonly">
    </div>

</form>

