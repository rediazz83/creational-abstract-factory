package com.patterns.abstractfactory.service.impl;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.emuns.TipoFabricaEnum;
import com.patterns.abstractfactory.factory.AbstractFactory;
import com.patterns.abstractfactory.factory.GeneradorFabrica;
import com.patterns.abstractfactory.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehiculoServiceImpl implements VehiculoService {

    public static final int CANTIDAD_AUTOS = 3;
    public static final int CANTIDAD_SCOOTERS = 2;

    public List<Automovil> crearAutomoviles(AbstractFactory fabrica) {
        List<Automovil> autos = new ArrayList<>();
        for(int index = 0; index < CANTIDAD_AUTOS; index++) {
            autos.add(fabrica.creaAutomovil("estandar", "amarillo", 6+index, 3.2));
        }

        return autos;
    }

    public List<Scooter> crearScooters(AbstractFactory fabrica) {
        List<Scooter> scooters = new ArrayList<>();
        for(int index = 0; index < CANTIDAD_SCOOTERS; index++) {
            scooters.add(fabrica.creaScooter("clasico", "rojo", 2+index));
        }

        return scooters;
    }
}
