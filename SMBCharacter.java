public class SMBCharacter extends Character{
    private int lives;
    private double velocity;

    public SMBCharacter(){
        super("Nintendo", "Super Mario", "Mario");
        lives = 1;
        velocity = 0.0;
    }

    public SMBCharacter(int l, double v){
        lives = l;
        velocity = v;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public int getLives(){
        return lives;
    }

    public double getVelocity(){
        return velocity;
    }
    

    public void moveDirection(int direction){
        System.out.println("The character"+this.getName()+"moves in the direction " + direction);
    }

    public void sprint(){
        System.out.println("The character sprints!");
    }
}
