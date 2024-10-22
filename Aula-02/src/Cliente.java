public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void fazerReserva(Carro carro) {
        if(carro.isDisponivel()){
            Reserva reserva = new Reserva(this, carro);
            carro.setDisponivel(false);
            reserva.printReserva();
        }else{
            System.out.println("Carro não disponível para reserva");
        }
    }
}
