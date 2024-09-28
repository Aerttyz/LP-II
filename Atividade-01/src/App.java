public class App {
    public static void main(String[] args) throws Exception {
        Inimigos dragao = new Dragao
        ( "Ganon", 1000, 10, 100, "Ganon.png" );

        System.out.println("Nome: " + dragao.getNome());
        System.out.println("Vida: " + dragao.getVida());
        System.out.println("Velocidade: " + dragao.getVelocidade());
        System.out.println("DPS: " + dragao.getDps());
        System.out.println("Sprite: " + dragao.getSprite());
    }
}
