public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("João", "123.456.789-00", new ContaBancaria(0));
        cliente.depositar(500);
        cliente.sacar(200);
        cliente.depositar(100);
        cliente.consultarSaldo();
        cliente.consultarExtrato();
    }
}
