package action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.security.InvalidParameterException;

public class AbstractAction {

    private static JButton operation;
    private static Double value1;

    public static void appendNumber(JTextField textField, ActionEvent e) {
        if(textField.getText().length() < 10) {
            JButton button = (JButton) e.getSource();
            String number = button.getText();
            textField.setText(textField.getText() + number);
        }
    }

    public static void calculate(JTextField textField, ActionEvent e, JButton clear, JButton equal, JButton sum, JButton sub, JButton mult, JButton div) {
        if(!textField.getText().isEmpty()) {
            JButton button = (JButton) e.getSource();

            if(button.equals(clear)) {
                operation = null;
                textField.setText("");
            }
            else if(button.equals(equal) && operation != null) {
                double value2 = Double.parseDouble(textField.getText());

                if(operation.equals(sum)) {
                    value1 += value2;
                }
                else if(operation.equals(sub)) {
                    value1 -= value2;
                }
                else if(operation.equals(mult)) {
                    value1 *= value2;
                }
                else if(operation.equals(div)) {
                    checkDivision(value2, textField);
                    value1 /= value2;
                }

                textField.setText(String.valueOf(value1));
                operation = null;
            }
            else if(!button.equals(equal)) {
                operation = button;
                value1 = Double.parseDouble(textField.getText());
                textField.setText("");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Digite um número para efetuar ou concluir uma operação");
        }
    }

    private static void checkDivision(Double value, JTextField textField) {
        if(value.equals(0.0)) {
            textField.setText("");
            JOptionPane.showMessageDialog(null, "Não é possível dividir por 0");
            throw new InvalidParameterException("Não é possível dividir por 0");
        }
    }
}
