/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.ProductoDAO;
import bd.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import modelo.Carrito;
import modelo.ClienteService;
import modelo.ProductoService;
import webservice.Cliente;

/**
 *
 * @author jofas
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String add = "singin.jsp";
    String index = "index.jsp";
    String pageDos = "pageDos.jsp";
    String login = "login.jsp";
    String perfil = "perfil.jsp";
    String acceso = "";

    int validador;
    ClienteService cliente = new ClienteService();
    //ProductoService producto = new ProductoService();
    //webservice.Producto productoWS = new webservice.Producto();
    ProductoDAO dao = new ProductoDAO();
    Producto p = new Producto();

    int item = 0;
    int totalPagar = 0;
    int cantidad = 1;
    List<Carrito> listaCarro = new ArrayList<>();
   // List<Cliente> clientes = new ArrayList<>();
    // String superEmail; //= "0@4";
    // String superPass; //= "123";
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        
        HttpSession session = request.getSession();
                
        //Cliente cli = (Cliente)session.getAttribute("cliente");
        //clientes.add(cli);
        
        
        //String superEmail= request.getParameter("email"); //= "0@4";
        //String superPass = request.getParameter("clave"); //= "123";

        List<Producto> productos = dao.listarProducto();
        ////---------------------------------------------
       // clientes = cliente.listarCliente(superEmail);
        ////---------------------------------------------

       // request.setAttribute("clientes", clientes);

        //----------------------------------------------------------------
        switch (accion) {
            case "AgregarCarrito":
                int idProducto = Integer.parseInt(request.getParameter("id"));
                p = dao.listarId(idProducto);
                item = item + 1;
                Carrito car = new Carrito();
                car.setItem(item);
                car.setIdProducto(p.getId());
                car.setNombre(p.getNombre());
                car.setDescripcion(p.getDescripcion());
                car.setPrecioCompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubTotal(cantidad * p.getPrecio());
                listaCarro.add(car);
                System.out.println(listaCarro.size());
                request.setAttribute("contador", listaCarro.size());
                //----------------------------------------------------------
                request.getRequestDispatcher("Controlador?accion=pageDos").forward(request, response);
                // acceso = index;
                break;
            case "Carrito":
                request.setAttribute("contador", listaCarro.size());
                request.setAttribute("carrito", listaCarro);

                for (int i = 0; i < listaCarro.size(); i++) {
                    totalPagar = totalPagar + listaCarro.get(i).getSubTotal();
                }
                request.setAttribute("totalPagar", totalPagar);
                request.getRequestDispatcher("carrito.jsp").forward(request, response);
                break;
            case "pageDos":
                request.setAttribute("productos", productos);
                request.setAttribute("contador", listaCarro.size());
                request.getRequestDispatcher("pageDos.jsp").forward(request, response);
                //acceso = pageDos;
                break;
            case "perfil":
                request.getRequestDispatcher("perfil.jsp").forward(request, response);

                //acceso = perfil;
                break;
            case "login":
                request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        //----------------------------------------------------------------
        if (accion.equals("singin")) {
            request.getRequestDispatcher("singin.jsp").forward(request, response);
            //acceso = add;
        } else if (accion.equals("Guardar")) {
            String rut = request.getParameter("rut");
            String nombre = request.getParameter("nombreApellido");
            String email = request.getParameter("email");
            String direccion = request.getParameter("direccion");
            String pass = request.getParameter("clave");

            cliente.agregar(rut, nombre, direccion, email, pass);
            //--------------------------------
            request.getRequestDispatcher("login.jsp").forward(request, response);

            //acceso = login;
        } else if (accion.equals("index")) {
            request.setAttribute("productos", productos);
            request.setAttribute("contador", listaCarro.size());
            //----------------------------------
            request.getRequestDispatcher("index.jsp").forward(request, response);
            //acceso = index;

        } /*else if (accion.equals("login")) {

            validador = cliente.validar(superEmail, superPass);

            if (validador == 1) {
                request.setAttribute("productos", productos);
                request.setAttribute("contador", listaCarro.size());
                //------------------------------------------------

                request.getRequestDispatcher("pageDos.jsp").forward(request, response);
                //acceso = pageDos;
            } else {
                request.getRequestDispatcher("login.jsp").forward(request, response);
                //acceso = login;
            }
        }*/
        //RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        //dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
