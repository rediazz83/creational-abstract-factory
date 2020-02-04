package com.patterns.abstractfactory.factory.impl;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.AutomovilElectricidad;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.domain.ScooterElectricidad;
import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;
import com.patterns.abstractfactory.factory.AbstractFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fabricaElectricidad")
public class VehiculoElectricidadImpl implements AbstractFactory {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio, TipoVehiculoEnum tipoVehiculo) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio, tipoVehiculo);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia, TipoVehiculoEnum tipoVehiculo) {
        return new ScooterElectricidad(modelo, color, potencia, tipoVehiculo);
    }
}
