package com.patterns.abstractfactory.domain;

public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ScooterElectricidad{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
