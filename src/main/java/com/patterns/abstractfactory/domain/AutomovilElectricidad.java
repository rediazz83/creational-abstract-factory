package com.patterns.abstractfactory.domain;

import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio, TipoVehiculoEnum tipoVehiculo) {
        super(modelo, color, potencia, espacio, tipoVehiculo);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "AutomovilElectricidad{" +
                "modelo='" + modelo + '\'' +
                ", tipoVehiculo='" + tipoVehiculo.getValor() + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                ", espacio=" + espacio +
                '}';
    }
}
