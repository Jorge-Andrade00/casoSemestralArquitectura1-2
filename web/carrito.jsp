<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="plantillas/documento-declaracion.jsp" %>
<%@include file="plantillas/navbarDos.jsp" %>
<br>
<br>
<br>
<div class="container mt-4">
    <div class="row">
        <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ITEM</th>
                        <th>NOMBRE</th>
                        <th>DESCRIPCION</th>
                        <th>PRECIO</th>
                        <th>CANTIDAD</th>
                        <th>TOTAL</th>
                        <th></th>
                    </tr>
                </thead>
                <c:forEach items="${carrito}" var="c">
                <tbody>
                    <tr>
                        <td>${c.getItem()}</td>
                        <td>${c.getNombre()}</td>
                        <td>${c.getDescripcion()}</td>
                        <td>${c.getPrecioCompra()}</td>
                        <td>${c.getCantidad()}</td>
                        <td>${c.getSubTotal()}</td>
                        <td><a class="btn btn-success">Editar</a> <a class="btn btn-danger">Eliminar</a></td>
                    </tr>
                </tbody>
                </c:forEach>
            </table>

        </div>
        <div class="col-sm-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3>Compra</h3>
                </div>
                <div class="panel-body">
                    <label>Subtotal: </label>
                    <input type="text" value="$ ${totalPagar}" readonly="" class="form-control">
                    <label>Total a pagar: </label>
                    <input type="text" value="$ ${totalPagar}" readonly="" class="form-control">
                </div>
                <div class="panel-footer">
                    <a href="#" class="btn btn-info btn-block">Pagar</a>
                </div>

            </div>
        </div>
    </div>
</div>
<%@include file="plantillas/documento-cierre.jsp" %>