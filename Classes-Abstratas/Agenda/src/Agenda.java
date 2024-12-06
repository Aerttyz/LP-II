import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Pessoa> pessoas;

    public Agenda() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionar(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public void remover(String tipo) {
        this.pessoas.removeIf(pessoa -> pessoa.tipo().equals(tipo));
    }

    public void listar() {
        for (Pessoa pessoa : this.pessoas) {
            pessoa.listar();
        }
    }

    public Pessoa buscarNome(String nome) {
        for (Pessoa pessoa : this.pessoas) {
            if(pessoa.getNome().equalsIgnoreCase(nome)){
                return pessoa;
            }
        }
        return null;
    }

    public void ordenar() {
        this.pessoas.sort((p1, p2) -> p1.tipo().compareTo(p2.tipo()));
    }
    

    public Pessoa buscarTipo(String tipo) {
        for (Pessoa pessoa : this.pessoas) {
            if(pessoa.tipo().equalsIgnoreCase(tipo)){
                return pessoa;
            }
        }
        return null;
    }
}
