package novice;
import java.util.ArrayList;
import java.util.*;

public class Bag {
    public ArrayList<Item> bags;
    public int gold;
    public int Hp_potion;
    public int Sword;
    public int Armor;
    public int limititem;
    public int fullbag;
    public Bag(int limit_item){
        bags = new ArrayList<>();
        limititem = limit_item;
        Hp_potion = 1;
        Sword = 1;
        Armor = 1;
        gold = 100; 
        fullbag=0;
    }
    
    public void get_item(Item newitem){
        if(bags.size() < limititem ){
            bags.add(new Item());
            System.out.println("Bagsize : " + bags.size());
            System.out.println("Success get the item");}
        else{
            fullbag=1;
            System.out.println("Inventory full");
        }
    }
    
   public void show_items(Novice item){
    Scanner choose = new Scanner(System.in);
    int useitem;
    do{
    System.out.println("-------------------------------------");
    System.out.println("              Inventory");
    System.out.println("-------------------------------------");
    System.out.println("Hp potion >> x"+ Hp_potion );
    System.out.println("DarkSword >> x"+ Sword  );
    System.out.println("Armor >> x"+ Armor  );
    System.out.println("-------------------------------------");
    System.out.println("Gold : $"+gold);
    System.out.println("-------------------------------------");
    System.out.println("Use Hp potion [1] : Exit Inventory [0] ");
    System.out.print("Your press -> ");
    useitem = choose.nextInt();
    if( useitem == 1){
        item.Item.use_potion(item);
    }
    }while(useitem != 0);
   
   }
}