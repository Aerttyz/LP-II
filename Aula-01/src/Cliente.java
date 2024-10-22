public class Cliente {
    private String nome;
    private String cpf;
    private ContaBancaria conta;
    private double[] extrato = new double[100];
    private int extratoIndex = 0;

    public Cliente(String nome, String cpf, ContaBancaria conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void depositar(double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        extrato[extratoIndex] = valor;
        extratoIndex++;
    }

    public void sacar(double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
        extrato[extratoIndex] = -valor;
        extratoIndex++;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + conta.getSaldo());
    }

    public void consultarExtrato() {
        System.out.println("Extrato:");
        for (int i = 0; i < 3; i++) {
            System.out.println(extrato[i]);
        }
    }

}
