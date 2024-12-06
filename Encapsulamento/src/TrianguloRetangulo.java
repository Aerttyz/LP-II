import java.util.Scanner;
public class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;
    Scanner sc = new Scanner(System.in);
    public void setCatetoBase() {
        double catetoBase = sc.nextDouble();
        this.catetoBase = catetoBase;
    }

    public void setCatetoAltura() {
        double catetoAltura = sc.nextDouble();
        this.catetoAltura = catetoAltura;
    }

    public void getHipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(this.catetoBase, 2) + Math.pow(this.catetoAltura, 2));
    }

    public void printHipotenusa() {
        System.out.println("O valor da hipotenusa é: " + this.hipotenusa);
    }

    public void printArea() {
        System.out.println("O valor da área é: " + (this.catetoBase * this.catetoAltura) / 2);
    }

    public void printPerimetro() {
        System.out.println("O valor do perímetro é: " + (this.catetoBase + this.catetoAltura + this.hipotenusa));
    }
}
