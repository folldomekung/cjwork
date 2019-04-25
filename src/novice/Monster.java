package novice;


public class Monster {
    private String nm;
    private int level;
    private int Hp;
    public Monster(String nameMons,int Level,int hp){
        nm=nameMons;
        level = Level;
        Hp=hp;
    }

    
    public String getNameMons(){
        return nm;
    }
    public int getLevel(){
        return level;
    }
    public int getHp(){
        return Hp;
    }
}
