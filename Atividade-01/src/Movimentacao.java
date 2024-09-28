public class Movimentacao {
    private char direcao;
    
    
    public void mover() {
        if(direcao == 'w'){
            System.out.println("Pulando");
        } else if(direcao == 'a'){
            System.out.println("Movendo para esquerda");
        } else if(direcao == 's'){
            System.out.println("Abaixando");
        } else if(direcao == 'd'){
            System.out.println("Movendo para direita");
        } else {
            System.out.println("Nada faz");
        }
    }

}
