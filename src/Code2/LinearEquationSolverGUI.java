/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LinearEquationSolverGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Giai Phuong Trinh Bac Nhat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(4, 2));
        
        JLabel labelA = new JLabel("Nhap he so a:");
        JTextField textA = new JTextField();
        JLabel labelB = new JLabel("Nhap he so b:");
        JTextField textB = new JTextField();
        JButton button = new JButton("Giai");
        JLabel resultLabel = new JLabel("Nghiem: ");
        JLabel result = new JLabel();
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    if (a == 0) {
                        if (b == 0) {
                            result.setText("Vo so nghiem");
                        } else {
                            result.setText("Vo nghiem");
                        }
                    } else {
                        double x = -b / a;
                        result.setText(String.format("x = %.2f", x));
                    }
                } catch (NumberFormatException ex) {
                    result.setText("Loi nhap lieu!");
                }
            }
        });
        
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(button);
        frame.add(resultLabel);
        frame.add(result);
        
        frame.setVisible(true);
    }
}
