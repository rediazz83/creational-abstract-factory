package com.patterns.abstractfactory;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.emuns.TipoFabricaEnum;
import com.patterns.abstractfactory.factory.AbstractFactory;
import com.patterns.abstractfactory.factory.GeneradorFabrica;
import com.patterns.abstractfactory.service.VehiculoService;
import com.patterns.abstractfactory.service.impl.VehiculoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AbstractfactoryApplication implements CommandLineRunner {

    @Autowired
    private VehiculoService service;

	@Autowired
	private GeneradorFabrica generador;

	private AbstractFactory fabrica;

	public static void main(String[] args) {
		SpringApplication.run(AbstractfactoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fabrica = generador.generarFabrica(consultarIntencion());

        List<Automovil> autos = service.crearAutomoviles(fabrica);
        autos.stream().forEach(automovil -> automovil.mostrarCaracteristicas());

        List<Scooter> scooters = service.crearScooters(fabrica);
        scooters.stream().forEach(scooter -> scooter.mostrarCaracteristicas());
	}

	private TipoFabricaEnum consultarIntencion() throws Exception {
		Scanner reader = new Scanner(System.in);
		System.out.println("Desea crear vehiculos electricos (1) o a gasolina (2) ?");

		return TipoFabricaEnum.buscarTipoVehiculo(Integer.parseInt(reader.next()));
	}
}
