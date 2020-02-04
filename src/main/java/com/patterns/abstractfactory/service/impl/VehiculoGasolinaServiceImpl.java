package com.patterns.abstractfactory.service.impl;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;
import com.patterns.abstractfactory.factory.AbstractFactory;
import com.patterns.abstractfactory.rest.responses.PedidoVehiculoResponse;
import com.patterns.abstractfactory.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("vehiculoGasolinaService")
public class VehiculoGasolinaServiceImpl implements VehiculoService {

    @Autowired
    @Qualifier("fabricaGasolina")
    private AbstractFactory fabrica;

    public PedidoVehiculoResponse crearVehiculos(int cantidadAutos, int cantidadScooters) {
        return new PedidoVehiculoResponse(crearAutomoviles(cantidadAutos),
                crearScooters(cantidadScooters));
    }

    private List<Automovil> crearAutomoviles(int cantidadAutos) {
        List<Automovil> autos = new ArrayList<>();
        for(int index = 0; index < cantidadAutos; index++) {
            Automovil auto = fabrica.creaAutomovil("estandar", "amarillo", 6+index, 3.2, TipoVehiculoEnum.GASOLINA);
            auto.mostrarCaracteristicas();
            autos.add(auto);
        }

        return autos;
    }

    private List<Scooter> crearScooters(int cantidadScooters) {
        List<Scooter> scooters = new ArrayList<>();
        for(int index = 0; index < cantidadScooters; index++) {
            Scooter scooter = fabrica.creaScooter("clasico", "rojo", 2+index, TipoVehiculoEnum.GASOLINA);
            scooter.mostrarCaracteristicas();
            scooters.add(scooter);
        }

        return scooters;
    }
}
