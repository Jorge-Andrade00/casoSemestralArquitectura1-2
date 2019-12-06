<%@include file="plantillas/documento-declaracion.jsp" %>
<%@include file="plantillas/navbar.jsp" %>
<br>
<br>
<br>
<br>
<div class="container">
    <div class="row">
        <div class="col-md-3">
        </div>
        <div class="col-md-6">
            <div class="panel panel-default">
                <div class="panel-heading text-center">
                    <h4>Iniciar sesión</h4>
                </div>
                <div class="panel-body">
                    <!- CAMBIE EL ACTION DE Controlador A Sesion Y BORRE EL name DEL BOTON INICIAR SESION->
                    <form role="form" action="Sesion" method="post">
                        <h2>Ingresa tus datos</h2>
                        <br>
                        <label for="email" class="sr-only">Email</label>
                        <input type="email" name="email" id="email" class="form-control" placeholder="email@ejemplo.com" required autofocus>
                        <br>
                        <br>
                        <label for="clave" class="sr-only">Clave</label>
                        <input type="password" name="clave" id="clave" class="form-control" placeholder="Contraseña" required>
                        <br>
                        <button type="submit" value="login" class="btn btn-lg btn-primary btn-block">Iniciar sesión</button>
                    </form>
                    <br>
                    <br>
                    <div class="text-center">
                        <a>¿Olvidaste tu contraseña?</a>
                        <br>
                        <br>
                        <a href="<?php echo RUTA_REGISTRO ?>">¿Aún no te registras?</a>
                    </div>
                </div>
                <!- aca termina el panel body->
            </div>
        </div>
    </div>
</div>
<%@include file="plantillas/documento-cierre.jsp" %>