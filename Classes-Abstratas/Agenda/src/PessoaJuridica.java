public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, String inscricaoEstadual, String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String tipo() {
        return cnpj;
    }

    @Override
    public void listar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscricao Estadual: " + this.inscricaoEstadual);
        System.out.println("Razao Social: " + this.razaoSocial);
        System.out.println("--------------------");
    }
}
