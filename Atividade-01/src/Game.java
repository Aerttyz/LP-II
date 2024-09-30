import java.util.Timer;

public class Game {
    private boolean status;
    private Timer tempo;
    private Timer record;
    private String fase;
    private String songUrl;

    public Game(boolean status, Timer tempo, Timer record, String fase, String songUrl){
        this.status = status;
        this.tempo = tempo;
        this.record = record;
        this.fase = fase;
        this.songUrl = songUrl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Timer getTempo() {
        return tempo;
    }

    public void setTempo(Timer tempo) {
        this.tempo = tempo;
    }

    public Timer getRecord() {
        return record;
    }

    public void setRecord(Timer record) {
        this.record = record;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    

}
