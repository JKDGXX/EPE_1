<%@page import="gestionBD.vendedor"%>
<%
    String usuarioVe = (String) session.getAttribute("usuario");
    String contraseñaV = (String) session.getAttribute("contrasena");
    vendedor v = new vendedor(usuarioVe, contraseñaV);


%>
<div  class="container" id="posicionFormulario">
    <div class="row main">
        <div class="main-login main-center">
            <h5 style="text-align: center;">Ingreso De Factura</h5>
            <form method="post" action="validacion">

                <div class="form-group">
                    <label for="idUsuario" class="cols-sm-2 control-label">ID Usuario</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <input style="text-align: center;" type="text" class="form-control" name="idUsuario" id="name"  value="<%=v.idVendedor()%>" readonly = "readonly"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="idCliente" class="cols-sm-2 control-label">ID Cliente</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="idCliente" id="email"  placeholder="Ingrese ID Cliente"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="idVehiculo" class="cols-sm-2 control-label">ID Vehiculo</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="idVehiculo" id="username"  placeholder="Ingrese ID Vehiculo"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="fecha" class="cols-sm-2 control-label">Fecha</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                            <input type="date" class="form-control" name="fecha" id="password"  placeholder="Ingrese Fecha"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="monto" class="cols-sm-2 control-label">Monto</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-gsroup-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="monto" id="confirm"  placeholder="Ingrese Monto"/>
                        </div>
                    </div>
                </div>
                <div style="text-align: center;">
                    <button type="submit" name="boton" value="8" class="btn btn-secondary">Ingresar</button>
                </div>
            </form>
        </div>
    </div>
</div>

<div id="centroButton">                           
    <a href="menuAdministrador.jsp"><button type="submit" class="btn btn-secondary">Volver</button></a>
</div>
<br>
<br>
<br>
<br>      