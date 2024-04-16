import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class GestorDeTareas {
    ArrayList<Tarea> listaDeTareas = new ArrayList<>();
    Tarea t = new Tarea();

    public void addTarea(Tarea t) {
        listaDeTareas.add(t);
    }

    public void completeTareas() {
        int completado = JOptionPane.showConfirmDialog(null, "Está la tarea: " + t.getDescripcion() + " completada?");
    }

    public void saveTareas() {
        try {
            FileOutputStream fileOut = new FileOutputStream("tareas.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaDeTareas);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}