public class Quadrado extends Figura {
    private double lado;
    
    public Quadrado(double lado, String cor, boolean filled) {
        super(cor, filled);
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * this.lado;
    }

}
