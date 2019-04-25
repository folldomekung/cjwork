
package novice;


public class Potion extends Item{
    
    public Potion(){
        
    }
    
    public void this_itemPotion(String name){
       if( name .equals("Hp potion")){
           System.out.println("This is a potion");
           
       }
       else if(name.equals("Sp potion")){
           System.out.println("");
       }
    }
    
    
}
