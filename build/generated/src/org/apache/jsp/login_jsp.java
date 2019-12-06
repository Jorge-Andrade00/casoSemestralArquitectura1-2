package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/plantillas/documento-declaracion.jsp");
    _jspx_dependants.add("/plantillas/navbar.jsp");
    _jspx_dependants.add("/plantillas/documento-cierre.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <!--permite el uso de tildes y cosas por ese estilo-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <!--permite compatibilidad con IExplorer; ya que este es medio webiado-->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!--Ajuste para tamaño normal de la pagina-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--Incluimos archivo css para poder utilizarlo-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write('\n');
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("    <!--div: Puedes verlo como una caja con sus dimensiones respectivas(En este caso el div tiene una clase container; nos permitirá contener)-->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <!--crea botón de despliege ante un colapso(pantalla más pequeña)-->\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <!--span es una linea de texto. En este caso tiene la clase scream reader(para personas ciegas)-->\n");
      out.write("                <span class=\"sr-only\">Este botón despliega la barra de naavegación</span>\n");
      out.write("                <!--este span dibuja un ícono de una la barra de despliegue(En este caso tendremos 3 ya que son 3 los span creados)-->\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("\n");
      out.write("            </button>\n");
      out.write("            <!--creamos la cabezera de la página-->\n");
      out.write("            <!--a: crea enlaces para ir a otras páginas clickeando. En este caso la etiqueta a contiene la clase navbar-brand(significa logotipo de navegación)-->\n");
      out.write("            <a class=\"navbar-brand\" href=\"Controlador?accion=index\">CCO</a>\n");
      out.write("        </div>\n");
      out.write("        <!--Crea la lista para el botón de despliegue utilizando un ID como renferencia para el data-target del que se pide en el botón de despligue-->\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <!--ul:unorder list-->\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <!--li: objetos de la lista-->\n");
      out.write("                \n");
      out.write("                <li><a href=\"<?php echo RUTA_ABOUT ?>\">Quiénes somos</a></li>\n");
      out.write("                <li><a href=\"<?php echo RUTA_CONTACTO ?>\">Contacto</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"Controlador?accion=Carrito\" class=\"\"  role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\n");
      out.write("                        <span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span> (<label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)\n");
      out.write("\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"<?php echo RUTA_LOGOUT ?>\">\n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"Controlador?accion=login\"><span class=\"glyphicon glyphicon-log-in\" aria-hidden=\"true\"></span> Iniciar sesión</a></li>\n");
      out.write("                <li><a href=\"Controlador?accion=singin\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Registar</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading text-center\">\n");
      out.write("                    <h4>Iniciar sesión</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <!- CAMBIE EL ACTION DE Controlador A Sesion Y BORRE EL name DEL BOTON INICIAR SESION->\n");
      out.write("                    <form role=\"form\" action=\"Sesion\" method=\"post\">\n");
      out.write("                        <h2>Ingresa tus datos</h2>\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"email\" class=\"sr-only\">Email</label>\n");
      out.write("                        <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control\" placeholder=\"email@ejemplo.com\" required autofocus>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"clave\" class=\"sr-only\">Clave</label>\n");
      out.write("                        <input type=\"password\" name=\"clave\" id=\"clave\" class=\"form-control\" placeholder=\"Contraseña\" required>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" value=\"login\" class=\"btn btn-lg btn-primary btn-block\">Iniciar sesión</button>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("                        <a>¿Olvidaste tu contraseña?</a>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <a href=\"<?php echo RUTA_REGISTRO ?>\">¿Aún no te registras?</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        <!--Agregamos los elementos de JQuery para poder usar bootstrap-->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
