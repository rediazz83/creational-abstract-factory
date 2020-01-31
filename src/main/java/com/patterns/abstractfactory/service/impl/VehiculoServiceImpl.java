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

    @Autowired
    private GeneradorFabrica generador;

    private AbstractFactory fabrica;

    public List<Automovil> crearAutomoviles(TipoFabricaEnum tipoFabrica) throws ClassNotFoundException {
        fabrica = generador.generarFabrica(tipoFabrica);
        List<Automovil> autos = new ArrayList<>();
        for(int index = 0; index < 3; index++) {
            autos.add(fabrica.creaAutomovil("estandar", "amarillo", 6+index, 3.2));
        }

        return autos;
    }

    public List<Scooter> crearScooters(TipoFabricaEnum tipoFabrica) throws ClassNotFoundException {
        fabrica = generador.generarFabrica(tipoFabrica);
        List<Scooter> scooters = new ArrayList<>();
        for(int index = 0; index < 2; index++) {
            scooters.add(fabrica.creaScooter("clasico", "rojo", 2+index));
        }

        return scooters;
    }
}
