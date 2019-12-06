/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import DAO.ProductoDAO;
import bd.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jofas
 */
public class Test {
    public static void main(String[] args) {
       // ClienteDAO cd = new ClienteDAO();
        ProductoDAO pdao = new ProductoDAO();
        
        
        List<Producto> datos =  new ArrayList<>();
        datos = pdao.listarProducto();
        for(Producto i: datos){
            System.out.println(i.getNombre());
        }
    }
}
