import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
public class SelectedLevel extends JFrame {
    SelectedLevel(){
        setSize(520, 520);
        setTitle("Level:");
        setLocation(450, 150);
        setResizable(false);
        setLayout(null);
        setVisible(true);
   
 JButton button = new JButton();
        button.setText("  Esay ");
        button.setFocusable(false);
        button.setFont(new Font("Monotype Corsive", Font.ROMAN_BASELINE, 20));
        button.setBackground(new Color(0x5a0202));
        button.setBounds(160, 140, 180, 60);
        button.setForeground(Color.white);
        button.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 5));
       add(button);
      
       button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ComputerPlayer();
            }
        });
        JButton button2 = new JButton();

        button2.setText(" >> ");
        button2.setFocusable(false);
   
        button2.setBackground(new Color(0x010101));
        button2.setBounds(445, 30, 40, 25);
        button2.setForeground(new Color (0x5a0202));
        button2.setBorder(BorderFactory.createLineBorder(new Color(0x010101), 5));
       add(button2);
       button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Option();
            }

        });

        JButton button1 = new JButton();
        button1.setText(" Excepte ");
        button1.setFocusable(false);
        button1.setFont(new Font("Monotype Corsive", Font.ROMAN_BASELINE, 20));
        button1.setBackground(new Color(0x5a0202));
        button1.setBounds(160, 210, 180, 60);
        button1.setForeground(Color.white);
        button1.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 5));
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ComputerPlayers();
            }
        });


        JButton button11 = new JButton();
        button11.setText(" Expert  ");
        button11.setFocusable(false);
        button11.setFont(new Font("Monotype Corsive", Font.ROMAN_BASELINE, 20));
        button11.setBackground(new Color(0x5a0202));
        button11.setBounds(160, 280, 180, 60);
        button11.setForeground(Color.white);
        button11.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 5));
        add(button11);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ComputerPlayersEx();
            }
        });

      



      ImageIcon image1 = new ImageIcon("ii.JPG");
        JLabel l = new JLabel(image1);
        l.setBounds(0, 0, 500, 500);
        add(l);
                getContentPane().setBackground(new Color(0x010101));

    }
}
