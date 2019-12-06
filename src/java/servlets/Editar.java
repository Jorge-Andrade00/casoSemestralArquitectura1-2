/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Editar", urlPatterns = {"/Editar"})
public class Editar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ClienteService cs = new ClienteService();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       // String accion = request.getParameter("accion");
        
        HttpSession session = request.getSession();
        Cliente user = (Cliente) session.getAttribute("cliente");

        
                

                

                // tiene que resivir los datos nuevos del cliente
                Cliente cli = new Cliente();
                String nombre =request.getParameter("txtNombre");
                String rut =request.getParameter("txtRut");
                String direccion=request.getParameter("txtDireccion");
                String email=request.getParameter("txtEmail");
                String pass=request.getParameter("txtPass");
                int id =(Integer)user.getIdCliente();
                
                cli.setNombre(nombre);
                cli.setRutCliente(rut);
                cli.setDireccion(direccion);
                cli.setEmail(email);
                cli.setPass(pass);
                cli.setIdCliente(id);

                cs.editarCliente(cli);

                session.removeAttribute("cliente");

                request.getRequestDispatcher("login.jsp").forward(request, response);
        

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
