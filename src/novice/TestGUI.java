
package novice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestGUI extends JFrame  {
    private int pressCount = 1;
    
    private JTextField jtf;   
    public TestGUI() {      
        super( "HuterGame" );
         Container c = getContentPane();     
        c.setLayout( new FlowLayout() );
       JLabel jl = new JLabel("Enter your name:");
       jtf  = new JTextField(25);   
       c.add(jl);
       c.add(jtf);
       jtf.addActionListener( new ActionListener() {
           public void actionPerformed(ActionEvent e){
               System.out.println("You entered " +			
                       e.getActionCommand() );	       
               jtf.setText("");
           }
       });
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       pack();
       setVisible( true);   
    }     

    
 
}
