package novice;
import java.util.ArrayList;
import novice.item;

public class bag {
    public ArrayList<item> bags;
    public int gold;
    public int Hp_potion;
    public int Sword;
    public int Armor;
    public int limititem;
    public bag(int limitbag){
        bags = new ArrayList<>();
        Hp_potion = 1;
        Sword = 1;
        Armor = 1;
        gold = 100;
        limititem=limitbag;
    }
    public void get_item(item newitem){
        if(bags.size() <=limititem ){
            bags.add(newitem);
            System.out.println("Success get the item");}
        else{
            System.out.println("Inventory full");
        }
    }
   public void show_items(){
    System.out.println("-------------------------------------");
    System.out.println("              Inventory");
    System.out.println("-------------------------------------");
    System.out.println("Hp potion >> x"+ Hp_potion);
    System.out.println("DarkSword >> x"+ Sword);
    System.out.println("Armor >> x"+ Armor);
    System.out.println("-------------------------------------");
    System.out.println("Gold : $"+gold);
    System.out.println("-------------------------------------");
}
   public int loss_gold(int price_item){
       if(gold >= price_item){
           gold=gold-price_item;
           System.out.println("Item to get your Inventory");
        return gold;}
       else{
        System.out.println("Not enough gold!");
        return gold;}
   }
   public int add_hp(int addhp){
       Hp_potion=Hp_potion+addhp;
       return Hp_potion;
   }
   public int add_sword(int addsword){
       Sword=Sword+addsword;
       return Sword;
   }
   public int add_armor(int addarmor){
       Armor=Armor+addarmor;
       return Armor;
   }
   
}
