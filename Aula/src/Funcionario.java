public class Funcionario {
    public int qtdVendas;
    public String nome;
    public int id;
    public boolean trabalho = true;

    public Funcionario(int qtdVendas, String nome, int id){
        this.id = id;
        this.nome = nome;
        this.qtdVendas = qtdVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void fazerVenda(){
        qtdVendas++;
    }

    public void almocar(){
        System.out.println("mussando UwU ");
    }
    public void sair(){
        System.out.println("simboraS");
        trabalho = false;
    }

}
