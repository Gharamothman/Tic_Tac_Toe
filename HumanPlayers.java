import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HumanPlayers extends JFrame {
    static int count1 = 0;
    static int count2 = 0;
    JButton textF;
    JButton text;
    boolean PLAYER1 = true;
    static JButton[][] b = new JButton[3][3];
    JFrame frame;

    public HumanPlayers() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(520, 520);
        frame.setTitle("Home");
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

                new Option();
            }

        });

        ImageIcon image2 = new ImageIcon("so2.PNG");
        JButton buttonsounde = new JButton();
        buttonsounde.setIcon(image2);
        buttonsounde.setFocusable(false);
        buttonsounde.setFont(font2);
        buttonsounde.setBackground(new Color(0x08090e));
        buttonsounde.setBounds(440, 60, 55, 55);
        buttonsounde.setForeground(new Color(0x08090e));
        buttonsounde.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
        frame.add(buttonsounde);
        buttonsounde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ComputerPlayer.consound % 2 == 0) {
                    nnn.stopmusic();
                    ImageIcon image2 = new ImageIcon("so1.PNG");
                    buttonsounde.setIcon(image2);
                }

                else {
                    nnn.playSound("tour1.wav");
                    ImageIcon image2 = new ImageIcon("so2.PNG");
                    buttonsounde.setIcon(image2);
                }
                ComputerPlayer.consound++;

            }
        });

        JButton textFieldname = new JButton(SelectedPlayer.name1);
        Border emptyBorder = null;
        textFieldname.setBorder(emptyBorder);
        frame.add(textFieldname);
        textFieldname.setFont(font2);
        textFieldname.setForeground(new Color(0x08090e));
        textFieldname.setBounds(60, 30, 100, 25);
        textFieldname.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));
        textFieldname.setFocusable(false);
        textFieldname.setBackground(new Color(0x5a0202));
        textFieldname.setEnabled(false);

        JButton textFielv = new JButton(" Vs  ");
        textFielv.setBorder(emptyBorder);
        frame.add(textFielv);
        textFielv.setFont(new Font("Monotype Corsive", Font.ITALIC, 20));
        textFielv.setForeground(new Color(0x08090e));
        textFielv.setBounds(190, 60, 100, 25);
        textFielv.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x5a0202)));
        textFielv.setFocusable(false);
        textFielv.setBackground(new Color(0x5a0202));

        JButton textField = new JButton(SelectedPlayer.name2);
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
        text.setForeground(new Color(0x08090e));
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
                x += 83;
                JButton bu = b[i][j];
                b[i][j].addActionListener(new ActionListener() {
                    private Object tt;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // JButton buttonClicked = (JButton) e.getSource();
                        if (PLAYER1) {
                            JTextField tw = new JTextField("     Wait");
                            JTextField tt = new JTextField("     PLAY");
                            textField.setFont(font2);
                            tw.setForeground(new Color(0x5a0202));
                            tw.setFont(font2);
                            tt.setFont(font2);
                            tt.setForeground(new Color(0x5a0202));
                            tt.setFocusable(false);
                            tt.setBackground(new Color(0x08090e));
                            tw.setFocusable(false);
                            tw.setBackground(new Color(0x08090e));
                            tw.setBorder(emptyBorder);
                            tw.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));
                            tt.setBorder(emptyBorder);
                            tt.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));

                            tw.setBounds(60, 90, 100, 25);
                            tt.setBounds(320, 90, 100, 25);
                            frame.add(tt);
                            frame.add(tw);

                            bu.setText("X");
                            bu.setForeground(Color.BLUE);
                            PLAYER1 = false;
                        } else {
                            bu.setText("O");
                            bu.setForeground(Color.RED);
                            PLAYER1 = true;
                            JTextField tw = new JTextField("     PLAY");
                            JTextField tt = new JTextField("     Wait");

                            textField.setFont(font2);
                            tw.setForeground(new Color(0x5a0202));
                            tw.setFont(font2);
                            tt.setFont(font2);
                            tt.setForeground(new Color(0x5a0202));
                            tt.setFocusable(false);
                            tt.setBackground(new Color(0x08090e));
                            tw.setFocusable(false);
                            tw.setBackground(new Color(0x08090e));
                            tw.setBorder(emptyBorder);
                            tw.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));
                            tt.setBorder(emptyBorder);
                            tt.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));

                            tw.setBounds(60, 90, 100, 25);
                            tt.setBounds(320, 90, 100, 25);
                            frame.add(tt);
                            frame.add(tw);

                        }
                        bu.setEnabled(false);

                        if (checkForWin()) {
                            playSound("wins.wav");
                            JOptionPane.showMessageDialog(null,
                                    (PLAYER1 ? SelectedPlayer.name2 : SelectedPlayer.name1) + " wins!");
                            resetGame();
                            if (PLAYER1) {
                                count1++;
                                text.setText("Points: " + count1);

                            } else {
                                count2++;
                                textF.setText("Points: " + count2);

                            }
                            JTextField tw = new JTextField("         ");
                            JTextField tt = new JTextField("          ");
                            textField.setFont(font2);
                            tw.setForeground(new Color(0x08090e));
                            tw.setFont(font2);
                            tt.setFont(font2);
                            tt.setForeground(Color.BLACK);
                            tt.setFocusable(false);
                            tt.setBackground(new Color(0x08090e));
                            tw.setFocusable(false);
                            tw.setBackground(new Color(0x08090e));
                            tw.setBorder(emptyBorder);
                            tw.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));
                            tt.setBorder(emptyBorder);
                            tt.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));

                            tw.setBounds(90, 20, 100, 25);
                            tt.setBounds(310, 20, 100, 25);
                            frame.add(tt);
                            frame.add(tw);

                        } else if (isBoardFull()) {
                            playSound("1.wav");
                            JOptionPane.showMessageDialog(null, "It's a tie!");
                            resetGame();
                        }

                    }

                });
                JButton button2 = new JButton();
                button2.setText(" finishing ");
                button2.setFocusable(false);
                button2.setFont(font2);
                button2.setBackground(new Color(0x5a0202));
                button2.setBounds(140, 400, 200, 20);
                button2.setForeground(new Color(0x08090e));
                button2.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 2));
                frame.add(button2);
                frame.add(b[i][j]);
                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "if you want save a result press Ok");
                        ArrayList<Players> players = new ArrayList<>();
                        Players p3 = new Players(SelectedPlayer.name1, SelectedPlayer.name2, count1, count2);
                        ArrayList<Players> playe = new ArrayList<>();
                        playe.add(p3);
                        // Players.saveUsersToFile(playe);

                  
                     

                    }
                });

            }
            y += 83;
            x = 120;

        }
        frame.getContentPane().setBackground(new Color(0x08090e));
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

    public void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j].setText("");
                b[i][j].setEnabled(true);
            }
        }
        PLAYER1 = !PLAYER1;
    }

    private void playSound(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}
