package com.patterns.abstractfactory.factory;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.AutomovilGasolina;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.domain.ScooterGasolina;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }
}
