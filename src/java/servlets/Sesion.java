/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.ClienteService;
import webservice.Cliente;

/**
 *
 * @author jofas
 */
@WebServlet(name = "Sesion", urlPatterns = {"/Sesion"})
public class Sesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int validador;
    ClienteService cliente = new ClienteService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //String accion = request.getParameter("accion");

        String superEmail = request.getParameter("email");
        String superPass = request.getParameter("clave");

        List<Cliente> listaClientes = cliente.listarCliente(superEmail);
        List<Cliente> clientes = new ArrayList<>();

        validador = cliente.validar(superEmail, superPass);
        Cliente cli = new Cliente();

        if (validador == 1) {
            for (Cliente x : listaClientes) {

                cli.setIdCliente(x.getIdCliente());
                cli.setRutCliente(x.getRutCliente());
                cli.setNombre(x.getNombre());
                cli.setDireccion(x.getDireccion());
                cli.setEmail(x.getEmail());
                cli.setPass(x.getPass());
                
                clientes.add(cli);
                
                break;
            }

            HttpSession session = request.getSession();
            session.setAttribute("cliente", cli);
            session.setAttribute("clientes", clientes);

            request.getRequestDispatcher("pageDos.jsp").forward(request, response);
            
            //------------------------------------

            //------------------------------------------------
            //request.getRequestDispatcher("pageDos.jsp").forward(request, response);
            //acceso = pageDos;
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
            //acceso = login;
        }
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
        processRequest(request, response);
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
