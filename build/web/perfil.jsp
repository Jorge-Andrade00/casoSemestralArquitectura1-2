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
<div class="container">
    <div class="jumbotron">
        <div class="container">
            <div class="row profile">
                <div class="col-md-3">
                    <div class="profile-sidebar">
                        <!-- SIDEBAR USERPIC -->
                        <div class="profile-userpic">
                            <img src="https://static.change.org/profile-img/default-user-profile.svg" class="img-responsive" alt="">
                        </div>
                        <!-- END SIDEBAR USERPIC -->
                        <!-- SIDEBAR USER TITLE -->
                        <div class="profile-usertitle">
                            <div class="profile-usertitle-name">
                                <?php echo ' ' . $_SESSION['nombre_usuario']; ?>
                                <br>
                                <br>
                            </div>
                        </div>
                        <!-- END SIDEBAR USER TITLE -->
                        <!-- SIDEBAR BUTTONS -->
                        <div class="profile-userbuttons">
                            <a href="editar.jsp">
                                <input type="button" class="btn btn-primary btn-sm" value="Editar perfil"/>
                            </a>
                            <a href="EliminarCliente?accion=eliminar">
                            <input type="button" class="btn btn-danger btn-sm" value="Eliminar"/>
                            </a>
                        </div>
                        <!-- END SIDEBAR BUTTONS -->
                        <!-- SIDEBAR MENU -->
                        <div class="profile-usermenu">
                            <ul class="nav">
                                <li>
                                    <a href="#">
                                        <i class="glyphicon glyphicon-flag"></i>
                                        Ayuda </a>
                                </li>
                            </ul>
                        </div>
                        <!-- END MENU -->
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="profile-content">
                        <br>
                        <br>
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Tus datos:
                            </div>
                            <div class="panel-body">
                                <c:forEach items="${clientes}" var="c">
                                    Nombre: <strong>${c.getNombre()}</strong><br/>
                                    Rut: <strong>${c.getRutCliente()}</strong><br/>
                                    Direccion: <strong>${c.getDireccion()}</strong><br/>
                                    Email: <strong>${c.getEmail()}</strong><br/>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <br>
    </div>
</div>




<%@include file="plantillas/documento-cierre.jsp" %>