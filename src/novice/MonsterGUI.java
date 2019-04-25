
package novice;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MonsterGUI {
    private JPanel MainGui;
    private JList MonsList;
    private JButton attack;
    private JButton skillass1;
    private JButton skillass2;
    private JButton skillDualSw1;
    private JButton skillDualSw2;
    private JLabel Monsname;
    private JLabel Monslevel;
    private JLabel MonsHp;
    private Novice novice;
    private ArrayList<Monster> monslist = new ArrayList<Monster>();
    private String[] monster_list;
    public MonsterGUI(Novice nv){
        MainGui = new JPanel();
        MonsList = new JList<>();
        attack = new JButton("Attack!!!");
        skillass1 = new JButton("Venom Knife");
        skillass2 = new JButton("Sonic Blow");
        skillDualSw1 = new JButton("Double Blade Force");
        skillDualSw2 = new JButton("Execution Slash");
        Monsname = new JLabel();
        Monslevel = new JLabel();
        MonsHp = new JLabel();
        novice = new Novice();
        novice = nv;
        MonsList.setFont(new java.awt.Font("Sylfaen", 0, 18));
        
        Monster Poring = new Monster("Poring",1,100);
        Monster Lunatic = new Monster("Lunatic",2,130);
        Monster Tarou= new Monster("Tarou",3,150);
        Monster ThiefBug= new Monster("Thief Bug",2,120);
        Monster Mandragora= new Monster("Mandragora",5,350);
        Monster Hydra= new Monster("Hydra",4,250);
        Monster DesertWolf= new Monster("Desert Wolf",8,640);
        Monster SoilderSkeleton= new Monster("Soilder Skeleton",7,500);
        Monster Goblin= new Monster("Goblin",9,720);
        Monster Hornet = new Monster("Hornet",6,400);
        Monster Manblatt = new Monster("Manblatt",10,800);  
        
        monslist.add(Poring);
        monslist.add(Lunatic);
        monslist.add(Tarou);
        monslist.add(ThiefBug);
        monslist.add(Mandragora);
        monslist.add(Hydra);
        monslist.add(DesertWolf);
        monslist.add(SoilderSkeleton);
        monslist.add(Goblin);
        monslist.add(Hornet);
        monslist.add(Manblatt);
        monster_list = new String[monslist.size()];
        for(int i = 0 ; i < monslist.size(); i++){
            if(monslist.get(i) != null) {
                monster_list[i] = monslist.get(i).getNameMons();
            }
        }
        
        MonsList.setListData(monster_list);
        
        MonsList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String search = (String) MonsList.getSelectedValue();
                for(Monster d : monslist){
                    if(d.getNameMons() != null && d.getNameMons().contains(search)){
                        Monsname.setText("Name : "+d.getNameMons());
                        Monslevel.setText("Level : "+Integer.toString(d.getLevel()));
                        MonsHp.setText("Hp : "+Integer.toString(d.getHp()));
                    }

                }
            }

            
        });
            
        attack.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String p = (String) MonsList.getSelectedValue();
                    if(p != null){
                    novice.fight_monster();
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose(); }  
                    else{
                         JOptionPane.showMessageDialog(null, "Choose  Monster", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
        skillass1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String p = (String) MonsList.getSelectedValue();
                    if(p != null){
                    novice.skill_VenomKnife();
                    JOptionPane.showMessageDialog(null, "Use a knife to attack the enemy poisoning Poisoned by the enemy to inflict a 100% increase.", "VenomKnife Skill", JOptionPane.INFORMATION_MESSAGE);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();}
                    else{
                         JOptionPane.showMessageDialog(null, "Choose  Monster", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
        skillass2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String p = (String) MonsList.getSelectedValue();
                    if(p != null){
                    novice.skill_SonicBlow();
                    JOptionPane.showMessageDialog(null, "Attack the enemy only has a 12% chance to make the target Stun.", 
                            "SonicBlow Skill", JOptionPane.INFORMATION_MESSAGE);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();}
                    else{
                         JOptionPane.showMessageDialog(null, "Choose  Monster", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
        skillDualSw1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String p = (String) MonsList.getSelectedValue();
                    if(p != null){
                    novice.skill_DoubleBladeForce();
                    JOptionPane.showMessageDialog(null, "Dual Sword will have the chance to reduce the target's physical defense by 50% at level 6 will increase 10% chance of penetrating enemy armor 1.5% for 4 seconds.", 
                            "Double Blade Force Skill", JOptionPane.INFORMATION_MESSAGE);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();}
                    else{
                         JOptionPane.showMessageDialog(null, "Choose  Monster", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
        skillDualSw2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     String p = (String) MonsList.getSelectedValue();
                    if(p != null){
                    novice.skill_ExecutionSlash();
                    JOptionPane.showMessageDialog(null, "The enemy attacked fiercely And to attack it the next time up to 100% (Buffett is 10 seconds) if the enemy HP is less than 30% and the skill up to 100%.", 
                            "Execution Slash Skill", JOptionPane.INFORMATION_MESSAGE);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();}
                    else{
                         JOptionPane.showMessageDialog(null, "Choose  Monster", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
        MainGui.setLayout(new GridLayout(1,3,10,30));
        MainGui.add(MonsList);
        MainGui.add(Monsname);
        MainGui.add(Monslevel);
        MainGui.add(MonsHp);
        MainGui.add(attack);
        if("Assassin".equals(novice.Classnv)){
        MainGui.add(skillass1);
        MainGui.add(skillass2);
        }
        if("DualSword".equals(novice.Classnv)){
        MainGui.add(skillDualSw1);
        MainGui.add(skillDualSw2);
        }
        
    }
    
    public void run(MonsterGUI mg){
        JFrame frame = new JFrame("Fight Monster");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,400);
        frame.setContentPane(mg.MainGui);
        frame.setResizable(false);
        frame.setVisible(true);
         
    }
    
    
    
   
    
}
