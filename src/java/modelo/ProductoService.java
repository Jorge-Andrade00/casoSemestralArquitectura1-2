/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import webservice.Producto;

/**
 *
 * @author jofas
 */
public class ProductoService {

    public ProductoService() {
    }

    public Producto listarId(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarId(id);
    }

}
