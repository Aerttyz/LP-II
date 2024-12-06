public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        PessoaFisica pessoaFisica = new PessoaFisica("Joao", "Rua 1", "JOAO@JOAO", "1234567890", "01/01/2000", "Solteiro");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa", "Rua 2", "EMPRESA@EMPRESA", "923456789", "123456789", "Empresa LTDA");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Maria", "Rua 3", "MARIA@MARIA", "3313456789", "01/01/2000", "Solteiro");

        agenda.adicionar(pessoaFisica);
        agenda.adicionar(pessoaJuridica);
        agenda.adicionar(pessoaFisica2);

        System.out.println("=== Busca por Nome ===");
        Pessoa pessoa = agenda.buscarNome("Joao");
        if (pessoa != null) {
            pessoa.listar();
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        System.out.println("\n=== Busca por CPF/CNPJ ===");
        String cpfBusca = "3313456789";
        pessoa = agenda.buscarTipo(cpfBusca);
        if (pessoa != null) {
            pessoa.listar();
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        System.out.println("\n=== Listagem de Todas as Pessoas ===");
        agenda.listar();

        System.out.println("\n=== Listagem Ordenada de Pessoas por CPF/CNPJ ===");
        agenda.ordenar();
        agenda.listar();

        System.out.println("\n=== Remoção de Pessoa com CPF/CNPJ " + cpfBusca + " ===");
        agenda.remover(cpfBusca);
        agenda.listar();

    }
}