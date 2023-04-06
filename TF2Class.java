import javafx.geometry.Point3D;

public class TF2Class extends Character{
    private double health;
    private String team;
    private boolean isDead;
    private int defaultSpeed;
    private int captureSpeed;

    public TF2Class(){
        super("Valve", "Team Fortress", "Spy");
        health = 125;
        team = "Red";
        isDead = false;
        defaultSpeed = 107;
        captureSpeed = 1;
    }
    
    public TF2Class(String c, int h, int ds, int cs){
        super("Valve", "Team Fortress", c);
        health = h;
        team = "Blu";
        isDead = true;
        defaultSpeed = ds;
        captureSpeed = cs;
    }

    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public boolean isDead() {
        return isDead;
    }
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }
    public int getDefaultSpeed() {
        return defaultSpeed;
    }
    public void setDefaultSpeed(int defaultSpeed) {
        this.defaultSpeed = defaultSpeed;
    }
    public int getCaptureSpeed() {
        return captureSpeed;
    }
    public void setCaptureSpeed(int captureSpeed) {
        this.captureSpeed = captureSpeed;
    }

    public Point3D shoot(Point3D origin){
        System.out.println(this.getName() + " shoots and hits a target!");
        return new Point3D(0,0,0);
    }

    public void switchWeaponUp(){
        System.out.println("Switched up!");
    }

    public void switchWeaponDown(){
        System.out.println("Switched down!");
    }

    public void crouch(){
        System.out.println(this.getCompany()+"'s engine is buggy as heck but we're crouchin");
    }

    public Point3D jump(Point3D origin){
        System.out.println(this.getName()+" jumps up!");
        return new Point3D(0,20,0);
    }



    
}
