public class ReproductorMP3 implements ReproductorMusical {
    @Override
    public void pause() {
        System.out.println("Pausando MP3");
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo MP3");
    }

    @Override
    public void stop() {
        System.out.println("Parando MP3");
    }
}
