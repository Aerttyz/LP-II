public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        TrianguloRetangulo triangulo = new TrianguloRetangulo();

        System.out.println("Digite a altura do retângulo: ");
        retangulo.setAltura();
        System.out.println("Digite a largura do retângulo: ");
        retangulo.setLargura();
        retangulo.printArea();
        retangulo.printPerimetro();
        System.out.println("Digite o cateto base do triângulo retângulo: ");
        triangulo.setCatetoBase();
        System.out.println("Digite o cateto altura do triângulo retângulo: ");
        triangulo.setCatetoAltura();
        triangulo.getHipotenusa();
        triangulo.printHipotenusa();
        triangulo.printArea();
        triangulo.printPerimetro();
        
    }
}
