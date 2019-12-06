<%@page import="java.util.ArrayList"%>
<%@page import="DAO.ProductoDAO"%>
<%@page import="bd.Producto"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="plantillas/documento-declaracion.jsp" %>
<%@include file="plantillas/navbarDos.jsp" %>
<br>
<br>
<br>

<c:forEach items="${clientes}" var="c">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading text-center">
                    <h4>Edita tus datos</h4>
                </div>
                <div class="panel-body text-center">
                    <form role="form" class="form-group" action="Editar" method="POST">
                        Nombre: <input class="form-control text-center" type="text" name="txtNombre" value="${c.getNombre()}"> <br/>
                        Rut: <input class="form-control text-center" type="text" name="txtRut" value="${c.getRutCliente()}" ><br/>
                        Direccion: <input class="form-control text-center" type="text" name="txtDireccion" value="${c.getDireccion()}"><br/>
                        Email: <input class="form-control text-center" type="text" name="txtEmail" value="${c.getEmail()}"><br/>
                        Pass: <input class="form-control text-center" type="password" name="txtPass" value="${c.getPass()}"><br/>

                        <button type="submit" value="editar" class="btn btn-lg btn-primary btn-block">Editar Datos</button>

                    </form>
                </div>
            </div> 
        </div>
        <div class="col-md-4"></div>

    </div>


</c:forEach>




<%@include file="plantillas/documento-cierre.jsp" %>