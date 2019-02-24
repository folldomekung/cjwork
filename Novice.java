
package novice;


public class Novice {
    public int Hp;
    public int Exp;
    public int level;
    public int Hp_max;
    public int Exp_max;
    public String name;
    
    bag Bag = new bag(1);
    item Item = new item();
    ItemShop shop = new ItemShop();
    
    public Novice( ){
      Hp=100;
      Hp_max=100;
      Exp=0;
      level=1;
      Exp_max=100;
    }
    
    public void showinfo(){
        System.out.println("-------------------------------------");
        System.out.println("                Status");
        System.out.println("-------------------------------------");
        System.out.println("Name : " +name);
        System.out.println("Level : " +level);
        System.out.println("Hp : " + Hp + "/" + Hp_max);
        System.out.println("Exp : " + Exp + "/" + Exp_max);
        System.out.println("-------------------------------------");
    }
    
   public void fight_monster(){
       Hp = Hp - (10*level);
       Exp = Exp +(40*level);
       Bag.gold = Bag.gold + 10;
       if(Hp <= 0){
           System.out.println("Your Died......");
           System.out.println("GameOver");
       }
       if(Exp >= Exp_max){
            System.out.println("Level UP!!");
            level = level + 1;
            Exp = Exp - Exp_max;
            Hp_max = Hp_max + 50;
            Exp_max = Exp_max + 100;
            Hp = Hp_max;
        }
       
   }
    
    
}
