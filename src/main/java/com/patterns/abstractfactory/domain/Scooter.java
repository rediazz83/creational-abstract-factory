package com.patterns.abstractfactory.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Scooter {

    protected String modelo;
    protected String color;
    protected int potencia;

    public abstract void mostrarCaracteristicas();
}
