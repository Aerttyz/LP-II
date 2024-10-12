import java.util.Scanner;
public class AtividadeTres {
    Scanner sc = new Scanner(System.in);
    public void questao1(){
        int[] notas = new int[3];
        notas[0] = sc.nextInt();
        notas[1] = sc.nextInt();
        notas[2] = sc.nextInt();
        float media = (notas[0] + notas[1] + notas[2]) / 3;
        for(int i=0; i<notas.length; i++){
            if(notas[i] < 4){
                System.out.println("prova final");
                break;
            }
            
        }
        if(media >= 6){
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
        }
    }
}
