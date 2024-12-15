import java.util.List;
import java.util.stream.Collectors;

public class Exerc3 {

    public static void main(String[] args) throws Exception {
       List<Integer> lista = List.of(10, 15, 22, 37, 45, 56, 87, 92, 98, 99, 101, 110 );

       List<Integer> pares = lista.stream()
           .filter(x -> x % 2 == 0)
           .collect(Collectors.toList());

        List<Integer> impares = lista.stream()
            .filter(x -> x % 2 == 1)
            .collect(Collectors.toList());

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

}
