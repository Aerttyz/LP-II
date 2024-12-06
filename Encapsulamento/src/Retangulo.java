import java.util.Scanner;

public class Retangulo {
    
    Scanner sc = new Scanner(System.in);
    private double largura;
    private double altura;

    public void setAltura() {
        double altura = sc.nextDouble();
        this.altura = altura;
    }

    public void setLargura(){
        double largura = sc.nextDouble();
        this.largura = largura;
    }

    public double getArea(){
        return this.altura * this.largura;
    }

    public double getPerimetro(){
        return 2 * (this.altura + this.largura);
    }

    public void printArea(){
        System.out.println("O valor da área é: " + this.getArea());
    }

    public void printPerimetro(){
        System.out.println("O valor do perímetro é: " + this.getPerimetro());
    }
}
