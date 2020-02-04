package com.patterns.abstractfactory.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.patterns.abstractfactory.emuns.TipoVehiculoEnum;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public abstract class Scooter {

    protected String modelo;
    protected String color;
    protected int potencia;
    protected TipoVehiculoEnum tipoVehiculo;

    public abstract void mostrarCaracteristicas();
}
