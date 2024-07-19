
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Option extends JFrame{
    JPanel panel;

    public Option() {
//        playSound("tour.wav");
        setVisible(true);
        setSize(520, 520);
        setLocation(450, 150);
        setTitle("Main");
        setResizable(false);
        setLayout(null);
        ImageIcon image1 = new ImageIcon("imag.JPG");
        JLabel l = new JLabel(image1);
        l.setBounds(0, 0, 850, 800);
        add(l);
        JLabel l1 = new JLabel(image1);
        l1.setBounds(0, 0, 140, 140);
        add(l1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button = new JButton();
        button.setText(" ONE Player ");
        button.setFocusable(false);
        button.setFont(new Font("Monotype Corsive", Font.ROMAN_BASELINE, 20));
        button.setBackground(new Color(0x5a0202));
        button.setBounds(160, 130, 180, 80);
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 5));
       add(button);
      
       button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SelectedLevel();
            }
        });
        JButton button1 = new JButton();
        button1.setText(" TWO Player ");
        button1.setFocusable(false);
        button1.setFont(new Font("Monotype Corsive", Font.ROMAN_BASELINE, 20));
        button1.setBackground(new Color(0x5a0202));
        button1.setBounds(160, 215, 180, 80);
        button1.setForeground(Color.WHITE);
        button1.setBorder(BorderFactory.createLineBorder(new Color(0x5a0202), 5));
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SelectedPlayer();
            }
        });
        getContentPane().setBackground(new Color(0x08090e));
}
    private void playSound(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

}}
