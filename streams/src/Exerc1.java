import java.util.List;

public class Exerc1 {
    public static void main(String[] args) throws Exception {
        List<Integer> pipeline = List.of(1,2,3,4,5);
        int result = pipeline.stream()
            .filter(x -> x % 2 == 1)
            .map(x -> x * x)
            .reduce(0, (x, y) -> x + y);


        System.out.println(result);
    }
}
