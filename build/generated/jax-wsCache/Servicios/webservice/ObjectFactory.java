
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Agregar_QNAME = new QName("http://webService/", "agregar");
    private final static QName _EditarCliente_QNAME = new QName("http://webService/", "editarCliente");
    private final static QName _EliminarCliente_QNAME = new QName("http://webService/", "eliminarCliente");
    private final static QName _ListarCliente_QNAME = new QName("http://webService/", "listarCliente");
    private final static QName _ListarClienteResponse_QNAME = new QName("http://webService/", "listarClienteResponse");
    private final static QName _ListarId_QNAME = new QName("http://webService/", "listarId");
    private final static QName _ListarIdResponse_QNAME = new QName("http://webService/", "listarIdResponse");
    private final static QName _ListarProducto_QNAME = new QName("http://webService/", "listarProducto");
    private final static QName _ListarProductoResponse_QNAME = new QName("http://webService/", "listarProductoResponse");
    private final static QName _Validar_QNAME = new QName("http://webService/", "validar");
    private final static QName _ValidarResponse_QNAME = new QName("http://webService/", "validarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link EditarCliente }
     * 
     */
    public EditarCliente createEditarCliente() {
        return new EditarCliente();
    }

    /**
     * Create an instance of {@link EliminarCliente }
     * 
     */
    public EliminarCliente createEliminarCliente() {
        return new EliminarCliente();
    }

    /**
     * Create an instance of {@link ListarCliente }
     * 
     */
    public ListarCliente createListarCliente() {
        return new ListarCliente();
    }

    /**
     * Create an instance of {@link ListarClienteResponse }
     * 
     */
    public ListarClienteResponse createListarClienteResponse() {
        return new ListarClienteResponse();
    }

    /**
     * Create an instance of {@link ListarId }
     * 
     */
    public ListarId createListarId() {
        return new ListarId();
    }

    /**
     * Create an instance of {@link ListarIdResponse }
     * 
     */
    public ListarIdResponse createListarIdResponse() {
        return new ListarIdResponse();
    }

    /**
     * Create an instance of {@link ListarProducto }
     * 
     */
    public ListarProducto createListarProducto() {
        return new ListarProducto();
    }

    /**
     * Create an instance of {@link ListarProductoResponse }
     * 
     */
    public ListarProductoResponse createListarProductoResponse() {
        return new ListarProductoResponse();
    }

    /**
     * Create an instance of {@link Validar }
     * 
     */
    public Validar createValidar() {
        return new Validar();
    }

    /**
     * Create an instance of {@link ValidarResponse }
     * 
     */
    public ValidarResponse createValidarResponse() {
        return new ValidarResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "editarCliente")
    public JAXBElement<EditarCliente> createEditarCliente(EditarCliente value) {
        return new JAXBElement<EditarCliente>(_EditarCliente_QNAME, EditarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "eliminarCliente")
    public JAXBElement<EliminarCliente> createEliminarCliente(EliminarCliente value) {
        return new JAXBElement<EliminarCliente>(_EliminarCliente_QNAME, EliminarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listarCliente")
    public JAXBElement<ListarCliente> createListarCliente(ListarCliente value) {
        return new JAXBElement<ListarCliente>(_ListarCliente_QNAME, ListarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listarClienteResponse")
    public JAXBElement<ListarClienteResponse> createListarClienteResponse(ListarClienteResponse value) {
        return new JAXBElement<ListarClienteResponse>(_ListarClienteResponse_QNAME, ListarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listarId")
    public JAXBElement<ListarId> createListarId(ListarId value) {
        return new JAXBElement<ListarId>(_ListarId_QNAME, ListarId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listarIdResponse")
    public JAXBElement<ListarIdResponse> createListarIdResponse(ListarIdResponse value) {
        return new JAXBElement<ListarIdResponse>(_ListarIdResponse_QNAME, ListarIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listarProducto")
    public JAXBElement<ListarProducto> createListarProducto(ListarProducto value) {
        return new JAXBElement<ListarProducto>(_ListarProducto_QNAME, ListarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listarProductoResponse")
    public JAXBElement<ListarProductoResponse> createListarProductoResponse(ListarProductoResponse value) {
        return new JAXBElement<ListarProductoResponse>(_ListarProductoResponse_QNAME, ListarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "validar")
    public JAXBElement<Validar> createValidar(Validar value) {
        return new JAXBElement<Validar>(_Validar_QNAME, Validar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "validarResponse")
    public JAXBElement<ValidarResponse> createValidarResponse(ValidarResponse value) {
        return new JAXBElement<ValidarResponse>(_ValidarResponse_QNAME, ValidarResponse.class, null, value);
    }

}
