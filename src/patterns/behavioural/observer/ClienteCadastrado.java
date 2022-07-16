package patterns.behavioural.observer;

public class ClienteCadastrado implements Cliente {

    @Override
    public void receber(String aviso) {
        System.out.println(aviso);
    }
}
