import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExcecaoAcimaDeCem extends Exception {
    public ExcecaoAcimaDeCem(String mensagem) {
        super(mensagem);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        int soma = 0;

        System.out.println("digite n numeros inteiros: ");

        try {
            while (true) {
                System.out.println("Digite um número: ");
                int numero = sc.nextInt();
                soma+=numero;
                if (soma > 100) {
                    throw new ExcecaoAcimaDeCem("A soma dos números digitados ultrapassou 100");
                }
                lista.add(numero);
                System.out.println("Soma: "+soma);
            }
        } catch (ExcecaoAcimaDeCem e) {
            System.out.println(e.getMessage());
        } finally {
            int qtdNumeros = lista.size();
            double media = (qtdNumeros > 0) ? (double) soma / qtdNumeros : 0;
            System.out.println("Quantidade de números digitados: " + qtdNumeros);
            System.out.println("Média dos números digitados: " + media);
            sc.close();  
        }

        Vetor vetor = new Vetor();
        vetor.preencherVetor();
    }
}
