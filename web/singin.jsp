<%@include file="plantillas/documento-declaracion.jsp" %>
<%@include file="plantillas/navbar.jsp" %>
<br>
<br>
<br>
<br>
<br>
<div class="panel-body">
    <div class="container">
        <form role="form" action="Controlador">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <div class="form-group">
                        <label>Nombre y Apellido:</label>
                        <input type="text" class="form-control" name="nombreApellido">
                    </div>
                    <div class="form-group">
                        <label>Rut:</label>
                        <input type="text" class="form-control" name="rut">
                    </div>
                    <div class="form-group">
                        <label>Correo electrónico:</label>
                        <input type="email" class="form-control" name="email" placeholder="ejemplo@mail.com">
                    </div>
                    <div class="form-group">
                        <label>Dirección:</label>
                        <input type="text" class="form-control" name="direccion">
                    </div>
                    <div class="form-group">
                        <label>Contraseña:</label>
                        <input type="password" class="form-control" name="clave">
                    </div>
                    <br>
                    <button type="submit" class="btn btn-default btn-primary" name="accion" value="Guardar">Crear</button>
                </div>
                <div class="col-md-4"></div>
            </div>
        </form>
    </div>
</div>

<%@include file="plantillas/documento-cierre.jsp" %>