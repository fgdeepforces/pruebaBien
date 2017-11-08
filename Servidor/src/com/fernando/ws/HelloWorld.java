package com.fernando.ws;

import Logica.Artista;
import Logica.Cliente;
import Logica.Usuario;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);
    
    @WebMethod
    Usuario[] getUsuarioList();
    
    @WebMethod
    Cliente[] getClienteList();
    
    @WebMethod
    Artista[] getArtistaList();

}
