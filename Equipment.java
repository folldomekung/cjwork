
package novice;


public class Equipment extends Item {
    
    public Equipment (){
        
    }
    public void this_itemEq(String name){
       if( name .equals("Sword")){
           System.out.println("This is a Equipment");
       }
       else if(name .equals("Armor")){
           System.out.println("This is aEquipment");
       }
    }

    
}
