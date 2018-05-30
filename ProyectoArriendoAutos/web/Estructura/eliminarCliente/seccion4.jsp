<%@page import="gestionBD.cliente"%>

<%
    String id_cliente = (String) session.getAttribute("id");
    cliente listar = new cliente(id_cliente);
%> 

<form action="validacion" method="post" class="formularioActualizarCliente">

    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>ID</strong></label>
        <input  type="number" name="id" value="<%=id_cliente%>" required>
    </div>

    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>Nombre</strong></label>
        <input  type="text" name="nombre" value="<%=listar.getNombre()%>">
    </div>
    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>Apellido</strong></label>
        <input  type="text" name="apellido" value="<%=listar.getApellido()%>">
    </div>
    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>Teléfono</strong></label>
        <input  type="text" name="telefono" value="<%=listar.getTelefono()%>">
    </div>
    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>Email</strong></label>
        <input  type="text" name="correo" value="<%=listar.getEmail()%>">
    </div>
    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>Direccion</strong></label>
        <input  type="text" name="direccion" value="<%=listar.getDireccion()%>">
    </div>

    <div style="text-align: center; margin-top: 10px;">
        <button type="submit" class="btn btn-secondary" name="boton" value="4">Listar</button>
        <button type="submit" class="btn btn-secondary" name="boton" value="5">Actualizar</button>
        
    </div>
</form>

