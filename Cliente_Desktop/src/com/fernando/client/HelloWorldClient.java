package com.fernando.client;

import com.fernando.ws.Artista;
import com.fernando.ws.Cliente;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.fernando.ws.HelloWorld;
import java.util.List;

public class HelloWorldClient {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.fernando.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("fernando"));

        List<Cliente> clientes = hello.getClienteList().getItem();
        if (!clientes.isEmpty()) {
            clientes.stream().forEach((lstUsuario1) -> {
                System.out.println(lstUsuario1.getNombre());
            });
        }else{
            System.out.println("La lista de clientes esta vacia");
        }
        
        List<Artista> artistas = hello.getArtistaList().getItem();
        if (!artistas.isEmpty()) {
            artistas.stream().forEach((lstUsuario1) -> {
                System.out.println(lstUsuario1.getNombre());
            });
        }else{
            System.out.println("La lista de artistas esta vacia");
        }

    }

}
