import javax.swing.*;
import javax.sound.sampled.*;
import javax.swing.border.Border;
import javax.swing.event.EventListenerList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class ComputerPlayer extends JFrame {
    private static int count1 = 0;
    private static int count2 = 0;
    private JButton textF;
    private Timer computerTimer;
    private JButton text;
    public static int consound = 0;
    Clip clip;
    private boolean PLAYER1 = true;
    private JButton[] b;

    public ComputerPlayer() {
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
            int finalI = i;
            b[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    onButtonClick(finalI);
                }
            });
            frame.add(b[i]);
        }

        frame.getContentPane().setBackground(new Color(0x08090e));
        // startGame();
    }

    private void startGame() {
        PLAYER1 = true;
        for (JButton button : b) {
            button.setText("");
            button.setEnabled(true);
        }

        computerTimer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computerMove(ComputerPlayer.this);
                computerTimer.stop();
            }
        });

        if (!PLAYER1) {

            computerTimer.start();
        }
    }

    private void onButtonClick(int index) {
        if (PLAYER1 && b[index].isEnabled()) {
            b[index].setText("X");
            b[index].setForeground(Color.BLACK);
            b[index].setEnabled(false);

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

    private static void computerMove(ComputerPlayer computerPlayer) {

        int randomIndex;
        do {
            randomIndex = new Random().nextInt(9);
        } while (!computerPlayer.b[randomIndex].isEnabled());
        computerPlayer.b[randomIndex].setText("O");
        computerPlayer.b[randomIndex].setEnabled(false);
        if (computerPlayer.checkForWin()) {
            computerPlayer.playSoundwin("Loser.MP3");
             JOptionPane.showMessageDialog(null, "you are losser!");
            count2++;
            computerPlayer.textF.setText("Points: " + count2);
            computerPlayer.startGame();
        } else if (computerPlayer.isBoardFull()) {
            JOptionPane.showMessageDialog(null, "It's a tie!");
            computerPlayer.startGame();
        } else {
            computerPlayer.PLAYER1 = true;
        }
    }

    Boolean checkForWin() {
        return (checkRowCol(0, 1, 2) || checkRowCol(2, 5, 8) || checkRowCol(0, 4, 8)
                || checkRowCol(2, 4, 6) || checkRowCol(1, 4, 7) || checkRowCol(0, 3, 6) || checkRowCol(6, 7, 8)
                || checkRowCol(3, 4, 5));
    }

    private boolean checkRowCol(int a, int d, int c) {
        return (b[a].getText().equals(b[d].getText()) && b[d].getText().equals(b[c].getText())
                && !b[a].getText().equals(""));
    }

    public int selected(int index) {
        if (index == 1 || index == 4 || index == 7) {
            if (b[index].getText().equals(b[index + 1].getText())) {
                return index + 1;
            }
            if (b[index].getText().equals(b[index - 1].getText())) {
                return index - 1;
            }
            if (b[index].getText().equals(b[index - 3].getText())) {
                return index - 3;
            }
            if (b[index].getText().equals(b[index + 3].getText())) {
                return index + 3;
            }
        }
        return index;
    }
    // private boolean choseplace() {
    // return (checkRowCol(0, 1, 2) || checkRowCol(3, 4, 5) || checkRowCol(6, 7, 8)
    // || checkRowCol(0, 3, 6) || checkRowCol(1, 4, 7) || checkRowCol(2, 5, 8)
    // || checkRowCol(0, 4, 8) || checkRowCol(2, 4, 6));
    // }
    // private boolean chick(int a, int d, int c) {
    // if(b[a].getText().equals(b[d].getText()) ||
    // b[d].getText().equals(b[c].getText())
    // && !b[a].getText().equals("")){
    // return true;
    // }
    // return false;
    // }

    private boolean isBoardFull() {
        for (JButton button : b) {
            if (button.getText().equals("")) {
                return false;
            }
        }
        return true;
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