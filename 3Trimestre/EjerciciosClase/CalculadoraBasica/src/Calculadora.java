
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    private JTextField primerNumero;
    private JTextField segundoNumero;
    private JButton suma;
    private JButton resta;
    private JTextArea resultado;

    public Calculadora() {
        super("Calculadora");
        this.setLayout(new FlowLayout());
        this.primerNumero = new JTextField(5);
        this.add(this.primerNumero);
        this.segundoNumero = new JTextField(5);
        this.add(this.segundoNumero);
        this.suma = new JButton("+");
        this.suma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(Calculadora.this.primerNumero.getText());
                float num2 = Float.parseFloat(Calculadora.this.segundoNumero.getText());
                float resultadoSuma = num1 + num2;
                Calculadora.this.resultado.append("" + resultadoSuma + "\n");
                Calculadora.this.primerNumero.setText("");
                Calculadora.this.segundoNumero.setText("");
            }
        });
        this.add(this.suma);
        this.resta = new JButton("-");
        this.resta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(Calculadora.this.primerNumero.getText());
                float num2 = Float.parseFloat(Calculadora.this.segundoNumero.getText());
                float resultadoSuma = num1 - num2;
                Calculadora.this.resultado.append("" + resultadoSuma + "\n");
                Calculadora.this.primerNumero.setText("");
                Calculadora.this.segundoNumero.setText("");
            }
        });
        this.add(this.resta);
        this.resultado = new JTextArea(5, 20);
        this.add(new JScrollPane(this.resultado));
        this.setSize(300, 200);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
