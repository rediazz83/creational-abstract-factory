package com.patterns.abstractfactory.factory.impl;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.AutomovilGasolina;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.domain.ScooterGasolina;
import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;
import com.patterns.abstractfactory.factory.AbstractFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fabricaGasolina")
public class VehiculoGasolinaImpl implements AbstractFactory {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio, TipoVehiculoEnum tipoVehiculo) {
        return new AutomovilGasolina(modelo, color, potencia, espacio, tipoVehiculo);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia, TipoVehiculoEnum tipoVehiculo) {
        return new ScooterGasolina(modelo, color, potencia, tipoVehiculo);
    }
}
