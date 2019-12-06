/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jofas
 */
public class ClienteService {
    public ClienteService(){
    }

    public void agregar(java.lang.String rut, java.lang.String nombre, java.lang.String direccion, java.lang.String email, java.lang.String pass) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        port.agregar(rut, nombre, direccion, email, pass);
    }

    public int validar(java.lang.String email, java.lang.String pass) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.validar(email, pass);
    }

    public static java.util.List<webservice.Cliente> listarCliente(java.lang.String email) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarCliente(email);
    }

    public void eliminarCliente(java.lang.String rut) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        port.eliminarCliente(rut);
    }

    public void editarCliente(webservice.Cliente cli) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        port.editarCliente(cli);
    }

    

    
    
    
}
