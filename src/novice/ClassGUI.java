
package novice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClassGUI {
    private JPanel MainGui;
    private JButton Ass;
    private JLabel FigureAss;
    private JButton DualSw;
    private JLabel FigureDualSw;
    private Novice novice;
    private Image scaled;
    private Image scaled1;
    private ImageIcon scaleIcon;
    private ImageIcon scaleIcon1;
    public ClassGUI(Novice nv){
        //set scale image
        ImageIcon icon = new ImageIcon("src/novice/ass1.png");
        scaled = scaleImage(icon.getImage(),200,200);
        scaleIcon = new ImageIcon(scaled);
        ImageIcon icon1 = new ImageIcon("src/novice/DualSw.jpg");
        scaled1 = scaleImage(icon1.getImage(),200,200);
        scaleIcon1 = new ImageIcon(scaled1);
        
        MainGui = new JPanel();
        Ass = new JButton("Assassin");
        FigureAss = new JLabel(scaleIcon);
        DualSw = new JButton("DualSword");
        FigureDualSw = new JLabel(scaleIcon1);
        novice = nv;
        Ass.setFont(new Font("Niagara Solid", 0, 24)); 
        DualSw.setFont(new Font("Niagara Solid", 0, 24)); 
        MainGui.setLayout(new GridLayout(2,2,30,40));
        MainGui.add(Ass);
        MainGui.add(FigureAss);
        MainGui.add(DualSw);
        MainGui.add(FigureDualSw);
        Ass.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String classname = Ass.getText();
                    novice.Classnv=classname;
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();
                }
        });
        DualSw.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String classname = DualSw.getText();
                    novice.Classnv=classname;
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();
                }
        });
        
    }
    
    
    
    public void run(ClassGUI cg){
        JFrame frame = new JFrame("Class Skill");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600,400);
        frame.setContentPane(cg.MainGui);
        frame.setResizable(false);
        frame.setVisible(true);
         
    }
    public Image scaleImage(Image image,int w,int h){ //method set scale image
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }

    
}
