import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Clase principal que extiende de JFrame para crear una interfaz gráfica
public class AplicacionEventos extends JFrame {
    // Declaración de los componentes de la interfaz
    private JTextField campoTexto; // Campo de texto para introducir información
    private JTextArea areaTexto; // Área de texto para mostrar la información introducida
    private JButton botonMostrar; // Botón para mostrar la información introducida en el área de texto

    // Constructor de la clase
    public AplicacionEventos() {
        super("Demostración de Eventos"); // Título de la ventana
        setLayout(new FlowLayout()); // Establecimiento del layout de la ventana

        campoTexto = new JTextField(10); // Inicialización del campo de texto
        add(campoTexto); // Añadir el campo de texto a la ventana

        botonMostrar = new JButton("Mostrar en Área de Texto"); // Inicialización del botón
        // Añadir un ActionListener al botón para que realice una acción cuando se haga clic en él
        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoTexto.getText(); // Obtener el texto introducido en el campo de texto
                areaTexto.append(texto + "\n"); // Añadir el texto al área de texto
                campoTexto.setText(""); // Limpiar el campo de texto
            }
        });
        add(botonMostrar); // Añadir el botón a la ventana

        areaTexto = new JTextArea(5, 20); // Inicialización del área de texto
        add(new JScrollPane(areaTexto)); // Añadir el área de texto a la ventana con un JScrollPane para permitir el desplazamiento

        setSize(300, 200); // Establecer el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer la operación de cierre por defecto
        setVisible(true); // Hacer visible la ventana
    }

    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        new AplicacionEventos(); // Crear una nueva instancia de la aplicación y mostrarla
    }
}