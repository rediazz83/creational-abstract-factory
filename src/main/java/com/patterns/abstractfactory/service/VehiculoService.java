package com.patterns.abstractfactory.service;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.factory.AbstractFactory;

import java.util.List;

public interface VehiculoService {

    List<Automovil> crearAutomoviles(AbstractFactory fabrica);

    List<Scooter> crearScooters(AbstractFactory fabrica);
}
