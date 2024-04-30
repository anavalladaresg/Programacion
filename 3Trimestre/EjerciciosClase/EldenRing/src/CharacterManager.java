import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class CharacterManager extends JFrame {
    private JPanel mainPanel;
    private JTextField nameField;
    private JComboBox<String> typeSelector;
    private JSpinner strengthSpinner, agilitySpinner, intelligenceSpinner;
    private JButton createButton, loadButton, simulateButton;
    private JTextArea outputArea;
    private Character character1, character2;

    public CharacterManager() {
        super("Elden Ring Character Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        initializeUI();
    }

    private void initializeUI() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        nameField = new JTextField(10);
        typeSelector = new JComboBox<>(new String[]{"Warrior", "Mage", "Scout"});
        strengthSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 100, 1));
        agilitySpinner = new JSpinner(new SpinnerNumberModel(5, 1, 100, 1));
        intelligenceSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 100, 1));
        createButton = new JButton("Create");
        loadButton = new JButton("Load");
        simulateButton = new JButton("Simulate");
        outputArea = new JTextArea(10, 50);
        outputArea.setEditable(false);

        mainPanel.add(new JLabel("Name:"));
        mainPanel.add(nameField);
        mainPanel.add(new JLabel("Type:"));
        mainPanel.add(typeSelector);
        mainPanel.add(new JLabel("Strength:"));
        mainPanel.add(strengthSpinner);
        mainPanel.add(new JLabel("Agility:"));
        mainPanel.add(agilitySpinner);
        mainPanel.add(new JLabel("Intelligence:"));
        mainPanel.add(intelligenceSpinner);
        mainPanel.add(createButton);
        mainPanel.add(loadButton);
        mainPanel.add(simulateButton);
        mainPanel.add(new JScrollPane(outputArea));

        add(mainPanel);

        createButton.addActionListener(this::createCharacter);
        loadButton.addActionListener(this::loadCharacter);
        simulateButton.addActionListener(this::simulateFight);
    }

    private void createCharacter(ActionEvent e) {
        String name = nameField.getText();
        String type = (String) typeSelector.getSelectedItem();
        int strength = (int) strengthSpinner.getValue();
        int agility = (int) agilitySpinner.getValue();
        int intelligence = (int) intelligenceSpinner.getValue();

        switch (type) {
            case "Warrior":
                character1 = new Warrior(name, strength, agility, intelligence);
                break;
            case "Mage":
                character1 = new Mage(name, strength, agility, intelligence);
                break;
            case "Scout":
                character1 = new Scout(name, strength, agility, intelligence);
                break;
        }

        outputArea.setText("Character Created: \n" + character1);
        saveCharacter(character1);
    }

    private void loadCharacter(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(selectedFile))) {
                character2 = (Character) ois.readObject();
                outputArea.setText("Character Loaded: \n" + character2);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void simulateFight(ActionEvent e) {
        if (character1 != null && character2 != null) {
            outputArea.setText("Simulating Fight...\n");
            outputArea.append("Character 1: " + character1 + "\n");
            outputArea.append("Character 2: " + character2 + "\n");
            // Simulate fight logic here
        } else {
            JOptionPane.showMessageDialog(this, "Please create or load two characters to simulate a fight.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Métodos para guardar y cargar personajes (incluir en la clase CharacterManager)
    private void saveCharacter(Character character) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(selectedFile))) {
                oos.writeObject(character);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}