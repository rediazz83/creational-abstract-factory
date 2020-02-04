package com.patterns.abstractfactory.emuns;

import lombok.Getter;

@Getter
public enum TipoVehiculoEnum {
    ELECTRICIDAD(1, "Vehiculo Electrico"), GASOLINA(2, "Vehiculo Gasolina");

    private int clave;
    private String valor;

    TipoVehiculoEnum(int clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }
}
