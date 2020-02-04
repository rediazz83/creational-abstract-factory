package com.patterns.abstractfactory.rest.responses;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
public class PedidoVehiculoResponse implements Serializable {

    private List<Automovil> automoviles;
    private List<Scooter> scooters;
}
