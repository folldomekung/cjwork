package novice;
import java.util.*;

public class Item {
   
   public String name_item;
   public int num_item;
  
   public Item(){
   
}
public void describe_items(){
    System.out.println("-------------------------------------");
    System.out.println("Description Item");
    System.out.println("-------------------------------------");
    System.out.println("Hp potion : increase HP");
    System.out.println("DarkSword : Attack 50 damage");
    System.out.println("Armor : protect your body");
}
public  int hp_potion(Novice hppotion){
        if(hppotion.Hp >= hppotion.Hp_max ){
            System.out.println("-------------------------------------");
            System.out.println("Full HP!!");
            System.out.println("-------------------------------------");
           return 1;
        }
        else{
            hppotion.Hp = hppotion.Hp+10;
            System.out.println("Hp 10++");
           return 0;
        }
    }
public void use_potion(Novice usehp){
    if(usehp.Bag.Hp_potion != 0){
        if(hp_potion(usehp)== 0){
            usehp.Bag.Hp_potion = usehp.Bag.Hp_potion - 1;
        }
    }
   else{
       System.out.println("You don't have Hp potion");
    }
    
}
public void this_item(){
    Scanner input = new Scanner(System.in);
    String name_item;
    Equipment eq = new Equipment();
    Potion potion = new Potion();
    System.out.println("What type of item is this? ");
    System.out.print("Check your Item ( 'Exit':go to back menu) : ");
    name_item = input.nextLine();
    eq.this_itemEq(name_item);
    potion.this_itemPotion(name_item);
}

}
