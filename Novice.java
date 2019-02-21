

package novice;

import java.util.Scanner;

/* Assignment: Novice class  
   Each methods
    hp_potion : Use healing potion
    show_hp : Show HP
    show_exp : Show exp
    show_level : Show level
    loss_hp : loss HP
    get_exp : Attack a monster to get exprience points
    get_level : get level if level = 100 display level UP
   Chutiwat Jiantiw 
   ID : 6010110088 
   Date 31/01/2019

*/


public class Novice {
    public int Hp;
    public int Exp;
    public int level;
    public Novice( ){
      Hp=100;
      Exp=0;
      level=1;
    }
    public  int hp_potion(int hpnow){//Use healing potion
        if(hpnow == 100){
            System.out.println("Full HP!!");
            return Hp;
        }
        else{
            Hp = Hp+10;
        return Hp;}
    }
    public int show_hp(){
        return Hp;//Show HP
    }
    public int show_exp(){
        return Exp;//Show Exp
    }
    public int show_level(){
        return level;//Show level
    }
    public void loss_hp(){
        Hp = Hp-10;//loss HP
    }
    public void get_exp(){
        Exp = Exp+20;//Attack a monster to get exprience points
    }
    public int get_level(int exp_now){//get level if level = 100 display level UP
        if(exp_now == 100){
            System.out.println("Level UP!!");
            level = level + 1;
            Exp = Exp - 100;
          return level;
        }
        else{
          get_exp();
          return Exp;
        }
    }
   
   
    
}
