import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimple extends JFrame {
    private JTextField display;
    private String operator;
    private double firstOperand;

    public CalculadoraSimple() {
        super("Calculadora Simple");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        // Diseño General
        this.setLayout(new BorderLayout());

        // Pantalla de la Calculadora
        display = new JTextField();
        this.add(display, BorderLayout.NORTH);

        // Botones Numéricos y de Operaciones Básicas
        JPanel numberPanel = new JPanel(new GridLayout(4, 4));
        for (int i = 1; i <= 9; i++) {
            addButton(numberPanel, String.valueOf(i));
        }
        addButton(numberPanel, "0");
        addButton(numberPanel, "+");
        addButton(numberPanel, "-");
        addButton(numberPanel, "*");
        addButton(numberPanel, "/");
        this.add(numberPanel, BorderLayout.CENTER);

        // Botones de Operaciones Especiales
        JPanel specialOperationsPanel = new JPanel();
        specialOperationsPanel.setLayout(new BoxLayout(specialOperationsPanel, BoxLayout.Y_AXIS));
        addButton(specialOperationsPanel, "C");
        addButton(specialOperationsPanel, "=");
        this.add(specialOperationsPanel, BorderLayout.EAST);

        this.setVisible(true);
    }

    private void addButton(Container container, String text) {
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (text) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        firstOperand = Double.parseDouble(display.getText());
                        operator = text;
                        display.setText("");
                        break;
                    case "=":
                        double secondOperand = Double.parseDouble(display.getText());
                        switch (operator) {
                            case "+":
                                display.setText(String.valueOf(firstOperand + secondOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(firstOperand - secondOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(firstOperand * secondOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(firstOperand / secondOperand));
                                break;
                        }
                        operator = "";
                        break;
                    case "C":
                        display.setText("");
                        operator = "";
                        break;
                    default:
                        display.setText(display.getText() + text);
                        break;
                }
            }
        });
        container.add(button);
    }
}