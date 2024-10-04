import java.util.Scanner;

public class Resolucao {
    Scanner scanner = new Scanner(System.in);
    public void questao1(float b, float h){
        float area = b * h;
        float perimetro = 2 * (b + h);
        System.out.println("Área: " + area + " Perímetro: " + perimetro);
    }
    public void questao2(float l){
        float area = l * l;
        float perimetro = 4 * l;
        System.out.println("Área: " + area + " Perímetro: " + perimetro);
    }
    public void questao3(float r){
        float area = (float) (Math.PI * Math.pow(r, 2));
        float perimetro = (float) (2 * Math.PI * r);
        System.out.println("Área: " + area + " Perímetro: " + perimetro);
    }
    public void questao4(float l){
        float perimetro = l + l + l;
        System.out.println("Perímetro: " + perimetro);
    }
    public void questao5(){
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int quociente = numero1 / numero2;
        int resto = numero1 % numero2;
        System.out.println("Quociente: " + quociente + " Resto: " + resto);
        
    }
    public void questao6(){     
        int idadeEmDias = scanner.nextInt();
        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30;
        int dias = (idadeEmDias % 365) % 30;
        System.out.println("Anos: " + anos + " Meses: " + meses + " Dias: " + dias);
        
    }
    public void questao7(){
        float temperaturaFahrenheit = scanner.nextFloat();
        float temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
    }
    public void questao8(float r, float h){
        float volume = (float) (Math.PI * Math.pow(r, 2) * h);
        System.out.println("Volume: " + volume);
    }
    public void questao9(){
        int numero;
        do {
            numero = scanner.nextInt();
        } while (numero>=32);
        System.out.println(converterParaBinario(numero));

    }
    public String converterParaBinario(int numero){
        if(numero/2 != 0){
            if(numero%2 == 0){
                return converterParaBinario(numero/2) + "0";
            }else{
                return converterParaBinario(numero/2) + "1";
            }
        }
        return "1";
    }
    public void questao10(){
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int bimestre1 = nota1 + nota2;
        nota1 = scanner.nextInt();
        nota2 = scanner.nextInt();
        int bimestre2 = nota1 + nota2;
        int mediaSemestre = (bimestre1 + bimestre2) / 2;
        System.out.println("Média do semestre: " + mediaSemestre);
    }
    public void questao11(){
        float velocidadeMS = scanner.nextInt();
        float velocidadeKMH = velocidadeMS * 3.6f;
        System.out.println("Velocidade em km/h: " + velocidadeKMH);
    }
    public void questao12(){
        float resistencia1 = scanner.nextFloat();
        float resistencia2 = scanner.nextFloat();
        float resistencia3 = scanner.nextFloat();
        float resistenciaParalelo = 1 / ((1/resistencia1) + (1/resistencia2));
        float resistenciaTotal = resistenciaParalelo + resistencia3;
        System.out.println("Resistência total: " + resistenciaTotal);
    }
    public void questao13(){
        int tempo = scanner.nextInt();
        float velocidadeMedia = scanner.nextInt();
        float distancia = tempo * velocidadeMedia;
        float litrosUsados = distancia / 12;
        System.out.println("Litros usados: " + litrosUsados);
    }
    public void questao14(){
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        System.out.println("Número 1: " + numero1 + " Número 2: " + numero2);
        numero1 = numero1 - numero2;
        numero2 = numero1 + numero2;
        numero1 = numero2 - numero1;
        System.out.println("Número 1: " + numero1 + " Número 2: " + numero2);
    }
    public void questao15(){
        float comprimento = scanner.nextFloat();
        float largura = scanner.nextFloat();
        float altura = scanner.nextFloat();
        float volume = comprimento * largura * altura;
        System.out.println("Volume: " + volume);
    }
}
