<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default navbar-fixed-top">
    <!--div: Puedes verlo como una caja con sus dimensiones respectivas(En este caso el div tiene una clase container; nos permitir� contener)-->
    <div class="container">
        <div class="navbar-header">
            <!--crea bot�n de despliege ante un colapso(pantalla m�s peque�a)-->
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <!--span es una linea de texto. En este caso tiene la clase scream reader(para personas ciegas)-->
                <span class="sr-only">Este bot�n despliega la barra de naavegaci�n</span>
                <!--este span dibuja un �cono de una la barra de despliegue(En este caso tendremos 3 ya que son 3 los span creados)-->
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>

            </button>
            <!--creamos la cabezera de la p�gina-->
            <!--a: crea enlaces para ir a otras p�ginas clickeando. En este caso la etiqueta a contiene la clase navbar-brand(significa logotipo de navegaci�n)-->
            <a class="navbar-brand" href="Controlador?accion=pageDos">CCO</a>
        </div>
        <!--Crea la lista para el bot�n de despliegue utilizando un ID como renferencia para el data-target del que se pide en el bot�n de despligue-->
        <div id="navbar" class="navbar-collapse collapse">
            <!--ul:unorder list-->
            <ul class="nav navbar-nav">
                <!--li: objetos de la lista-->
                
                <li><a href="<?php echo RUTA_ABOUT ?>">Qui�nes somos</a></li>
                <li><a href="<?php echo RUTA_CONTACTO ?>">Contacto</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="Controlador?accion=perfil">
                        <span class="glyphicon glyphicon-user" aria-hidden="true"></span> 
                        <c:forEach items="${clientes}" var="c">
                            <strong>${c.getNombre()}</strong>
                        </c:forEach>
                    </a>
                </li>
                <li class="dropdown">
                    <a href="Controlador?accion=Carrito" class=""  role="button" aria-haspopup="true" aria-expanded="false">

                        <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> (<label>${contador}</label>)

                    </a>

                </li>
                <li>
                    <a href="CerrarSesion">
                        <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Cerrar sesi�n
                    </a>
                </li>
                
            </ul>
        </div>

    </div>
</nav>