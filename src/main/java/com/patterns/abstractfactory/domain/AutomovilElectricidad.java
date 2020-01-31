package com.patterns.abstractfactory.domain;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "AutomovilElectricidad{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                ", espacio=" + espacio +
                '}';
    }
}
