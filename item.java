package novice;

public class item {
   
   public String name_item;
   public int hp_potion;
  
   public item(){
   
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

}
