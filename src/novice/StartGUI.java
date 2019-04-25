
package novice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartGUI  {
    private JPanel MainGui;
    private JLabel Title;
    private JButton startButton;
    private JButton disButton;
    private JComboBox Town;
    public StartGUI(){
        MainGui = new JPanel();
        Title = new JLabel();
        startButton = new JButton();
        disButton = new JButton();
        Town = new JComboBox<>();
        Title.setFont(new Font("Niagara Solid", 0, 36)); 
        Title.setText("Welcom to Hutergame");
        startButton.setText("Start Game");
        disButton.setText("Disconnect");
        Town.setModel(new DefaultComboBoxModel<>(new String[]{"Prontera","Astana","Libreville"}));
        Town.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        MainGui.setLayout(new GridLayout(4,1,10,30));
        MainGui.add(Title);
        MainGui.add(startButton);
        MainGui.add(disButton);
        MainGui.add(Town);
        startButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String value = (String)Town.getSelectedItem();
                    GameGUI gg = new GameGUI(value);
                    gg.run(gg);
                    JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                    current.dispose();
                }
        
    });
        disButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                StartGUI a = new StartGUI();
                a.run(a);
                JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
                current.dispose();
                
                }
        });
          
    }
    
    public void run(StartGUI sg){
        JFrame frame = new JFrame("Hutergame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setContentPane(sg.MainGui);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
        
    }
    
}
