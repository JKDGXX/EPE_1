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
                                    <span class="input-gsroup-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
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
                        <div style="text-align: center;">
                            <button type="submit" class="btn btn-secondary">Ingresar</button>
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