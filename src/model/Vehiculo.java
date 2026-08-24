package model;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int anyo;
    private int velocidad;
    private boolean encendido;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Método para encender
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El vehículo " + marca + " " + modelo + " se ha encendido." "es de color " + color + " y es del año " + anyo);
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }

}
