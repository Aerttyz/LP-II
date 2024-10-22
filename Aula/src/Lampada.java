public class Lampada {
    public boolean status;
    public int[] cor = new int[3];
    public int brilho;

    public Lampada(boolean status, int[] cor, int brilho){
        this.status = status;
        this.cor = cor;
        this.brilho = brilho;
    };

    public void getStatus(){
        System.out.println("Status: "+status);
    };
    public void getCor(){
        System.out.println("RGB: "+cor[0]+", "+cor[1]+", "+cor[2]);
    };
    public void getBrilho(){
        System.out.println("Brilho: "+brilho);
    };

    public void setStatus(boolean status){
        this.status = status;
    };
    public void setCor(int[] cor){
        this.cor = cor;
    };
    public void setBrilho(int brilho){
        this.brilho = brilho;
    };

    public void ligar(){
        System.out.println("Ligando lampada...");
        status = true;
    };
    public void desligar(){
        System.out.println("Desligando lampada...");
        status = false;
    };

    public void preencherLampada(){
        System.out.println("Preenchendo lampada...");
        for(int i=0; i<3; i++){
            cor[i] = (int)(Math.random()*256);
        }
        brilho = (int)(Math.random()*101);
        status = false;
    };
}
