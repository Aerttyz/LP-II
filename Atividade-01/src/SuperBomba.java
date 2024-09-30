public class SuperBomba extends Inimigos {
    public SuperBomba(String nome, int vida, int velocidade, int dps, String sprite) {
        super(nome, vida, velocidade, dps, sprite);
    }

    @Override
    public void atacar() {
        System.out.println("SuperBomba mata todos");
    }

    @Override
    public void mover() {
        System.out.println("Move a SuperBomba");
    }

    @Override
    public void morrer() {
        System.out.println("SuperBomba Não morre");
    }

    public void explodir() {
        System.out.println("SuperBomba explode");
    }
}
