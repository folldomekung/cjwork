
package novice;

import java.util.*;


public class DualSword extends Novice{
    
    
    public void skill_VorpalStrike (Novice novice){
        novice.Exp = novice.Exp +20;
        novice.Sp = novice.Sp - 10;
        novice.Hp = novice.Hp - 5;
        System.out.println("Vorpal Strike  Dammm!!!!");
    }
    
    public void skill_StarburstSword(Novice novice){
        novice.Exp = novice.Exp +60;
        novice.Sp = novice.Sp - 20;
        novice.Hp = novice.Hp - 15;
        System.out.println("Starburst Sword!!!");
    }
    
    
    public void fight_mons(Novice novice){
        int choose_skill;
        Scanner input = new Scanner (System.in);
        System.out.println("======================================");
        System.out.println("        Fight Monster");
        System.out.println("======================================");
        System.out.println("[1]Vorpal Strike         [2]Starburst Sword ");
        System.out.print("You use skill -> ");
        choose_skill = input.nextInt();
        if (choose_skill == 1){
            skill_VorpalStrike (novice);
        }
        else if(choose_skill == 2){
            skill_StarburstSword(novice);
        }
    }
}
