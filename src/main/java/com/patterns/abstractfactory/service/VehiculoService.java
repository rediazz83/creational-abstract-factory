package com.patterns.abstractfactory.service;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.emuns.TipoFabricaEnum;

import java.util.List;

public interface VehiculoService {

    List<Automovil> crearAutomoviles(TipoFabricaEnum tipoFabrica) throws ClassNotFoundException;

    List<Scooter> crearScooters(TipoFabricaEnum tipoFabrica) throws ClassNotFoundException;
}
