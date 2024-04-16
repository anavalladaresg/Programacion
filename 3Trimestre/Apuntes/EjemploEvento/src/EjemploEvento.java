// Importamos las clases necesarias de los paquetes javax.swing y java.awt.event
import javax.swing.*;
import java.awt.event.*;

// Definimos una clase pública llamada EjemploEvento que hereda de JFrame
public class EjemploEvento extends JFrame {
    // Declaramos un objeto JButton llamado boton
    JButton boton;

    // Definimos el constructor de la clase EjemploEvento
    public EjemploEvento() {
        // Llamamos al constructor de la superclase JFrame con el título de la ventana
        super("Ejemplo de Evento");
        // Establecemos la operación por defecto cuando se cierra la ventana a EXIT_ON_CLOSE
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establecemos el tamaño de la ventana a 200x100
        setSize(200, 100);

        // Inicializamos el objeto boton y le asignamos un texto
        boton = new JButton("Haz clic");
        // Añadimos un ActionListener al boton. Este se activará cuando se haga clic en el boton
        boton.addActionListener(new ActionListener() {
            // Definimos el método actionPerformed que se ejecutará cuando se haga clic en el boton
            @Override
            public void actionPerformed(ActionEvent e) {
                // Imprimimos un mensaje en la consola
                System.out.println("¡Botón presionado!");
            }
        });

        // Añadimos el boton a la ventana
        add(boton);
        // Hacemos visible la ventana
        setVisible(true);
    }

    // Definimos el método main que se ejecutará cuando se inicie el programa
    public static void main(String[] args) {
        // Creamos una nueva instancia de EjemploEvento
        new EjemploEvento();
    }
}