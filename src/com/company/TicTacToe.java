package com.company;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_pannel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color (25,255,0));
        textField.setFont(new Font("Helvetica Neue", Font.PLAIN, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic-Tac-Toe");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_pannel.setLayout(new GridLayout(3,3));
        button_pannel.setBackground(new Color(150,150,150));

        for(int i = 0; i < 9; i ++){
            buttons[i] = new JButton();
            button_pannel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_pannel);

        firstTurn();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++){
            if (e.getSource() == buttons[i]){
                if(player1_turn){
                    if (buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O Turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textField.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn(){

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0){
            player1_turn = true;
            textField.setText("X turn");
        } else {
            player1_turn = false;
            textField.setText("Y turn");
        }
    }

    public void check(){
        // Check X win
        int wX = 0;
        int wY = 1;
        int wZ = 2;
        String testWinner = "X";
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 3;
        wY = 4;
        wZ = 5;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 6;
        wY = 7;
        wZ = 8;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 0;
        wY = 3;
        wZ = 6;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 1;
        wY = 4;
        wZ = 7;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 2;
        wY = 5;
        wZ = 8;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 0;
        wY = 4;
        wZ = 8;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }
        wX = 2;
        wY = 4;
        wZ = 6;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ xWins(wX,wY,wZ); }

        // Check O win

        wX = 0;
        wY = 1;
        wZ = 2;
        testWinner = "O";
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 3;
        wY = 4;
        wZ = 5;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 6;
        wY = 7;
        wZ = 8;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 0;
        wY = 3;
        wZ = 6;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 1;
        wY = 4;
        wZ = 7;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 2;
        wY = 5;
        wZ = 8;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 0;
        wY = 4;
        wZ = 8;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }
        wX = 2;
        wY = 4;
        wZ = 6;
        if((buttons[wX].getText()==testWinner) && (buttons[wY].getText()==testWinner) && (buttons[wZ].getText()==testWinner)){ oWins(wX,wY,wZ); }


    }

    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for (int i = 0; i< 9; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("X Wins");

    }

    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for (int i = 0; i< 9; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("O Wins");

    }

}
