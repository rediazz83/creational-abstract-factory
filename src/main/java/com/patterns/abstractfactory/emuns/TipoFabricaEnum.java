package com.patterns.abstractfactory.emuns;


import java.util.Arrays;
import java.util.function.Supplier;

public enum TipoFabricaEnum {
    ELECTRICIDAD(1, "Vehiculo Electrico"), GASOLINA(2, "Vehiculo Gasolina");

    private int clave;
    private String valor;

    TipoFabricaEnum(int clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public int getClave() {
        return this.clave;
    }

    public static TipoFabricaEnum buscarTipoVehiculo(int clave) throws Exception {
        return Arrays.stream(TipoFabricaEnum.values())
                .filter(tipoFabrica -> tipoFabrica.clave == clave).findFirst().orElseThrow(Exception::new);
    }
}
