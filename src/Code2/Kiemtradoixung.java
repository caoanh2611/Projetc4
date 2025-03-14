package Code2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kiemtradoixung extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    // Constructor phải có cùng tên với lớp
    public Kiemtradoixung() {
        setTitle("Kiểm tra số đối xứng");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Nhập số:");
        inputField = new JTextField(10);
        JButton checkButton = new JButton("Kiểm tra");
        resultLabel = new JLabel("");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPalindrome();
            }
        });

        add(promptLabel);
        add(inputField);
        add(checkButton);
        add(resultLabel);

        setVisible(true);
    }

    private void checkPalindrome() {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (isPalindrome(number)) {
                resultLabel.setText(number + " là số đối xứng.");
                resultLabel.setForeground(Color.BLUE);
            } else {
                resultLabel.setText(number + " không phải số đối xứng.");
                resultLabel.setForeground(Color.RED);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Vui lòng nhập một số hợp lệ!");
            resultLabel.setForeground(Color.ORANGE);
        }
    }

    private boolean isPalindrome(int number) {
        if (number < 0) return false; // Số âm không phải số đối xứng
        int reversed = 0, original = number;
        
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        return original == reversed;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Kiemtradoixung::new); // Đổi lại tên lớp cho đúng
    }
}
