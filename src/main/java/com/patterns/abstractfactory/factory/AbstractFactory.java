package com.patterns.abstractfactory.factory;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;

public interface AbstractFactory {

    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio, TipoVehiculoEnum tipoVehiculo);

    Scooter creaScooter(String modelo, String color, int potencia, TipoVehiculoEnum tipoVehiculo);
}
