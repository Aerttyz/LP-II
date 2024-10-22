public class Reserva {
    private Cliente cliente;
    private Carro carro;

    public Reserva(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void printReserva(){
        System.out.println("Reserva feita por: " + cliente.getNome());
        System.out.println("Carro: " + carro.getModelo());
    }

}
