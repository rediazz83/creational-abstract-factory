package com.patterns.abstractfactory.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Automovil {

    protected String modelo;
    protected String color;
    protected int potencia;
    protected double espacio;

    public abstract void mostrarCaracteristicas();
}
