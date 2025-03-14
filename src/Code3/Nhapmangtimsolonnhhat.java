package Code3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nhapmangtimsolonnhhat extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public Nhapmangtimsolonnhhat() { // Sửa lỗi thiếu dấu ()
        setTitle("Tìm số lớn nhất trong mảng");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Nhập mảng số (cách nhau bằng dấu phẩy):");
        inputField = new JTextField(20);
        JButton findButton = new JButton("Tìm số lớn nhất");
        resultLabel = new JLabel("");

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findMaxNumber();
            }
        });

        add(promptLabel);
        add(inputField);
        add(findButton);
        add(resultLabel);

        setVisible(true);
    }

    private void findMaxNumber() {
        try {
            String inputText = inputField.getText();
            String[] numberStrings = inputText.split(",");
            int max = Integer.MIN_VALUE;

            for (String numStr : numberStrings) {
                int number = Integer.parseInt(numStr.trim());
                if (number > max) {
                    max = number;
                }
            }

            resultLabel.setText("Số lớn nhất là: " + max);
            resultLabel.setForeground(Color.BLUE);
        } catch (NumberFormatException e) { // Sửa lỗi thiếu phần bắt lỗi đầy đủ
            resultLabel.setText("Vui lòng nhập đúng định dạng số!");
            resultLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Nhapmangtimsolonnhhat::new);
    }
}
