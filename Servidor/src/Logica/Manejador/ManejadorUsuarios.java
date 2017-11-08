package Logica.Manejador;

import Logica.Artista;
import Logica.Cliente;
import Logica.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ManejadorUsuarios {
    
    private ManejadorUsuarios() {
    }
    
    public static ManejadorUsuarios getInstance() {
        return ManejdaorUsuariosHolder.INSTANCE;
    }
    
    private static class ManejdaorUsuariosHolder {

        private static final ManejadorUsuarios INSTANCE = new ManejadorUsuarios();
    }
    
    /************************Operaciones Usuario
     * @return s***************************/
    public List<Usuario> getUsuarios(){
        List<Usuario> users = new ArrayList<>();
        users.addAll(getClientes());
        users.addAll(getArtistas());
        return users;
    }
    
    /************************Operaciones Cliente
     * @return s***************************/
    public List<Cliente> getClientes(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Fernando"));
        clientes.add(new Cliente("Emiliano"));
        clientes.add(new Cliente("Federico"));
        return clientes;
    }
    
    /************************Operaciones Artista
     * @return s***************************/
    public List<Artista> getArtistas(){
        List<Artista> artistas = new ArrayList<>();
        artistas.add(new Artista("Nicolas"));
        artistas.add(new Artista("German"));
        artistas.add(new Artista("Gonzalo"));
        return artistas;
    }
}
