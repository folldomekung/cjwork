
package novice;
import java.util.*;

public class Novice {
    public int Hp;
    public int Sp;
    public int Exp;
    public int level;
    public int Hp_max;
    public int Exp_max;
    public int Sp_max;
    public int killmons;
    public int Class_ass;
    public int Class_dual;
    public String Classnv;
    public String name;

    Bag Bag = new Bag(5);
    Item Item = new Item();
    ItemShop shop = new ItemShop();
    
    
    public Novice( ){
      Hp=100;
      Hp_max=100;
      Sp =50;
      Sp_max=50;
      Exp=0;
      level=1;
      Exp_max=100;
      Class_ass=0;
      Class_dual=0;
      killmons=0;
      Classnv="";
    }
    
    public void showinfo(){
        System.out.println("-------------------------------------");
        System.out.println("                Status");
        System.out.println("-------------------------------------");
        System.out.println("Name : " +name);
        if(level >= 2){
            if(Class_ass == 1){
                System.out.println("Class : Assassin");
            }
            else if(Class_dual == 1){
                System.out.println("Class : DualSword");
            }
            else{
            System.out.println("Class : novice //Beginner class" );
            }
        }
        System.out.println("Level : " +level);
        System.out.println("Hp : " + Hp + "/" + Hp_max);
        if(level >= 2){
        System.out.println("Sp :" + Sp + "/" + Sp_max);
        }
        System.out.println("Exp : " + Exp + "/" + Exp_max);
        System.out.println("-------------------------------------");
    }
    
   public void fight_monster(){
       Hp = Hp - (10*level);
       Exp = Exp +(40*level);
       Bag.gold = Bag.gold + 10;
       killmons = killmons +1;
       if(Hp <= 0){
           System.out.println("Your Died......");
           System.out.println("GameOver");
       }
       if(Exp >= Exp_max){
            System.out.println("Level UP!!");
            level = level + 1;
            Exp = Exp - Exp_max;
            Hp_max = Hp_max + 50;
            Exp_max = Exp_max + 100;
            Hp = Hp_max;
            if(level > 2){
            Sp_max = Sp_max + 30 ;
            Sp = Sp_max;
            }
        }
       
   }
   public void select_class(){
       Scanner input = new Scanner(System.in);
       int choose;
       System.out.println("-------------------------------------");
       System.out.println("             Class skill");
       System.out.println("-------------------------------------");
       System.out.println("[1]Assassin              [2]DualSword");
       System.out.print("You choose -> ");
       choose = input.nextInt();
       if(choose == 1){
           Class_ass=1;
       }
       else if(choose == 2){
           Class_dual=1;
       }
       
   }
    public void skill_VenomKnife(){
        Exp = Exp +20;
        Sp = Sp - 10;
        killmons = killmons +1;
        System.out.println("VenomKnife Dammm!");

    }
     public void skill_SonicBlow(){
        Exp = Exp +50;
        Sp = Sp - 20;
        killmons = killmons +1;
        Hp = Hp - 5;
        System.out.println("Sonic Blow");
    }
    public void skill_DoubleBladeForce (){
        Exp = Exp +20;
        Sp = Sp - 10;
        killmons = killmons +1;
        Hp = Hp - 5;
        System.out.println("Double Blade Force  Dammm!!!!");
    }
     public void skill_ExecutionSlash(){
        Exp = Exp +60;
        Sp = Sp - 20;
        killmons = killmons +1;
        Hp = Hp - 15;
        System.out.println("Execution Slash!!!");
    }
    
}
