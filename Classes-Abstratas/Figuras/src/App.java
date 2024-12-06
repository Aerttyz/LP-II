public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(5, "Azul", true);
        Retangulo retangulo = new Retangulo(5, 10, "Vermelho", false);
        Quadrado quadrado = new Quadrado(10, "Verde", true);

        System.out.println("=== Círculo ===");
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Filled: " + circulo.isFilled());
        System.out.println("=== Retângulo ===");
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
        System.out.println("Cor: " + retangulo.getCor());
        System.out.println("Filled: " + retangulo.isFilled());
        System.out.println("=== Quadrado ===");
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());
        System.out.println("Cor: " + quadrado.getCor());
        System.out.println("Filled: " + quadrado.isFilled());
    }
}
