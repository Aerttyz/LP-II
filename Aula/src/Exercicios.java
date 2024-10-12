import java.util.Scanner;
import static java.lang.Math.pow;
public class Exercicios {
    Scanner sc = new Scanner(System.in);
    public void exemplo1(){
        System.out.println("Peso:");
        double peso = sc.nextDouble();
        System.out.println("Altura:");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc < 25){
            System.out.println("Peso normal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade grau 1");
        }else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade grau 2");
        }else{
            System.out.println("Obesidade grau 3");
        }
    }

    public void exemplo2(){
        System.out.println("Lado ou angulo:");
        double lado1 = sc.nextDouble();
        System.out.println("Lado ou angulo:");
        double lado2 = sc.nextDouble();
        System.out.println("Lado ou angulo:");
        double lado3 = sc.nextDouble();
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilátero");
        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Isósceles");
        }else{
            System.out.println("Escaleno");
        }
    }

    public void exemplo3(){
        System.out.println("Velocidade Máxima:");
        double velocidadeMaxima = sc.nextDouble();
        System.out.println("Velocidade do carro:");
        double velocidadeCarro = sc.nextDouble();
        if(velocidadeCarro>velocidadeMaxima){
            double diferenca = velocidadeCarro - velocidadeMaxima;
            double multa = (diferenca/velocidadeMaxima) * 100;
            double valorFixo = 80;
            if(multa > 30){
                System.out.println("Multa de R$" + (valorFixo + 800));
            }else if(multa>10 && multa<=30){
                System.out.println("Multa de R$" + (valorFixo + 80));
            }else{
                System.out.println("Multa de R$" + valorFixo);
            }
        }
    }

        public void exemplo4(){
            System.out.println("qual operação");
            int operacao = sc.nextInt(); 
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();  
            switch (operacao) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    System.out.println(n1 / n2);
                    break;
                case 5:
                    System.out.println(pow(n1, n2));
            
                default:
                    break;
            }
        }

        public void exemplo5(){
            System.out.println("escolha um numero:");
            int numero = sc.nextInt();
            int numeroRandom = (int) (Math.random() * 101);
            if(numero == numeroRandom){
                System.out.println("Acertou");
            }else{
                System.out.println("Errou");
            }
        }

        public void exemplo6(){
            int numero;
            do {
                System.out.println("Digite um número:");
                numero = sc.nextInt();
                if(numero%2==0){
                    System.out.println("par");
                }else{
                    System.out.println("impar");
                }
            } while (numero != 0);
        }

        public void exemplo7(){
            int numero=0;
            int i=0;

            do {
                int novoNumero = sc.nextInt();
                numero += novoNumero;
                i++;
            } while (i<5);
            System.out.println(numero/5);
        }
        public void exemplo8(){
            for(int i=1;i<1000;i++){
             if(primo(i)){
                System.out.println(i);
             }
            }
        }

        public boolean primo(int i){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    return false;
                }
            }
            return true;
        }

    public void exemplo9(){
        int som=0;
        for(int i=1;i<=100;i++){
            if(i%5==0){
                continue;
            }else{
                som+=i;
            }
        }
        System.out.println(som);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void triangulo(){
        for(int i = 1; i <= 9; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void fibonacci(){
        int n = 11;
        int a = 0;
        int b = 1;
        int c;
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
