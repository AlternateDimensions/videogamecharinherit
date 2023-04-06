public class SMOMario extends SMBCharacter {
    private int coins;
    private int moons;

    public SMOMario(int c, int m){
        super();
        coins = c;
        moons = m;
    }

    public int getCoins(){
        return coins;
    }

    public int getMoons(){
        return moons;
    }

    public void dive(){
        System.out.println(this.getName()+" dives!");
    }

    public void throwCappy(){
        System.out.println("Cappy was thrown!");
    }
}
