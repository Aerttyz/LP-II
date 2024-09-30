import java.sql.Time;

public class Mario {
    private int vidas;
    private int moedas;
    private boolean invencivel = false;
    private boolean estrela = false;
    private boolean cogumelo = false;

    public Mario(int vidas, int moedas, boolean invencivel, boolean estrela, boolean cogumelo) {
        this.vidas = vidas;
        this.moedas = moedas;
        this.invencivel = invencivel;
        this.estrela = estrela;
        this.cogumelo = cogumelo;
    }

    public int getVidas() {
        return vidas;
    }

    public int getMoedas() {
        return moedas;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public boolean isEstrela() {
        return estrela;
    }

    public boolean isCogumelo() {
        return cogumelo;
    }

    public void ganharVida() {
        this.vidas++;
    }

    public void perderVida() {
        this.vidas--;
    }

    
    public void mover(char direcao) {   
        Movimentacao mov = new Movimentacao();
        mov.tecla();
        mov.mover();
    }

    public void morrer(){
        if(vidas == 0){
            System.out.println("Game Over");
        } 
    }

    public void comerCogumelo(){
        this.cogumelo = true;
        Time tempo = new Time(100);
        if(tempo.getTime() == 0){
            this.cogumelo = false;
        }
    }

    public void comerEstrela(){
        this.estrela = true;
        Time tempo = new Time(100);
        if(tempo.getTime() == 0){
            this.estrela = false;
        }
    }
    public void pegarMoeda(){
        this.moedas++;
    }
}
