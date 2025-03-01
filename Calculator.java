import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

class Calculator implements ActionListener {
    JFrame f1 = new JFrame();
    JTextField t1;
    JButton btnAc, btnDelete, btnpercent, btnPlus, btnMin, btnDiv, btnMul, btnZero, btnZero1, btnEq, btnDec;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; 
    Font ff1 = new Font("Roboto", Font.BOLD, 30);
    JPanel panel;
    Double num1, num2, result;
    char opr;

    public Calculator() {
     
        f1.setSize(450, 600);
        f1.setTitle("CALCULATOR");
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(Color.WHITE);
        f1.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(7, 10, 420, 100);
        t1.setBackground(new Color(247, 199, 195));
        t1.setFont(ff1);
        f1.add(t1);

        panel = new JPanel();
        panel.setBounds(7, 120, 420, 430);
        panel.setBackground(Color.GRAY);
        f1.add(panel);
        panel.setLayout(new GridLayout(5, 4));

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

       
        JButton[] numberButtons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        for (JButton btn : numberButtons) {
            btn.setFont(ff1);
            btn.setForeground(Color.BLACK);
            btn.setBackground(new Color(246, 237, 238, 255));
            btn.addActionListener(this);
        }

        btnAc = new JButton("AC");
        btnAc.setFont(ff1);
        btnAc.setForeground(Color.BLACK);
        btnAc.setBackground(new Color(246, 220, 179));

        btnDelete = new JButton("Del");
        btnDelete.setFont(ff1);
        btnDelete.setForeground(Color.BLACK);
        btnDelete.setBackground(new Color(246, 220, 179));

        btnpercent = new JButton("%");
        btnpercent.setFont(ff1);
        btnpercent.setForeground(Color.BLACK);
        btnpercent.setBackground(new Color(247, 199, 195));

        btnPlus = new JButton("+");
        btnPlus.setFont(ff1);
        btnPlus.setForeground(Color.BLACK);
        btnPlus.setBackground(new Color(247, 199, 195));

        btnMin = new JButton("-");
        btnMin.setFont(ff1);
        btnMin.setForeground(Color.BLACK);
        btnMin.setBackground(new Color(247, 199, 195));

        btnDiv = new JButton("/");
        btnDiv.setFont(ff1);
        btnDiv.setForeground(Color.BLACK);
        btnDiv.setBackground(new Color(247, 199, 195));

        btnMul = new JButton("*");
        btnMul.setFont(ff1);
        btnMul.setForeground(Color.BLACK);
        btnMul.setBackground(new Color(247, 199, 195));

        btnDec = new JButton(".");
        btnDec.setFont(ff1);
        btnDec.setForeground(Color.BLACK);
        btnDec.setBackground(new Color(246, 237, 238, 255));

        btnZero = new JButton("0");
        btnZero.setFont(ff1);
        btnZero.setForeground(Color.BLACK);
        btnZero.setBackground(new Color(246, 237, 238, 255));

        btnZero1 = new JButton("00");
        btnZero1.setFont(ff1);
        btnZero1.setForeground(Color.BLACK);
        btnZero1.setBackground(new Color(246, 237, 238, 255));

        btnEq = new JButton("=");
        btnEq.setFont(ff1);
        btnEq.setForeground(Color.BLACK);
        btnEq.setBackground(new Color(247, 199, 195));
       
        panel.add(btnAc);
        panel.add(btnDelete);  
        panel.add(btnpercent);
        panel.add(btnPlus);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnMin);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnDiv);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnMul);
        panel.add(btnZero);
        panel.add(btnDec);
        panel.add(btnZero1);
        panel.add(btnEq);

        btnPlus.addActionListener(this);
        btnMin.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMul.addActionListener(this);
        btnDec.addActionListener(this);
        btnEq.addActionListener(this);
        btnZero.addActionListener(this);
        btnZero1.addActionListener(this);
        btnAc.addActionListener(this);
        btnpercent.addActionListener(this);
        btnDelete.addActionListener(this); 

        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Number buttons
        if (e.getSource() == btn1) t1.setText(t1.getText().concat("1"));
        if (e.getSource() == btn2) t1.setText(t1.getText().concat("2"));
        if (e.getSource() == btn3) t1.setText(t1.getText().concat("3"));
        if (e.getSource() == btn4) t1.setText(t1.getText().concat("4"));
        if (e.getSource() == btn5) t1.setText(t1.getText().concat("5"));
        if (e.getSource() == btn6) t1.setText(t1.getText().concat("6"));
        if (e.getSource() == btn7) t1.setText(t1.getText().concat("7"));
        if (e.getSource() == btn8) t1.setText(t1.getText().concat("8"));
        if (e.getSource() == btn9) t1.setText(t1.getText().concat("9"));
        
        if (e.getSource() == btnZero) t1.setText(t1.getText().concat("0"));
        if (e.getSource() == btnZero1) t1.setText(t1.getText().concat("00"));
        if (e.getSource() == btnDec) t1.setText(t1.getText().concat("."));

        // Operators
        if (e.getSource() == btnPlus) {
            num1 = Double.parseDouble(t1.getText());
            opr = '+';
            t1.setText("");
        }
        if (e.getSource() == btnMin) {
            num1 = Double.parseDouble(t1.getText());
            opr = '-';
            t1.setText("");
        }
        if (e.getSource() == btnMul) {
            num1 = Double.parseDouble(t1.getText());
            opr = '*';
            t1.setText("");
        }
        if (e.getSource() == btnDiv) {
            num1 = Double.parseDouble(t1.getText());
            opr = '/';
            t1.setText("");
        }
        if (e.getSource() == btnpercent) {
            num1 = Double.parseDouble(t1.getText());
            result = num1 / 100;
            t1.setText(String.valueOf(result));
        }
        if (e.getSource() == btnDelete) {
            String text = t1.getText();
            if (text.length() > 0) {
                t1.setText(text.substring(0, text.length() - 1)); 
            }
        }
        if (e.getSource() == btnAc) t1.setText("");
        if (e.getSource() == btnEq) {
            num2 = Double.parseDouble(t1.getText());
            switch (opr) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = 0.0;
            }
            t1.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}