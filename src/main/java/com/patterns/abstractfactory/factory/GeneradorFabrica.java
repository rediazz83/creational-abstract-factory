package com.patterns.abstractfactory.factory;

import com.patterns.abstractfactory.emuns.TipoFabricaEnum;

public interface GeneradorFabrica {

    AbstractFactory generarFabrica(TipoFabricaEnum tipoFabrica) throws ClassNotFoundException;
}
