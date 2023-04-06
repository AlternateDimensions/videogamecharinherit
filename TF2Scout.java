import javafx.geometry.Point3D;


public class TF2Scout extends TF2Class{
    private String[] voiceLines;
    private Taunt[] scoutTaunts;

    public TF2Scout(){
        super("Scout", 125, 133, 2);
    }

    public String[] getVoiceLines() {
        return voiceLines;
    }
    public void setVoiceLines(String[] voiceLines) {
        this.voiceLines = voiceLines;
    }
    public Taunt[] getScoutTaunts() {
        return scoutTaunts;
    }
    public void setScoutTaunts(Taunt[] scoutTaunts) {
        this.scoutTaunts = scoutTaunts;
    }

    public Point3D doubleJump(Point3D origin){
        System.out.println(this.getName()+": BONK!");
        return new Point3D(0, 20, 0);
    }

    public void taunt(Taunt taunt){
        taunt.play();
    }



}
