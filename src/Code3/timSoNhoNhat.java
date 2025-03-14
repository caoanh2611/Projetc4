/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class timSoNhoNhat {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tim So Nho Nhat Trong Mang");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));
        
        JLabel label = new JLabel("Nhap cac so, cach nhau boi dau phay:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Tim Min");
        JLabel resultLabel = new JLabel("So nho nhat: ");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String input = textField.getText();
                    String[] parts = input.split(",");
                    double[] numbers = new double[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        numbers[i] = Double.parseDouble(parts[i].trim());
                    }
                    double min = Arrays.stream(numbers).min().orElseThrow();
                    resultLabel.setText("So nho nhat: " + min);
                } catch (Exception ex) {
                    resultLabel.setText("Loi nhap lieu!");
                }
            }
        });
        
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);
        
        frame.setVisible(true);
    }
}
