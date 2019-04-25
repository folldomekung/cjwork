
package novice;

import java.util.*;
import java.io.*;

public class ItemShop {
    public int buy ;
    public int no_gold = 0;

public void Shop(Novice buyitem){
         Scanner input = new Scanner(System.in);
        do{ 
         System.out.println("======================================");
         System.out.println("          Welcome to Items Shop");
         System.out.println("======================================");
         System.out.println("What do you buy ?");
         System.out.println("Hp potion price -> 10 gold/x1  (press -> '1')");
         System.out.println("GoldSword price -> 500 gold/x1  (press -> '2')");
         System.out.println("Armor dragon price -> 300 gold/x1 (press -> '3')");
         System.out.print("You want to buy?(press -> '0' to back menu) press ->  ");
         buy = input.nextInt();
         if(buy == 1 ){
             if(buyitem.Bag.gold >= 10){
                 buyitem.Bag.get_item(buyitem.Item);
                 if( buyitem.Bag.fullbag == 1){
                      break;
                 }
                 else{
                 buyitem.Bag.gold = buyitem.Bag.gold - 10;
                 buyitem.Bag.Hp_potion = buyitem.Bag.Hp_potion + 1;
                 System.out.println("Item to get your Inventory");
                 System.out.println("Thank you!");
                 }
             }
             else{
                 no_gold = 1;
             }
         }
         else if(buy == 2){
             if(buyitem.Bag.gold >= 500){
                 buyitem.Bag.gold = buyitem.Bag.gold - 500;
                 buyitem.Bag.Sword = buyitem.Bag.Sword + 1;
                 System.out.println("Item to get your Inventory");
                 System.out.println("Thank you!");
             }
             else{
                 no_gold = 1;
             }
         }
         else if(buy == 3){
             if(buyitem.Bag.gold >= 300){
                 buyitem.Bag.gold = buyitem.Bag.gold - 500;
                 buyitem.Bag.Armor = buyitem.Bag.Armor + 1;
                 System.out.println("Item to get your Inventory");
                 System.out.println("Thank you!");
             }
             else{
                 no_gold = 1;
             }
         }
         else{
             System.out.println("Your select is not command");
         }
        if( no_gold == 1){
            System.out.println("-------------------------------------");
            System.out.println("Not Enough Gold!!!");
            System.out.println("-------------------------------------");
        }
         
         System.out.println(" See you Later...");
    }while(buy != 0);
}
}