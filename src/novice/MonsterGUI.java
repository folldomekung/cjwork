
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
    private JPanel jp1;
    private JPanel jp2;
    private JPanel jp3;
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
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
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
        //MainGui.setLayout(new GridLayout(1,5,10,30));
        jp1.setLayout(new BoxLayout(jp1,BoxLayout.Y_AXIS));
        jp1.add(MonsList);
        jp2.setLayout(new GridLayout(3,1,10,25));
        jp2.add(attack);
        if("Assassin".equals(novice.Classnv)){
        jp2.add(skillass1);
        jp2.add(skillass2);
        }
        if("DualSword".equals(novice.Classnv)){
        jp2.add(skillDualSw1);
        jp2.add(skillDualSw2);
        }
       jp3.setLayout(new BoxLayout(jp3,BoxLayout.Y_AXIS));
       jp3.add(Monsname);
       jp3.add(Monslevel);
       jp3.add(MonsHp);
       MainGui.add(jp1,BorderLayout.WEST);
       MainGui.add(jp3,BorderLayout.CENTER);
       MainGui.add(jp2,BorderLayout.EAST);
       
        
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
