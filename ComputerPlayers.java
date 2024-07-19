import javax.swing.*;
import javax.sound.sampled.*;
import javax.swing.border.Border;
import javax.swing.event.EventListenerList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class ComputerPlayers extends JFrame {
    private static int count1 = 0;
    private static int count2 = 0;
    private JButton textF;
    private JButton text;
    public static int consound = 0;
    Clip clip;
    static int ind;
    private static boolean PLAYER1 = true;
    JButton[][] b = new JButton[3][3];

    /**
     * 
     */
    public ComputerPlayers() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(520, 520);
        frame.setTitle("");
        frame.setLocation(450, 150);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font2 = new Font("", Font.BOLD, 13);

        JButton button = new JButton();
        button.setText(" >> ");
        button.setFocusable(false);
        button.setFont(font2);
        button.setBackground(new Color(0x08090e));
        button.setBounds(445, 30, 40, 25);
        button.setForeground(new Color(0x5a0202));
        button.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SelectedLevel();
            }

        });

        ImageIcon image2 = new ImageIcon("so2edit.PNG");
        JButton buttonsounde = new JButton();
        buttonsounde.setIcon(image2);
        buttonsounde.setFocusable(false);
        buttonsounde.setFont(font2);
        buttonsounde.setBackground(new Color(0x08090e));
        buttonsounde.setBounds(440, 50, 52, 50);
        buttonsounde.setForeground(new Color(0x5a0202));
        buttonsounde.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
        frame.add(buttonsounde);
        buttonsounde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (consound % 2 == 0) {
                    nnn.stopmusic();
                    ImageIcon image2 = new ImageIcon("so1edit.PNG");
                    buttonsounde.setIcon(image2);
                }

                else {
                    nnn.playSound("tour1.wav");
                    ImageIcon image2 = new ImageIcon("so2edit.PNG");
                    buttonsounde.setIcon(image2);
                }
                consound++;

            }
        });

        JButton textFieldname = new JButton("you ");
        Border emptyBorder = null;
        textFieldname.setBorder(emptyBorder);
        frame.add(textFieldname);
        textFieldname.setFont(font2);
        textFieldname.setForeground(new Color(0x08090e));
        textFieldname.setBounds(60, 30, 100, 25);
        textFieldname.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x5a0202)));
        textFieldname.setFocusable(false);
        textFieldname.setBackground(new Color(0x5a0202));
        textFieldname.setEnabled(false);

        ImageIcon image1 = new ImageIcon("com.JPG");
        JLabel l = new JLabel(image1);
        l.setBounds(0, 0, 700, 10);
        add(l);

        JButton textFielv = new JButton("    Vs     ");
        textFielv.setBorder(emptyBorder);
        frame.add(textFielv);
        textFielv.setFont(new Font("Monotype Corsive", Font.ITALIC, 20));
        textFielv.setForeground(new Color(0x08090e));
        textFielv.setBounds(190, 30, 100, 25);
        textFielv.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x5a0202)));
        textFielv.setFocusable(false);
        textFielv.setBackground(new Color(0x5a0202));
        // textFielv.setEnabled(false);

        JButton textField = new JButton("computer ");
        textField.setBorder(emptyBorder);
        frame.add(textField);
        textField.setFont(font2);
        textField.setForeground(new Color(0x08090e));
        textField.setBounds(320, 30, 100, 25);
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x5a0202)));
        textField.setFocusable(false);
        textField.setBackground(new Color(0x5a0202));
        textField.setEnabled(false);
        textF = new JButton("Points: " + count2);
        frame.add(textF);
        textF.setFont(font2);
        textF.setBounds(320, 60, 100, 25);
        textF.setForeground(new Color(0x08090e));
        textF.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x5a0202)));
        textF.setFocusable(false);
        textF.setBackground(new Color(0x5a0202));
        textF.setEnabled(false);
        text = new JButton("Points :" + count1);
        frame.add(text);
        text.setFont(font2);
        text.setBounds(60, 60, 100, 25);
        text.setForeground(new Color(0x5a0202));
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x5a0202)));
        text.setFocusable(false);
        text.setBackground(new Color(0x5a0202));
        text.setEnabled(false);

        int x = 120;
        int y = 140;
        b = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = new JButton();
                b[i][j].setFocusable(false);
                b[i][j].setFont(font2);
                b[i][j].setBackground(new Color(0x5a0202));
                b[i][j].setBounds(x, y, 80, 80);
                b[i][j].setForeground(Color.white);
                b[i][j].setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));

                int finalI = i;
                int finalJ = j;

                b[i][j].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        onButtonClick(finalI, finalJ);
                    }

                });
                frame.add(b[i][j]);
                x += 83;
            }
            y += 83;
            x = 120;
        }

        frame.getContentPane().setBackground(new Color(0x08090e));

    }

    private void onButtonClick(int i, int j) {

        if (PLAYER1 && b[i][j].isEnabled()) {
            b[i][j].setText("X");
            b[i][j].setForeground(Color.BLACK);
            b[i][j].setEnabled(false);

            if (checkForWin()) {
                playSoundwin("wins.wav");
                // JOptionPane.showMessageDialog(null, "you wins!");
                count1++;
                text.setText("Points: " + count1);
                startGame();
            } else if (isBoardFull()) {
                playSoundwin("tie.wav");
                JOptionPane.showMessageDialog(null, "It's a tie!");
                startGame();
            } else {
                PLAYER1 = false;
                computerMove(this);
            }
        }
    }

    void computerMove(ComputerPlayers computerPlayer) {
        int m = 0;
        int n = 0;
        boolean bre = false;
        for (int i = 0; i < 3; i++) {
            if (bre)
                break;
            for (int j = 0; j < 3; j++) {
                if (bre)
                    break;
                for (int k = 0; k < 3; k++) {
                    if (bre)
                        break;
                    for (int l = (i == k) ? j + 1 : 0; l < 3; l++) {
                        if (b[i][j].getText().equals(b[k][l].getText()) && b[k][l].getText()=="X" && b[i][j].getText()=="X") {
                            if (i == k) {
                                m = 3 - (l + j);
                                n = i;

                                bre = true;
                                break;

                            } else if (j == l) {
                                n = 3 - (k + i);
                                m = j;
                                bre = true;

                                break;
                            } else {
                                n = 3 - (k + i);
                                m = 3 - (l + j);
                                bre = true;

                                break;
                            }
                        }
                    }
                }
            }
        }

        if (b[n][m].isEnabled()) {
            b[n][m].setText("O");
            b[n][m].setEnabled(false);
            if (checkForWin()) {
                playSoundwin("Loser.MP3");
                JOptionPane.showMessageDialog(null, "you are losser!");
                count2++;
                textF.setText("Points: " + count2);
                startGame();
            } else if (isBoardFull()) {
                JOptionPane.showMessageDialog(null, "It's a tie!");
                startGame();
            } else {
                PLAYER1 = true;
            }

        } else {
            boolean brea=false;
            for (int index = 0; index < 3; index++) {
                if(brea) break;
                for (int k = 0; k < 3; k++) {
                    if (b[index][k].getText() == "") {
                        b[index][k].setText("O");
                        b[index][k].setEnabled(false);
                        if (checkForWin()) {
                            playSoundwin("Loser.MP3");
                            JOptionPane.showMessageDialog(null, "you are losser!");
                            count2++;
                            textF.setText("Points: " + count2);
                            startGame();
                        } else if (isBoardFull()) {
                            JOptionPane.showMessageDialog(null, "It's a tie!");
                            startGame();
                        } else {
                            PLAYER1 = true;
                        }
                        brea= true;
                        break;
                    }

                }
            }
        
        }
    }

    Boolean checkForWin() {
        for (int i = 0; i < 3; i++) {
            if (!b[i][0].getText().isEmpty() && b[i][0].getText().equals(b[i][1].getText())
                    && b[i][1].getText().equals(b[i][2].getText()))
                return true;

            if (!b[0][i].getText().isEmpty() && b[0][i].getText().equals(b[1][i].getText())
                    && b[1][i].getText().equals(b[2][i].getText()))
                return true;

            if (!b[0][0].getText().isEmpty() && b[0][0].getText().equals(b[1][1].getText())
                    && b[1][1].getText().equals(b[2][2].getText()))
                return true;

            if (!b[0][2].getText().isEmpty() && b[0][2].getText().equals(b[1][1].getText())
                    && b[1][1].getText().equals(b[2][0].getText()))
                return true;
        }

        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void startGame() {
        PLAYER1 = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j].setText("");
                b[i][j].setEnabled(true);
            }
        }
    }

    public void playSoundwin(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}