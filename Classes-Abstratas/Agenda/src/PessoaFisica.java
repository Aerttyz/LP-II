public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNascimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }
    
    @Override
    public String tipo() {
        return cpf;
    }

    @Override
    public void listar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Estado Civil: " + this.estadoCivil);
        System.out.println("--------------------");
    }


}
