/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Code1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class phepCong {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Phep Cong Hai So");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));
        
        JLabel label1 = new JLabel("Nhap so thu nhat:");
        JTextField text1 = new JTextField();
        JLabel label2 = new JLabel("Nhap so thu hai:");
        JTextField text2 = new JTextField();
        JButton button = new JButton("Tinh Tong");
        JLabel resultLabel = new JLabel("Ket qua: ");
        JLabel result = new JLabel();
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int sum = num1 + num2;
                    result.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    result.setText("Loi nhap lieu!");
                }
            }
        });
        
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button);
        frame.add(resultLabel);
        frame.add(result);
        
        frame.setVisible(true);
    }
}
