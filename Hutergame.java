package novice;
import java.util.*;
import java.io.*;

import novice.Novice;
import novice.bag;
import novice.item;

public class Hutergame {
   public static void main(String[] args) {
        Novice status = new Novice();
        item s_item = new item();
        bag b_bag = new bag(3);
        int select;
        int buy;
        Scanner input = new Scanner(System.in);
        System.out.println("Start Novice!!");
        System.out.println(" Level: " + status.show_level());
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("Monster attack you!");
        System.out.println("Loss 10 HP");
        status.loss_hp();
        System.out.println(" HP: " + status.show_hp());
        System.out.println("fighting monster");
        System.out.println("EXP UP!!");
        status.get_level(status.show_exp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("Show status");
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("You use Hp potion");
        status.hp_potion(status.show_hp());
        System.out.println(" HP: " + status.show_hp());
        System.out.println("You use Hp potion again");
        status.hp_potion(status.show_hp());
        System.out.println("fighting monster");
        System.out.println("EXP UP!!");
        status.get_level(status.show_exp());
        System.out.println(" Level: " + status.show_level());
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("EXP UP!!");
        status.get_level(status.show_exp());
        System.out.println(" Level: " + status.show_level());
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("EXP UP!!");
        status.get_level(status.show_exp());
        System.out.println(" Level: " + status.show_level());
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("EXP UP!!");
        status.get_level(status.show_exp());
        System.out.println(" Level: " + status.show_level());
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("EXP UP!!");
        status.get_level(status.show_exp());
        System.out.println(" Level: " + status.show_level());
        System.out.println(" HP: " + status.show_hp());
        System.out.println(" Exp: " + status.show_exp());
        System.out.println("-------------------------------------");
        System.out.println("Check your Inventory");
        System.out.println("Description Item Press -> '1'");
        System.out.println("List Item Press -> '2'");
        System.out.print("Your select - >");
        select = input.nextInt();
        if(select == 1){
            s_item.describe_items();}
        else if (select == 2){
            b_bag.show_items();}
         System.out.println("             Welcome to Items Shop");
         System.out.println("What do you buy ?");
         System.out.println("Hp potion price -> 10 gold/x1  (press -> '1')");
         System.out.println("GoldSword price -> 500 gold/x1  (press -> '2')");
         System.out.println("Armor dragon price -> 300 gold/x1 (press -> '3')");
         System.out.print("You want to buy? press ->  ");
         buy = input.nextInt();
       switch (buy) {
           case 1:
               if(b_bag.loss_gold(10) != 100){
                   b_bag.add_hp(1);}
               b_bag.get_item(s_item);
               break;
           case 2:
               if(b_bag.loss_gold(500) != 100){
                   b_bag.add_sword(1);}
               b_bag.get_item(s_item);
               break;
           case 3:
               if(b_bag.loss_gold(300) !=100){
                   b_bag.add_armor(1);}
               b_bag.get_item(s_item);
               break;
           default:
               break;
       }
         b_bag.show_items();
         System.out.println(" Thank you!");
        
         
        
       }    
   
   
}
