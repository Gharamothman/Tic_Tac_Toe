import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class HumanPlayer extends JFrame {
    static int count1 = 0;
    static int count2 = 0;
    JButton textF;
    JButton text;
    boolean PLAYER1 = true;
    static JButton[] b = null;
    JFrame frame;

    public HumanPlayer() {
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
              frame. dispose();
                new Option();
            }

        });

        ImageIcon image2 = new ImageIcon("so2edit.PNG");
        JButton buttonsounde = new JButton();
        buttonsounde.setIcon(image2);
        buttonsounde.setFocusable(false);
        buttonsounde.setFont(font2);
        buttonsounde.setBackground(new Color(0x08090e));
        buttonsounde.setBounds(440, 50, 52, 50);
        buttonsounde.setForeground(new Color(0x08090e));
        buttonsounde.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
        frame.add(buttonsounde);
        buttonsounde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ComputerPlayer.consound % 2 == 0) {
                    nnn.stopmusic();
                    ImageIcon image2 = new ImageIcon("so1edit.PNG");
                    buttonsounde.setIcon(image2);
                }

                else {
                    nnn.playSound("tour1.wav");
                    ImageIcon image2 = new ImageIcon("so2edit.PNG");
                    buttonsounde.setIcon(image2);
                }
                ComputerPlayer.consound++;

            }
        });
        ImageIcon image = new ImageIcon("restart2.PNG");
        JButton buttonretart = new JButton();
        buttonretart.setText(" Restart ");
        buttonretart.setFocusable(false);
        buttonretart.setFont(font2);
        buttonretart.setBackground(new Color(0x08090e));
        buttonretart.setBounds(400, 100, 100, 20);
        buttonretart.setForeground( (Color.white));
        // buttonretart.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
        frame.add(buttonretart);
        buttonretart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resetGame();

            }
        });

      
        JButton buttonretarttt = new JButton();
        buttonretarttt.setText("Try Again");
        buttonretarttt.setFocusable(false);
        buttonretarttt.setFont(font2);
        buttonretarttt.setBackground(new Color(0x08090e));
        buttonretarttt.setBounds(400, 125, 100, 20);
        buttonretarttt.setForeground( (Color.white));
        // buttonretart.setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
        frame.add(buttonretarttt);
        buttonretarttt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resetGame();

            }
        });




        JButton Fieldname = new JButton(SelectedPlayer.name1);
        Border emptyBorder = null;
        Fieldname.setBorder(emptyBorder);
        frame.add(Fieldname);
        Fieldname.setFont(font2);
        Fieldname.setForeground(new Color(0x08090e));
        Fieldname.setBounds(60, 30, 100, 25);
        Fieldname.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(0x08090e)));
        Fieldname.setFocusable(false);
        Fieldname.setBackground(new Color(0x5a0202));
        Fieldname.setEnabled(false);

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
        b = new JButton[9];
        for (int i = 0; i < 9; i++) {
            if (i == 3) {
                y += 83;
                x = 120;
            }
            if (i == 6) {
                y += 83;
                x = 120;
            }
            b[i] = new JButton();

            b[i].setFocusable(false);
            b[i].setFont(font2);
            b[i].setBackground(new Color(0x5a0202));
            b[i].setBounds(x, y, 80, 80);
            b[i].setForeground(Color.white);
            b[i].setBorder(BorderFactory.createLineBorder(new Color(0x08090e), 5));
            x += 83;
            JButton bu = b[i];
            b[i].addActionListener(new ActionListener() {
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

                      
                        tw.setBounds(60, 90, 100, 25);
                        tt.setBounds(320, 90, 100, 25);
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
            frame.add(b[i]);
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int choice=JOptionPane.showConfirmDialog(null, "if you want save a result press Ok");
                    if(choice== JOptionPane.OK_OPTION){
                    ArrayList<Players>players= new ArrayList<>();
                    Players p3= new Players(SelectedPlayer.name1, SelectedPlayer.name2, count1, count2);
                    Players.saveUsersToFile(p3);
                    }
                    else {
                        System.out.println("dont save ");
                    }
                }
            });

        }

        frame.getContentPane().setBackground(new Color(0x08090e));

    }

    public boolean checkForWin() {
        return (checkRowCol(0, 1, 2) || checkRowCol(3, 4, 5) || checkRowCol(6, 7, 8)
                || checkRowCol(0, 3, 6) || checkRowCol(1, 4, 7) || checkRowCol(2, 5, 8)
                || checkRowCol(0, 4, 8) || checkRowCol(2, 4, 6));
    }

    public boolean checkRowCol(int a, int d, int c) {
        return (b[a].getText().equals(b[d].getText()) && b[d].getText().equals(b[c].getText())
                && !b[a].getText().equals(""));
    }

    public boolean isBoardFull() {
        for (JButton button : b) {
            if (button.getText().equals("")) {
                return false;
            }
        }
        return true;
    }

    public void resetGame() {
        for (JButton button : b) {
            button.setText("");
            button.setEnabled(true);
        }
        PLAYER1 = !PLAYER1;
        for (JButton button : b) {
            System.out.println(button.getText());
        }
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
    }

}
