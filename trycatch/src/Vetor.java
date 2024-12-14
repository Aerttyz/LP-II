import java.util.Scanner;

public class Vetor {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[10];
    boolean status = true;

    public void preencherVetor() {
        while (status) {
            try {
                System.out.println("Digite um número inteiro: ");
                int numero = sc.nextInt();
                System.out.println("Digite a posição do vetor: ");
                int posicao = sc.nextInt();

                vetor[posicao] = numero;
                System.out.println("Número " + numero + " adicionado na posição " + posicao + " do vetor.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição inválida. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            } 
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
