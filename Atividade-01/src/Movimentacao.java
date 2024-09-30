import java.util.Scanner;
public class Movimentacao {
    private char direcao;


    
    public char tecla(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a direção: ");
        direcao = scanner.next().charAt(0);
        scanner.close();
        return direcao;
    }
    
    public void mover() {
        if(direcao == 'w'){
            System.out.println("Pulando");
        } else if(direcao == 'a'){
            System.out.println("Movendo para esquerda");
        } else if(direcao == 's'){
            System.out.println("Abaixando");
        } else if(direcao == 'd'){
            System.out.println("Movendo para direita");
        } else {
            System.out.println("Nada faz");
        }
    }

}
