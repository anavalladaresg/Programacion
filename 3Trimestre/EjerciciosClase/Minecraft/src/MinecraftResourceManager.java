import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase representa un MinecraftResourceManager que extiende JFrame.
 * Proporciona una interfaz gráfica para gestionar los materiales en Minecraft.
 */
public class MinecraftResourceManager extends JFrame {
    // Un mapa para almacenar los materiales y sus cantidades
    private Map<String, Integer> materials = new HashMap<>();
    // Un campo de texto para ingresar la cantidad de material
    private JTextField quantityTextField;

    /**
     * Constructor para la clase MinecraftResourceManager.
     * Inicializa la interfaz gráfica y configura los componentes.
     */
    public MinecraftResourceManager() {
        // Configuración básica de la ventana
        setTitle("Gestor de Recursos de Minecraft");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear componentes de la interfaz gráfica
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Selecciona un material:");
        JComboBox<String> materialsComboBox = new JComboBox<>(new String[]{"Piedra", "Madera", "Hierro"});
        quantityTextField = new JTextField(10);
        JButton addButton = new JButton("Agregar");
        JTextArea outputArea = new JTextArea(10, 20);
        outputArea.setEditable(false);

        // Agregar componentes al panel
        panel.add(label);
        panel.add(materialsComboBox);
        panel.add(new JLabel("Cantidad:"));
        panel.add(quantityTextField);
        panel.add(addButton);
        panel.add(new JScrollPane(outputArea));

        // Agregar el panel a la ventana
        add(panel);

        // Acción del botón "Agregar"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String material = (String) materialsComboBox.getSelectedItem();
                int quantity = Integer.parseInt(quantityTextField.getText());
                if (materials.containsKey(material)) {
                    materials.put(material, materials.get(material) + quantity);
                } else {
                    materials.put(material, quantity);
                }
                updateOutput(outputArea);
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    /**
     * Este método se utiliza para actualizar el área de texto con la lista de materiales y sus cantidades.
     *
     * @param outputArea El área de texto a actualizar
     */
    private void updateOutput(JTextArea outputArea) {
        outputArea.setText("");
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            outputArea.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }
}