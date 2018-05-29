<div  class="container" >
    <div class="row main">
        <div class="main-login main-center">

            <form method="post" action="validacionDatos">

                <div class="form-group" id="tamañoInput">
                    <label for="usuario" class="cols-sm-2 control-label"><strong>Usuario</strong></label>
                    <div class="cols-sm-10" >
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="usuario" id="name"  placeholder="Ingrese Usuario"/>
                        </div>
                    </div>
                </div>

                <div class="form-group" id="tamañoInput">
                    <label for="contraseña" class="cols-sm-2 control-label"><strong>Contraseña</strong></label>
                    <div class="cols-sm-10">
                        <div class="input-group" >
                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                            <input type="password" class="form-control" name="contrasena" id="email"  placeholder="Ingrese Contraseña"/>
                        </div>
                    </div>
                </div>

                <div id="centroButton">
                    <button type="submit"><strong>INGRESAR</strong></button>
                </div>

            </form>
        </div>
    </div>
</div>