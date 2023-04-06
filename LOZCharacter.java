public class LOZCharacter extends Character {
    private int health;
    private int stamina;

    public LOZCharacter(String n, int h, int s){
        super("Nintendo", "Legend of Zelda", "Link");
        health = h;
        stamina = s;
    }

    public int getHealth() {
        return health;
    }
    public int getStamina() {
        return stamina;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void moveDirection(int direction){
        System.out.println(this.getName()+" moves in direction "+direction);
    }

    public void fireWeapon(){
        System.out.println(this.getCompany()+" condones the use of weapons in the "+this.getFranchise()+" franchise.");
    }

    
}
