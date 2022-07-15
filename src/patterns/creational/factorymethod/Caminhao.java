package patterns.creational.factorymethod;

public class Caminhao implements Veiculo {

    @Override
    public void start() {
        System.out.println("Begin");
    }

    @Override
    public void move() {
        System.out.println("Let's go!");
    }
}
