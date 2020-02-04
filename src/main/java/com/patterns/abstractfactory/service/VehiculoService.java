package com.patterns.abstractfactory.service;

import com.patterns.abstractfactory.rest.responses.PedidoVehiculoResponse;

public interface VehiculoService {

    PedidoVehiculoResponse crearVehiculos(int cantidadAutos, int cantidadScooters);
}
