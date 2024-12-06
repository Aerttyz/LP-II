import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Map<Integer, Boolean> presenca = new HashMap<>();
        Map<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Jose");
        alunos.put(2, "Joao");
        alunos.put(3, "Felipe");
        alunos.put(4, "Marico");

        for (Integer id : alunos.keySet()) {
            presenca.put(id, false);
        }

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nLista de Presença:");
            System.out.println("1. Marcar presença");
            System.out.println("2. Consultar alunos presentes");
            System.out.println("3. Consultar alunos ausentes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do aluno para marcar presença: ");
                    int id = scanner.nextInt();
                    if (alunos.containsKey(id)) {
                        presenca.put(id, true);
                        System.out.println(alunos.get(id) + " está presente.");
                    } else {
                        System.out.println("ID do aluno não encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("\nAlunos presentes:");
                    for (Map.Entry<Integer, Boolean> entry : presenca.entrySet()) {
                        if (entry.getValue()) {
                            System.out.println("- " + alunos.get(entry.getKey()));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nAlunos ausentes:");
                    for (Map.Entry<Integer, Boolean> entry : presenca.entrySet()) {
                        if (!entry.getValue()) {
                            System.out.println("- " + alunos.get(entry.getKey()));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}