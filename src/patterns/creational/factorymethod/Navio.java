package patterns.creational.factorymethod;

public class Navio implements Veiculo {
    @Override
    public void start() {
        System.out.println("Here I come!");
    }

    @Override
    public void move() {
        System.out.println("Row row row your boat");
    }
}
