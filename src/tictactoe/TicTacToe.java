package tictactoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe implements ActionListener
{
    JFrame tttField;
    JButton point1;
    JButton point2;
    JButton point3;
    JButton point4;
    JButton point5;
    JButton point6;
    JButton point7;
    JButton point8;
    JButton point9;
    int playCount = 0;

    public static void main(String[] args)
    {
        new TicTacToe().getGoing();
    }

    public void getGoing()
    {
        tttField = new JFrame("Let's play tic-tac-toe!");
        tttField.setLayout(new GridLayout(3, 3));
        tttField.setSize(2000, 2000);
        tttField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        point1 = new JButton("point 1");
        tttField.add(point1);
        point1.addActionListener(this);


        point2 = new JButton("point 2");
        tttField.add(point2);
        point2.addActionListener(this);

        point3 = new JButton("point 3");
        tttField.add(point3);
        point3.addActionListener(this);

        point4 = new JButton("point 4");
        tttField.add(point4);
        point4.addActionListener(this);

        point5 = new JButton("point 5");
        tttField.add(point5);
        point5.addActionListener(this);

        point6 = new JButton("point 6");
        tttField.add(point6);
        point6.addActionListener(this);

        point7 = new JButton("point 7");
        tttField.add(point7);
        point7.addActionListener(this);

        point8 = new JButton("point 8");
        tttField.add(point8);
        point8.addActionListener(this);

        point9 = new JButton("point 9");
        tttField.add(point9);
        point9.addActionListener(this);

        tttField.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent joe)
    {
        JButton clickButton = (JButton) joe.getSource();
        if (playCount == 8)
        {
            JOptionPane.showMessageDialog(null, "Tie game!");
           System.exit(1);
        }
        clickButton.setFont(new Font("Bank Gothic", Font.BOLD, 99));
        if (clickButton.getText().equals("o") || clickButton.getText().equals("x"))
        {
           JOptionPane.showMessageDialog(null, "Busted!"); 
        }
        
        if (playCount % 2 == 0)
        {
            clickButton.setText("x");
        }
        if (playCount % 2 == 1)
        {
            clickButton.setText("o");
        }
        
        if (point1.getText() == point2.getText() && point1.getText() == point3.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point4.getText() == point5.getText() && point4.getText() == point6.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point7.getText() == point8.getText() && point7.getText() == point9.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point1.getText() == point4.getText() && point1.getText() == point7.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point2.getText() == point5.getText() && point2.getText() == point8.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point3.getText() == point6.getText() && point3.getText() == point9.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point1.getText() == point5.getText() && point1.getText() == point9.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!"); 
           System.exit(1);
        }
        if (point3.getText() == point5.getText() && point3.getText() == point7.getText())
        {
           JOptionPane.showMessageDialog(null, "We have a winner!");
           System.exit(1);
        }
            
        playCount++;
        System.out.println(playCount);
    }
}
