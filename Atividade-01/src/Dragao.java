public class Dragao extends Inimigos {
    public Dragao(String nome, int vida, int velocidade, int dps, String sprite) {
        super(nome, vida, velocidade, dps, sprite);
    }

    @Override
    public void atacar() {
        System.out.println("Dragão ataca");
    }

    @Override
    public void mover() {
        System.out.println("Move o dragão");
    }

    @Override
    public void morrer() {
        System.out.println("dragão morre");
    }    
}
