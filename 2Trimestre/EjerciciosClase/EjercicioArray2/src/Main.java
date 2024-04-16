public class Main {
    public static void main(String[] args) {
        // Crear un array con los nombres de los días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Ejemplo de uso
        int numeroDia = 7; // Puedes cambiar este número para probar con diferentes días

        // Verificar el número y obtener el nombre del día
        if (numeroDia >= 1 && numeroDia <= 7) {
            int indice = numeroDia - 1;
            String nombreDia = diasSemana[indice];
            System.out.println("El día " + numeroDia + " es " + nombreDia);
        } else {
            System.out.println("Número de día no válido. Por favor, proporciona un número entre 1 y 7.");
        }
    }
}