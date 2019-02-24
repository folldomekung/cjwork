package novice;
import java.util.*;
import java.io.*;



public class Hutergame {
   public static void main(String[] args) {
        Novice hutergame = new Novice ();
        Assassin assassin = new Assassin();
        DualSword dualsword = new DualSword();
        
        Scanner input = new Scanner(System.in);
        int select;
        System.out.println("Welcom to Hutergame");
        System.out.print("Enter your name :");
        hutergame.name = input.nextLine();
        System.out.println("======================================");
        System.out.println("Beginner Novice");
        System.out.println("======================================");
        System.out.println("You get Hp potion x1");
        System.out.println("You get DarkSword x1");
        System.out.println("You get Armor x1");
        hutergame.Bag.get_item(hutergame.Item);
        hutergame.Bag.get_item(hutergame.Item);
        hutergame.Bag.get_item(hutergame.Item);
        hutergame.showinfo();
        while(true){
           System.out.println("======================================");
           System.out.println("             Menu");
           System.out.println("1) fight Monster  2) Inventory");
           System.out.println("3) Shop           4) Status");
           System.out.println("5) Class Skil     6) Check Your item  ");
           System.out.println("======================================");
           System.out.println("Disconnect [0]");
           System.out.println("======================================");
           System.out.print("Your select -> ");
           select = input.nextInt();
           if( select == 1){
              if(hutergame.Class_ass == 1){
                  assassin.fight_mons(hutergame);
              }
              else if(hutergame.Class_dual == 1){
                  dualsword.fight_mons(hutergame);
              }
              hutergame.fight_monster();
           }
           else if (select == 2){
               hutergame.Bag.show_items(hutergame);
           }
           else if (select == 4){
               hutergame.showinfo();
           }
           else if (select == 3){
               hutergame.shop.Shop(hutergame);
           }
           else if (select == 5){
               if(hutergame.level < 2){
                   System.out.println("Your Level must more than 2 before entering the class skill");
               }
               else{
                  hutergame.select_class();
               }
           }
           else if(select == 6){
               hutergame.Item.this_item();
           }
           else if (select == 0){
               System.out.println("======================================");
               System.out.println("Disconnect........");
               break;
           }
           else{
               System.out.println("Your select is not command");
           }
           if(hutergame.Hp <= 0){
               break;
           }
      
        }
        
    }
}

   
