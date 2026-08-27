public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private int velocidad;
    private boolean encendido;

    public void frenar(int decremento) {
        if (encendido) {
            velocidad -= decremento;
            if (velocidad < 0) {
                velocidad = 0;
            }
            System.out.println("Has frenado. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("El vehículo está apagado.");
        }
    }
}