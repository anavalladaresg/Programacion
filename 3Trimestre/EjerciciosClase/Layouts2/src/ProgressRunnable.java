import javax.swing.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class ProgressRunnable implements Runnable {
    private final JProgressBar progressBar;
    private final AtomicBoolean running;
    private final AtomicInteger currentProgress;

    // Constructor
    ProgressRunnable(JProgressBar progressBar, AtomicBoolean running, AtomicInteger currentProgress) {
        this.progressBar = progressBar;
        this.running = running;
        this.currentProgress = currentProgress;
    }

    @Override
    public void run() {
        // Bucle para actualizar la barra de progreso
        for (int i = currentProgress.get(); i <= 100; i++) {
            // Si la reproducción está en pausa, guardar el progreso actual y salir del bucle
            if (!running.get()) {
                currentProgress.set(i);
                break;
            }
            final int progress = i;
            // Actualizar la barra de progreso en el hilo de despacho de eventos
            SwingUtilities.invokeLater(() -> progressBar.setValue(progress));
            try {
                // Pausar el hilo durante 100 milisegundos
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}