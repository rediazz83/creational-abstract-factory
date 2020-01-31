package com.patterns.abstractfactory.domain;

public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ScooterGasolina{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
