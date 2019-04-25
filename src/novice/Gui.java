
package novice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.PreferenceChangeEvent;

public class Gui{
    private JPanel MainGui;
    private JLabel lblChoose;
    private JButton btnPractice;
    private JButton btnPlay;
    public static JFrame frame;
    public JFrame practice;

    public Gui() {
        btnPractice.addActionListener(new ActionListenerImpl());
        btnPlay.addActionListener((ActionEvent e) -> {
            new CharacterListGui(1).load();
            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
            current.dispose();
        });
    }

    public void load(){
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(new Gui().MainGui);
        frame.pack();
        frame.setVisible(true);
    }

    //public static void main(String[] args) {
        //new Gui().load();

   // }

    private class ActionListenerImpl implements ActionListener {

        public ActionListenerImpl() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new CharacterListGui(0).load();
            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(MainGui);
            current.dispose();
        }
    }
}
