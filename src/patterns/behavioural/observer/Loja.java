package patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String aviso;
    private List<Cliente> clientes = new ArrayList<>();

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void notificar(String aviso) {
        this.aviso = aviso;
        for (Cliente c : clientes) {
            c.receber(this.aviso);
        }
    }
}
