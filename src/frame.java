import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Random;

public class frame implements ActionListener {

    JFrame frame = new JFrame();
    JPanel title = new JPanel();

    JLabel textForTitle = new JLabel();

    JButton[] buttons = new JButton[9];

    JPanel button_Panel = new JPanel();

    boolean player1_turn;

    Random random = new Random();


    frame() {

        frame.setSize(500, 500);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        frame.getContentPane().setBackground(null);

        textForTitle.setFont(new Font("Calibre", Font.BOLD, 45));

        textForTitle.setBackground(Color.BLACK);

        textForTitle.setForeground(Color.GREEN);

        textForTitle.setHorizontalAlignment(JLabel.CENTER);

        textForTitle.setText("Tic Tac Toe");

        textForTitle.setOpaque(true);

        title.setBounds(0, 0, 400, 400);

        title.setLayout(new BorderLayout());

        title.add(textForTitle);

        button_Panel.setSize(300, 300);

        button_Panel.setLayout(new GridLayout(3, 3));

        frame.add(title, BorderLayout.NORTH);


        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            button_Panel.add(buttons[i]);
            buttons[i].addActionListener(this);
            frame.add(button_Panel);
        }

        playersTurn();

    }


    public void playersTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textForTitle.setText("X Turn");
        } else {
            player1_turn = false;
            textForTitle.setText("O Turn");
        }
    }




    public void xWon() {

        if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
            textForTitle.setText("X Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        }
    }


    public void OWon() {
        if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
            textForTitle.setText("Y Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
            textForTitle.setText("O Has Won");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {

            if (player1_turn && buttons[i] == e.getSource() && buttons[i].getText() == "") {

                buttons[i].setText("X");

                buttons[i].setFont(new Font("Comic Sans", 20, 50));

                buttons[i].setForeground(new Color(150, 0, 0));

                textForTitle.setText("O Turn");

                player1_turn = false;

                xWon();


            } else if (!player1_turn && buttons[i] == e.getSource() && buttons[i].getText() == "") {
                    buttons[i].setText("O");

                    buttons[i].setFont(new Font("Comic Sans", 20, 50));

                    buttons[i].setForeground(new Color(0, 0, 200));

                    textForTitle.setText("X Turn");

                    player1_turn = true;

                    OWon();

                }
            }
        }
    }

















