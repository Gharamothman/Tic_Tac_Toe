import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Interface extends JFrame {
    BufferedImage image;
   
    public Interface() throws HeadlessException {
    {
     

       nnn. playSound("tour1.wav");
            try {
                this.image = ImageIO.read(new File("Interface.PNG"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ImageIcon key = new ImageIcon("show.PNG");
            setIconImage(key.getImage());
            setTitle("interface");
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 520);
        setLocation(450, 150);
            setLocationRelativeTo(null);
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (image != null) {
                        int width = getWidth();
                        int height = getHeight();
                        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                        g.drawImage(scaledImage, 0, 0, null);
                    }
                }
            };
            panel.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                      dispose();
                      new Option();

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
            getContentPane().setBackground(new Color(0x08090e));
            getContentPane().add(panel);
        }}}
    // public void playSound(String filePath) {
    //     try {
    //         File audioFile = new File(filePath);
    //         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
    //       final  Clip clip = AudioSystem.getClip();
    //         clip.open(audioInputStream);
    //         clip.start();
    //         clip.loop(100000000);
    //     } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
    //         e.printStackTrace();
    //     }

    // }}

