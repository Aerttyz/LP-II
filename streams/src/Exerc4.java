import java.util.List;
import java.util.stream.Collectors;

public class Exerc4 {

    public static void main(String[] args) throws Exception {
        String texto =  "programacao em java";

        List<String> charUnico =  texto.chars()
            .mapToObj(c -> String.valueOf((char) c))
            .distinct()
            .sorted(String::compareTo)
            .collect(Collectors.toList());  

        System.out.println(charUnico);
    }
}
