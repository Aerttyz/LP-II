public class Cliente {
    public String nome;
    public int idade;
    public int numeroCartao;
    public int qtdLivros = 0;

    public Cliente(String nome, int idade, int numeroCartao){
        this.idade = idade;
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    public void pegarLivro(){
        qtdLivros++;
    }
    public void devolverLivro(){
        qtdLivros--;
    }
    public void fazerAniversario(){
        idade++;
    }

}
