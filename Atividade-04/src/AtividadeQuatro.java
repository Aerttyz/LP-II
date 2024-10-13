import java.util.Scanner;
public class AtividadeQuatro {
    Scanner sc = new Scanner(System.in);
    public void questao1(){
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = n-1; 0 <= i; i--){
            System.out.print(array[i]+"-");
        }
    }
    public void questao2(){
        int [] numeros =  new int[10];
        for(int i=0; i<10; i++){
            numeros[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(numeros[i]+"  ");
        }
    }
    public void questao3(){
        int[][] matriz = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.println("Digite o valor da linha "+(i+1)+" e coluna "+(j+1));
                matriz[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        int maior=0;
        int lugar[] = new int[2];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                    lugar[0] = i;
                    lugar[1] = j;
                }
            }
        }
        System.out.println("O maior valor da matriz é: "+maior);
        System.out.println("Ele está na linha "+(lugar[0]+1)+" e coluna "+(lugar[1]+1));
    }
    public void questao4(){
        int matrizA[][] = new int[2][3];
        int matrizB[][] = new int[3][2];
        int matrizC[][] = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("Digite o valor da matriz A na linha "+(i+1)+" e coluna "+(j+1));
                matrizA[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.println("Digite o valor da matriz B na linha "+(i+1)+" e coluna "+(j+1));
                matrizB[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                matrizC[i][j] = 0;
                for(int k=0; k<3; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("Matriz C:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(matrizC[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void questao5(){
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for(int i=0; i<n; i++){
            matriz[i][0] = 1;
            matriz[i][i] = 1;
        }
        for(int i=2; i<n; i++){
            for(int j=1; j<i; j++){
                matriz[i][j] = matriz[i-1][j-1] + matriz[i-1][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void questao6(){
        int[][] matriz = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void questao7(){
        int[][] matriz = new int[3][3];
        int soma = 0;   
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               if(j>i){
                     soma += matriz[i][j];
               }
            }     
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos acima da diagonal principal é: "+soma);
    }
    public void questao8(){
        int[][] matriz = new int[3][3];
        int soma = 0;   
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               if(j<i){
                     soma += matriz[i][j];
               }
            }     
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos abaixo da diagonal principal é: "+soma);
    }
    public void questao9(){
        int[][] matriz = new int[3][3];
        int soma = 0;   
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               if(j==i){
                     soma += matriz[i][j];
               }
            }     
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos da diagonal principal é: "+soma);
    }
    public void questao10(){
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
