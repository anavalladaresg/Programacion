public class Coche implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando");
    }

    @Override
    public void detener() {
        System.out.println("El coche se está deteniendo");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando");
    }
}