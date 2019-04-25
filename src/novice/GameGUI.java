
package novice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GameGUI {
    private JPanel MainGui;
    private JPanel jp1;
    private JPanel jp2;
    private JPanel jp3;
    private JPanel jp4;
    private JPanel jp5;
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
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        jp5 = new JPanel();
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
        Menu.setHorizontalAlignment(SwingConstants.CENTER);
        Menu.setVerticalAlignment(SwingConstants.CENTER);
        fight.setText("Fight Monster");
        status.setText("Status");
        job.setText("Class");
        potion.setText("Use Hp potion");
        Sppotion.setText("Use Sp potion");
        MainGui.setLayout(new GridLayout(6,1,10,25));
        jp1.add(fight);
        jp2.add(status);
        jp3.add(job);
        jp4.add(potion);
        jp5.add(Sppotion);
        MainGui.add(Menu);
        MainGui.add(jp1);
        MainGui.add(jp2);
        MainGui.add(jp3);
        MainGui.add(jp4);
        MainGui.add(jp5);
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
