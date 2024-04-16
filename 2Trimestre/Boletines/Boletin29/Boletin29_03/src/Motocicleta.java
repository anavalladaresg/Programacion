public class Motocicleta implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La motocicleta está arrancando");
    }

    @Override
    public void detener() {
        System.out.println("La motocicleta se está deteniendo");
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando");
    }
}