package com.fernando.ws;

import Logica.Artista;
import Logica.Cliente;
import Logica.Manejador.ManejadorUsuarios;
import Logica.Usuario;
import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.fernando.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

    @Override
    public Cliente[] getClienteList() {
        return (Cliente[]) ManejadorUsuarios.getInstance().getClientes().toArray();
    }

    @Override
    public Artista[] getArtistaList() {
        return (Artista[]) ManejadorUsuarios.getInstance().getArtistas().toArray();
    }

    @Override
    public Usuario[] getUsuarioList() {
        return (Usuario[]) ManejadorUsuarios.getInstance().getUsuarios().toArray();
    }

}
