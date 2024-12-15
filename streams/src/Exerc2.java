import java.util.List;
import java.util.stream.Collectors;

public class Exerc2 {
    public static void main(String[] args) throws Exception {
        List<String> nomes = List.of("Ana", "Carlos", "Francisco", "Chagas", "Eduardo", "Fábio", "Baltazar", "Gaspar", "Fred", "Bela");

        List<String> nomesFiltrados = nomes.stream()
            .filter(nome -> nome.length() > 5)
            .sorted(String::compareTo)
            .collect(Collectors.toList());

        System.out.println(nomesFiltrados);
    }
}
