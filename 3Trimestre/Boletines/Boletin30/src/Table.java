import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase representa una ventana con una tabla que permite añadir filas con datos de alumnos.
 * Cada fila tiene tres columnas: nombre, apellidos y curso.
 */
public class Table extends JFrame {
    private JTextField nameField;
    private JTextField surnameField;
    private JComboBox<String> courseBox;
    private DefaultTableModel model;
    private JTable table;
    private JLabel rowCountLabel;

    /**
     * Constructor de la clase Table.
     * Crea una ventana con una tabla y un formulario para añadir filas a la tabla.
     */
    public Table() {
        setTitle("Data table");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameField = new JTextField(10);
        surnameField = new JTextField(10);
        courseBox = new JComboBox<>(new String[]{"1º", "2º"});

        JButton addButton = getjButton();

        model = new DefaultTableModel(new Object[]{"Name", "Surname", "Course"}, 0);
        table = new JTable(model);

        rowCountLabel = new JLabel();

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Surname:"));
        inputPanel.add(surnameField);
        inputPanel.add(new JLabel("Course:"));
        inputPanel.add(courseBox);
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(rowCountLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    /**
     * Devuelve un botón que añade una fila a la tabla con los datos introducidos en los campos de texto.
     * Si algún campo está vacío, muestra un mensaje de error.
     *
     * @return JButton que añade una fila a la tabla.
     */
    private JButton getjButton() {
        JButton addButton = new JButton("Add to table");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String surname = surnameField.getText();
                String course = (String) courseBox.getSelectedItem();

                if (name.isEmpty() || surname.isEmpty() || course == null) {
                    JOptionPane.showMessageDialog(null, "Please complete all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    model.addRow(new Object[]{name, surname, course});
                    updateRowCount();
                }
            }
        });
        return addButton;
    }

    /**
     * Actualiza el texto de la etiqueta rowCountLabel con el número de filas de la tabla.
     */
    private void updateRowCount() {
        rowCountLabel.setText("Number of rows: " + model.getRowCount());
    }
}