public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("João", "123456789");
        Carro carro = new Carro("ABC1234", "Fusca", "Azul", false);
        cliente.fazerReserva(carro);
    }
}
