public abstract class Character {
    private String company;
    private String franchise;
    private String name;

    public Character(){
        company = "None";
        franchise = "None";
        name = "";
    }

    public Character(String c, String f, String n){
        company = c;
        franchise = f;
        name = n;
    }

    public String getCompany(){
        return this.company;
    }

    public String getFranchise(){
        return this.franchise;
    }

    public String getName(){
        return this.name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public void setName(String name) {
        this.name = name;
    }

}