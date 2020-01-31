package com.patterns.abstractfactory.factory;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;

public interface FabricaVehiculo {

    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

    Scooter creaScooter(String modelo, String color, int potencia);
}
