package com.patterns.abstractfactory.factory.impl;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.AutomovilElectricidad;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.domain.ScooterElectricidad;
import com.patterns.abstractfactory.factory.AbstractFactory;

public class VehiculoElectricidadImpl implements AbstractFactory {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color, potencia);
    }
}
