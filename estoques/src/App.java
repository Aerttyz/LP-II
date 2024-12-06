import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<Integer, Produto> estoque = new HashMap<>();

        estoque.put(1, new Produto("Arroz", 50));
        estoque.put(2, new Produto("Feijão", 25));
        estoque.put(3, new Produto("Açúcar", 10));
        estoque.put(4, new Produto("Sal", 35));
        estoque.put(5, new Produto("Óleo", 20));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Estoque:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar quantidade");
            System.out.println("3. Verificar produtos com baixa quantidade");
            System.out.println("4. Listar todos os produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade inicial: ");
                    int quantidade = scanner.nextInt();
                    estoque.put(id, new Produto(nome, quantidade));
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o ID do produto para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    if (estoque.containsKey(idAtualizar)) {
                        System.out.print("Digite a nova quantidade: ");
                        int novaQuantidade = scanner.nextInt();
                        estoque.get(idAtualizar).setQuantidade(novaQuantidade);
                        System.out.println("Quantidade atualizada com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nProdutos com quantidade inferior a 30:");
                    for (Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
                        if (entry.getValue().getQuantidade() < 30) {
                            System.out.println("- " + entry.getValue().getNome() + " (ID: " + entry.getKey()
                                    + ", Quantidade: " + entry.getValue().getQuantidade() + ")");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nLista de todos os produtos:");
                    for (Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
                        System.out.println("- " + entry.getValue().getNome() + " (ID: " + entry.getKey()
                                + ", Quantidade: " + entry.getValue().getQuantidade() + ")");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
