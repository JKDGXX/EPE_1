<%@page import="gestionBD.listarCliente"%>

<%
    String id_cliente = (String) session.getAttribute("id");
    listarCliente listar = new listarCliente(id_cliente);
    

%> 

<form action="actualizarCliente" method="post" class="formularioActualizarCliente">

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
        <input  type="text" name="email" value="<%=listar.getEmail()%>">
    </div>
    <div id="posicionCamposActualizarCliente">
        <label for="id"><strong>Direccion</strong></label>
        <input  type="text" name="direccion" value="<%=listar.getDireccion()%>">
    </div>

    <div style="text-align: center; margin-top: 10px;">
        <button type="submit" class="btn btn-secondary" name="boton" value="0">Actualizar</button>
        <button type="submit" class="btn btn-secondary" name="boton" value="1">Listar</button>
    </div>
</form>

