package novice;
import java.util.*;
import java.io.*;



public class Hutergame {
   public static void main(String[] args) {
        Novice hutergame = new Novice ();
        Scanner input = new Scanner(System.in);
        int select;
        
        System.out.println("Welcom to Hutergame");
        System.out.print("Enter your name :");
        hutergame.name = input.nextLine();
        hutergame.showinfo();
        while(true){
           System.out.println("======================================");
           System.out.println("             Menu");
           System.out.println("1) fight Monster  2) Inventory");
           System.out.println("3) Shop           4) Status");
            System.out.println("======================================");
           System.out.println("Disconnect [0]");
           System.out.println("======================================");
           System.out.print("Your select -> ");
           select = input.nextInt();
           if( select == 1){
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

   
