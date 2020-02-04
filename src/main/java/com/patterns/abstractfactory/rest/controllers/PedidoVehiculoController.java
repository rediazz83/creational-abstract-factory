package com.patterns.abstractfactory.rest.controllers;

import com.patterns.abstractfactory.rest.responses.PedidoVehiculoResponse;
import com.patterns.abstractfactory.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculos")
public class PedidoVehiculoController {

    @Autowired
    @Qualifier("vehiculoElectricoService")
    private VehiculoService vehiculoElectricoService;

    @Autowired
    @Qualifier("vehiculoGasolinaService")
    private VehiculoService vehiculoGasolinaService;

    /*http://localhost:8080/vehiculos/electricos?cantidadAutos={cantidadAutos}&cantidadScooters={cantidadScooters}*/
    @GetMapping("/electricos")
    public PedidoVehiculoResponse pedirVehiculosElectricos(@RequestParam(value = "cantidadAutos") int cantidadAutos,
                                                           @RequestParam(value = "cantidadScooters") int cantidadScooters) {
        return vehiculoElectricoService.crearVehiculos(cantidadAutos, cantidadScooters);
    }

    /*http://localhost:8080/vehiculos/gasolina?cantidadAutos={cantidadAutos}&cantidadScooters={cantidadScooters}*/
    @GetMapping("/gasolina")
    public PedidoVehiculoResponse pedirVehiculosGasolina(@RequestParam(value = "cantidadAutos") int cantidadAutos,
                                                         @RequestParam(value = "cantidadScooters") int cantidadScooters) {
        return vehiculoGasolinaService.crearVehiculos(cantidadAutos, cantidadScooters);
    }
}
