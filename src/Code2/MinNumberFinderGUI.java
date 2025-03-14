/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinNumberFinderGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tim So Nho Nhat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(4, 2));
        
        JLabel labelA = new JLabel("Nhap so thu nhat:");
        JTextField textA = new JTextField();
        JLabel labelB = new JLabel("Nhap so thu hai:");
        JTextField textB = new JTextField();
        JLabel labelC = new JLabel("Nhap so thu ba:");
        JTextField textC = new JTextField();
        JButton button = new JButton("Tim Min");
        JLabel resultLabel = new JLabel("So nho nhat: ");
        JLabel result = new JLabel();
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    double c = Double.parseDouble(textC.getText());
                    double min = Math.min(a, Math.min(b, c));
                    result.setText(String.format("%.2f", min));
                } catch (NumberFormatException ex) {
                    result.setText("Loi nhap lieu!");
                }
            }
        });
        
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(labelC);
        frame.add(textC);
        frame.add(button);
        frame.add(resultLabel);
        frame.add(result);
        
        frame.setVisible(true);
    }
}

