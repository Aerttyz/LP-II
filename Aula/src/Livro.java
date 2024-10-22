public class Livro {
    public int ibnt;
    public String nomeLivro;
    public int numeroPag;
    public boolean disponivel = true;
    public String sinopse;

    public Livro(int ibnt, String nomeLivro, int numeroPag, String sinopse){
        this.ibnt = ibnt;
        this.nomeLivro = nomeLivro;
        this.numeroPag = numeroPag;
        this.sinopse = sinopse;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getIbnt() {
        return ibnt;
    }

    public void setIbnt(int ibnt) {
        this.ibnt = ibnt;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void pegarLivro(){
        disponivel = false;
    }
    public void devolverLivro(){
        disponivel = true;
    }
    public void verSinopse(){
        System.out.println(sinopse);
    }
    
}
