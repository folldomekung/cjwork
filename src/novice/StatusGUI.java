
package novice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StatusGUI {
    private JPanel MainGui;
    private JLabel Status;
    private JLabel Level;
    private JLabel Hp;
    private JLabel Sp;
    private JLabel Exp;
    private JLabel Class;
    private JLabel Killmons;
    private JLabel Town;
    private Novice novice;
    private String nameTown="";
    public StatusGUI(Novice nv,String nametown){
        MainGui = new JPanel();
        Status = new JLabel();
        Level = new JLabel();
        Hp = new JLabel();
        Sp = new JLabel();
        Exp = new JLabel();
        Class = new JLabel();
        Killmons = new JLabel();
        Town = new JLabel();
        novice = new Novice();
        novice = nv;
        nameTown=nametown;
        Status.setFont(new Font("Niagara Solid", 0, 36)); 
        Status.setText("Status ");
        Status.setHorizontalAlignment(SwingConstants.CENTER);
        Status.setVerticalAlignment(SwingConstants.CENTER);
        Level.setFont(new Font("Niagara Solid", 0, 24)); 
        Level.setText("Level : "+novice.level);
        Level.setHorizontalAlignment(SwingConstants.CENTER);
        Level.setVerticalAlignment(SwingConstants.CENTER);
        Hp.setFont(new Font("Niagara Solid", 0, 24));
        Hp.setText("Hp : " + novice.Hp + " / " + novice.Hp_max);
        Hp.setHorizontalAlignment(SwingConstants.CENTER);
        Hp.setVerticalAlignment(SwingConstants.CENTER);
        Sp.setFont(new Font("Niagara Solid", 0, 24));
        Sp.setText("Sp : " + novice.Sp + " / " + novice.Sp_max);
        Sp.setHorizontalAlignment(SwingConstants.CENTER);
        Sp.setVerticalAlignment(SwingConstants.CENTER);
        Exp.setFont(new Font("Niagara Solid", 0, 24));
        Exp.setText("Exp : " + novice.Exp + " / " + novice.Exp_max);
        Exp.setHorizontalAlignment(SwingConstants.CENTER);
        Exp.setVerticalAlignment(SwingConstants.CENTER);
        Class.setFont(new Font("Niagara Solid", 0, 24));
        Class.setText("Class : " + novice.Classnv );
        Class.setHorizontalAlignment(SwingConstants.CENTER);
        Class.setVerticalAlignment(SwingConstants.CENTER);
        Killmons.setFont(new Font("Niagara Solid", 0, 24));
        Killmons.setText("Kill Monster : " + novice.killmons );
        Killmons.setHorizontalAlignment(SwingConstants.CENTER);
        Killmons.setVerticalAlignment(SwingConstants.CENTER);
        Town.setFont(new Font("Niagara Solid", 0, 24));
        Town.setText("Town : " + nameTown );
        Town.setHorizontalAlignment(SwingConstants.CENTER);
        Town.setVerticalAlignment(SwingConstants.CENTER);
        MainGui.setLayout(new GridLayout(8,1,10,20));
        MainGui.add(Status);
        MainGui.add(Level);
        MainGui.add(Hp);
        //when level >= 2 Sp JLabel will increase
        if(novice.level >=2 ){
        MainGui.add(Sp);
        }
        MainGui.add(Exp);
        //when level >= 2 class JLabel will increase
        if(novice.level >= 2){
            MainGui.add(Class);
        }
        MainGui.add(Killmons);
        MainGui.add(Town);
        
    }
    
    
    
    
    public void run(StatusGUI sg){
        JFrame frame = new JFrame("Status");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        frame.setContentPane(sg.MainGui);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
        
    }
    
}
