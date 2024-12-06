public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, String cor, boolean filled) {
        super(cor, filled);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.largura * this.altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}
