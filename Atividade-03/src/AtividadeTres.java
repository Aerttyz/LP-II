import java.util.Scanner;
public class AtividadeTres {
    Scanner sc = new Scanner(System.in);
    public void questao1(){
        int[] notas = new int[3];
        boolean provaFinal = false;
        notas[0] = sc.nextInt();
        notas[1] = sc.nextInt();
        notas[2] = sc.nextInt();
        float media = (notas[0] + notas[1] + notas[2]) / 3;
        for(int i=0; i<notas.length; i++){
            if(notas[i] < 4){
                provaFinal = true;
                break;
            }
            
        }
        if(media >= 6 && !provaFinal){
            System.out.println("aprovado");
        }else if(media<6 || provaFinal){
            System.out.println("Prova Final");
        }
    }
    public void questao2(){
        char caracter = Character.toUpperCase(sc.next().charAt(0));
        if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
            System.out.println("Vogal");
        }else if((caracter >= 'A' && caracter <= 'Z')){
            System.out.println("Consoante");
        }else if(caracter >= '0' && caracter <= '9'){
            System.out.println("Numero");
        }else{
            System.out.println("Símbolo");
        }
    }
    public void questao3(){
        int ano = sc.nextInt();
            if(ano%4==0 && (ano%100!=0 ||  ano%400==0)){
                System.out.println("Ano Bissexto");
            }else{
                System.out.println("Ano não Bissexto");
            }
    }
    public void questao4(){
        int senha;
        do{
            senha = sc.nextInt();
            if(senha == 1234){
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Acesso Negado");
            }
        }while(senha != 1234);
    }
    public void questao5(){
        for(int i=0; i<=10; i++){
            for(int j=0; j<=10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            
        }
    }

    public void questao6(){
        int n = sc.nextInt();
        System.out.printf("e = 1");
        for(int i=1; i<=n; i++){
            
            System.out.printf(" + "+"1/"+i+"!");
        }
        System.out.println(" + ... + 1/n!");
    }

    public void questao7(){
        int fatorial = 1;
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
    public void questao8(){
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
}
