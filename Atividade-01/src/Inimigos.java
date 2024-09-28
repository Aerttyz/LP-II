abstract class Inimigos {
    private String nome;
    private int vida;
    private int velocidade;
    private int dps;
    private String sprite;

    public Inimigos(String nome, int vida, int velocidade, int dps, String sprite) {
        this.nome = nome;
        this.vida = vida;
        this.velocidade = velocidade;
        this.dps = dps;
        this.sprite = sprite;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDps() {
        return dps;
    }

    public String getSprite() {
        return sprite;
    }

    public abstract void atacar();

    public abstract void mover();

    public abstract void morrer();

}
