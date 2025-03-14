
package Code1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pheptru {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Phép Trừ Hai Số");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 5, 5));
        
        JLabel label1 = new JLabel("Số thứ nhất:");
        JTextField text1 = new JTextField();
        JLabel label2 = new JLabel("Số thứ hai:");
        JTextField text2 = new JTextField();
        JButton button = new JButton("Trừ");
        JLabel resultLabel = new JLabel("Kết quả:");
        JLabel result = new JLabel("0");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText().trim());
                    int num2 = Integer.parseInt(text2.getText().trim());
                    result.setText(String.valueOf(num1 - num2));
                } catch (NumberFormatException ex) {
                    result.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });
        
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button);
        frame.add(new JLabel());
        frame.add(resultLabel);
        frame.add(result);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}