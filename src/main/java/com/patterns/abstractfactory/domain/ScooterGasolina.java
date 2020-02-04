package com.patterns.abstractfactory.domain;

import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;

public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia, TipoVehiculoEnum tipoVehiculo) {
        super(modelo, color, potencia, tipoVehiculo);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ScooterGasolina{" +
                "modelo='" + modelo + '\'' +
                ", tipoVehiculo='" + tipoVehiculo.getValor() + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
