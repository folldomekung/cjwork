
package novice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GameGUI {
    private JPanel MainGui;
    private JLabel Menu;
    private JButton fight;
    private JButton status;
    private JButton job;
    private JButton potion;
    private JButton Sppotion;
    private String town="";
    private Novice novice;
    public GameGUI(String nametown){
        MainGui = new JPanel();
        Menu = new JLabel();
        fight = new JButton();
        status = new JButton();
        job = new JButton();
        potion = new JButton();
        Sppotion = new JButton();
        novice = new Novice();
        town=nametown;
        Menu.setFont(new Font("Niagara Solid", 0, 36)); 
        Menu.setText("Menu");
        fight.setText("Fight Monster");
        status.setText("Status");
        job.setText("Class");
        potion.setText("Use Hp potion");
        Sppotion.setText("Use Sp potion");
        MainGui.setLayout(new GridLayout(6,1,10,25));
        MainGui.add(Menu);
        MainGui.add(fight);
        MainGui.add(status);
        MainGui.add(job);
        MainGui.add(potion);
        MainGui.add(Sppotion);
       status.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    StatusGUI sg = new StatusGUI(novice,town);
                    sg.run(sg); 
                }
    });
       fight.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    MonsterGUI mg = new MonsterGUI(novice);
                    mg.run(mg);
                }
       });
       job.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(novice.level>=2){
                        ClassGUI cg = new ClassGUI(novice);
                        cg.run(cg);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Your Level must more than 2 ", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
       });
       potion.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    novice.Item.hp_potion(novice);
                    
                }
       });
       Sppotion.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                if(novice.level>=2){
                        novice.Item.sp_potion(novice);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Your have not Sp ", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
       });         
                
    
    
    }
    
    
    public void run(GameGUI gg){
        JFrame frame = new JFrame("Hutergame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setContentPane(gg.MainGui);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
        
    }
    
}
