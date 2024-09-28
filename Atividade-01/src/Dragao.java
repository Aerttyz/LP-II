public class Dragao extends Inimigos {
    public Dragao(String nome, int vida, int velocidade, int dps, String sprite) {
        super(nome, vida, velocidade, dps, sprite);
    }

    @Override
    public void atacar() {
        System.out.println("Chefão ataca");
    }

    @Override
    public void mover() {
        System.out.println("Move o chefão");
    }

    @Override
    public void morrer() {
        System.out.println("Chefão morre");
    }
}
