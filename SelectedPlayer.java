import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SelectedPlayer extends JFrame {

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField t1;
    JTextField t2;
    JButton button;
    JButton button1;
    JButton button2;
    static String name1;
    static String name2;
    Players players;

    public SelectedPlayer() throws HeadlessException {
        setSize(520, 520);
        setTitle("Information");
        setLocation(450, 150);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        JButton button = new JButton();
        button.setText(" >> ");
        button.setFocusable(false);
     
        button.setBackground(new Color(0x010101));
        button.setBounds(445, 30, 40, 25);
        button.setForeground(new Color(0x5a0202));
        button.setBorder(BorderFactory.createLineBorder(new Color(0x010101), 5));
         add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
                new Option();
            }

        });
        label1 = new JLabel("Enter the Information ");
        label1.setVisible(true);
        label1.setBounds(140, 10, 300, 100);
        add(label1);
        label1.setForeground(new Color(0x5a0202));
        Font font1 = new Font("Monotype Corsive", Font.ROMAN_BASELINE, 20);

        label1.setFont(font1);

        /// about label user name
        label2 = new JLabel("Name player1 : ");

        label2.setVisible(true);
        label2.setBounds(10, 80, 100, 80);
        add(label2);
        label2.setForeground(new Color(0x5a0202));
        Font font2 = new Font("Monotype Corsive", Font.ITALIC, 14);
        label2.setFont(font2);
        t1 = new JTextField();
        t1.setBorder(BorderFactory.createMatteBorder(3, 1, 5, 1, Color.BLACK));
        t1.setBounds(20, 150, 150, 20);
        Font fonttext = new Font("Arial", Font.PLAIN, 10);
        t1.setForeground(Color.white);
        t1.setFont(fonttext);
        t1.setBackground(new Color(0x5a0202));
        t1.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 1));
        add(t1);

        t1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
            }
        });
        // about label password
        label3 = new JLabel("Name player2:  ");
        label3.setBounds(250, 80, 100, 80);
        add(label3);
        label3.setForeground(new Color(0x5a0202));
        Font font3 = new Font("Monotype Corsive", Font.ITALIC, 14);
        label3.setFont(font3);
        t2 = new JTextField();
        t2.setBounds(250, 150, 150, 20);
        Font fontpass = new Font("Arial", Font.PLAIN, 10);
        t2.setFont(fontpass);

        t2.setForeground(Color.white);
        t2.setBackground(new Color(0x5a0202));
        t2.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 1));
        add(t2);
        button = new JButton();
        button.setText("PLAY");
        button.setFocusable(false);
        button.setFont(font2);
        button.setBackground(new Color(0x5a0202));
        button.setBounds(70, 250, 350, 20);
        button.setForeground(Color.white);
        button.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 2));
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name1 = t1.getText();
                name2 = t2.getText();
            boolean found= false;
                // ArrayList<Players> playerss = Players.readUsersFromFile();
                //     for (Players player : playerss) {
                //         if (player.getPlayer1().equals(name1) &&player.getPlayer1().equals(name2)){
                //             System.out.println("yes");
                //         HumanPlayer.count1=player.cou1;
                //         HumanPlayer.count2=player.cou2;
                //         found=true;
                //         break;
                //     }
                //     else {
                //                  System.out.println("not");
                //         HumanPlayer.count1=0;
                //         HumanPlayer.count2=0;
                //     }
        
      
                // }
                dispose();
                new HumanPlayer();
                
            }
            
        });

        ImageIcon image2 = new ImageIcon("oo.JPG");
        JLabel l1 = new JLabel(image2);
        l1.setBounds(0, 0, 480, 500);
        add(l1);

        getContentPane().setBackground(new Color(0x010101));

    }

}
