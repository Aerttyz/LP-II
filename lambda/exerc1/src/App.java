@FunctionalInterface    
interface filtroPorIdade {
    public Pessoa filtrar(int idade);
}

@FunctionalInterface
interface ordernarPorNome {
    public Pessoa[] ordenar(Pessoa[] pessoas);
}

@FunctionalInterface
interface Desconto {
    public double novoSalario(Pessoa pessoa);
}


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("João", 20, 1000);
        Pessoa p2 = new Pessoa("Maria", 30, 2000);
        Pessoa p3 = new Pessoa("José", 40, 3000);
        Pessoa p4 = new Pessoa("Ana", 50, 4000);
        Pessoa p5 = new Pessoa("Pedro", 60, 5000);

        Pessoa[] pessoas = {p1, p2, p3, p4, p5};

        filtroPorIdade filtro = (int idade) -> {
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getIdade() == idade) {
                    return pessoa;
                }
            }
            return null;
        };

        ordernarPorNome ordernar = (Pessoa[] listaPessoas) -> {
            for (int i = 0; i < listaPessoas.length; i++) {
                for (int j = 0; j < listaPessoas.length - 1; j++) {
                    if (listaPessoas[j].getNome().compareTo(listaPessoas[j + 1].getNome()) > 0) {
                        Pessoa temp = listaPessoas[j];
                        listaPessoas[j] = listaPessoas[j + 1];
                        listaPessoas[j + 1] = temp;
                    }
                }
            }
            return listaPessoas;
        };

        Desconto desconto = (Pessoa pessoa) -> {
            if (pessoa.getSalario() > 2000) {
                return pessoa.getSalario() * 0.9;
            } else {
                return pessoa.getSalario() * 0.95;
            }
        };

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " Salário: " + desconto.novoSalario(pessoa));
        }



        for(int i=0;i<pessoas.length;i++){
            System.out.println(ordernar.ordenar(pessoas)[i].getNome());
        }

        System.out.println("filtro por idade: "+filtro.filtrar(30).getNome()+" idade:"+filtro.filtrar(30).getIdade());
    }
}
