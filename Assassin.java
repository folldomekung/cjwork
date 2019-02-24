
package novice;
import java.util.*;
public class Assassin extends Novice {
   
    public Assassin(){
   
    }
    public void showskill_assassin(){
        System.out.println("BlackHead : skill increase attack");
        System.out.println("Black Hole : skill magic");
    }
    public void skill_BlackHead(Novice novice){
        novice.Exp = novice.Exp +20;
        novice.Sp = novice.Sp - 10;
        System.out.println("BlackHead  Dammm!");

    }
    public void skill_BlackHole(Novice novice){
        novice.Exp = novice.Exp +50;
        novice.Sp = novice.Sp - 20;
        novice.Hp = novice.Hp - 5;
        System.out.println("BlackHole");
    }
    public void fight_mons(Novice novice){
        int choose_skill;
        Scanner input = new Scanner (System.in);
        System.out.println("======================================");
        System.out.println("        Fight Monster");
        System.out.println("======================================");
        System.out.println("[1]BlackHead        [2]Black Hole");
        System.out.print("You use skill -> ");
        choose_skill = input.nextInt();
        if (choose_skill == 1){
            skill_BlackHead(novice);
        }
        else if(choose_skill == 2){
            skill_BlackHole(novice);
        }
    }
}
