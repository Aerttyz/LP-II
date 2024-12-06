@FunctionalInterface
interface Square {
    double calculate(double x);
}


public class App {
    public static void main(String[] args) throws Exception {
       Square s = (double x) -> Math.pow(x, 2);
       System.out.println(s.calculate(5));
    }
}
