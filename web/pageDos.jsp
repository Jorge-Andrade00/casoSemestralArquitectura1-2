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


<div class="container mt-2">
    <div class="row">
        <c:forEach items="${productos}" var="p">
        <div class="col-sm-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3>${p.getNombre()}</h3>
                </div>
                <div class="panel-body">
                    <strong>$</strong> ${p.getPrecio()}
                    <img src="ControladorIMG?id=${p.getId()}" width="200" height="180">
                </div>
                <div class="panel-footer text-center">
                    <label>${p.getDescripcion()}</label>
                    <div>
                        <a href="Controlador?accion=AgregarCarrito&id=${p.getId()}" class="btn btn-info">Agregar al carrito</a>
                        <a class="btn btn-danger">Comprar</a>
                    </div>
                </div>
            </div>
        </div>
        </c:forEach>    

    </div>
</div>

<%@include file="plantillas/documento-cierre.jsp" %>
