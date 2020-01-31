package com.patterns.abstractfactory.factory.impl;

import com.patterns.abstractfactory.emuns.TipoFabricaEnum;
import com.patterns.abstractfactory.factory.AbstractFactory;
import com.patterns.abstractfactory.factory.GeneradorFabrica;

public class GeneradorFabricaImpl implements GeneradorFabrica {

    private static final int VEHICULO_ELECTRICO = 1;
    private static final int VEHICULO_GASOLINA = 2;

    @Override
    public AbstractFactory generarFabrica(TipoFabricaEnum tipoFabrica) throws ClassNotFoundException {
        switch(tipoFabrica.getClave()) {
            case VEHICULO_ELECTRICO:
                return new VehiculoElectricidadImpl();
            case VEHICULO_GASOLINA:
                return new VehiculoGasolinaImpl();
            default:
                throw new ClassNotFoundException("No existe tipo de fabrica");
        }
    }
}
