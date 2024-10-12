import java.util.Scanner;
public class ExerciciosDois {
    public void exemplo1(){
        int [] numeros =  new int[10];
        int maior=0;
        for(int i=0; i<10; i++){
            numeros[i] = (int) (Math.random() * 10);
        }
        for(int i=0; i<10; i++){
            if(numeros[i]>maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: "+maior);
    }
    public void exemplo2(){
        int [] numeros =  new int[10];
        for(int i=0; i<10; i++){
            numeros[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<10; i++){
            System.out.println(numeros[i]);
        }
    }
    public void exemplo3(){
        int[][] matriz = new int[3][3];
        int soma = 0; 
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
             for(int j = 0; j < 3; j++){
                System.out.printf("Insira o elemento M[%d][%d]: ",i+1,j+1);
                matriz[i][j] = sc.nextInt();
             }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                soma += matriz[i][j];
            }
        }
        System.out.println(soma);
    }
    public void exemplo4(){
        int[][] matriz = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i==j){
                    matriz[i][j] = 1;
                }else if(i<j){
                    matriz[i][j] = 2;
                }else{
                    matriz[i][j] = 3;
                }
            }
       }
       for(int i=0; i<3; i++){
            for(int j = 0; j< 3; j++){
                System.out.printf("\t %d \t",matriz[i][j]);
            }
       }
    }
    public void desafio(){
        String[][] matriz = new String[8][8];
        Scanner sc = new Scanner(System.in);
        int posicao1 = sc.nextInt();
        int posicao2 = sc.nextInt();
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){
                if(i==posicao1){
                    matriz[i][j] = "x";
                }else if(j==posicao2){
                    matriz[i][j] = "x";
                }else{
                    matriz[i][j] = "-";
                }
            }
        } 
          
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){
                System.out.printf(matriz[i][j]+" ");
            }
            System.out.println("\t    ");
        }

    }
}
