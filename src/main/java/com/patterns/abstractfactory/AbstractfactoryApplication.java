package com.patterns.abstractfactory;

import com.patterns.abstractfactory.domain.Automovil;
import com.patterns.abstractfactory.domain.Scooter;
import com.patterns.abstractfactory.factory.FabricaVehiculo;
import com.patterns.abstractfactory.factory.FabricaVehiculoElectricidad;
import com.patterns.abstractfactory.factory.FabricaVehiculoGasolina;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AbstractfactoryApplication implements CommandLineRunner {

	private FabricaVehiculo fabrica;

	public static void main(String[] args) {
		SpringApplication.run(AbstractfactoryApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello world!");

		switch(consultarIntencion()) {
            case "1":
                fabrica = new FabricaVehiculoElectricidad();
                break;
            case "2":
                fabrica = new FabricaVehiculoGasolina();
                break;
        }

        Automovil[] autos = new Automovil[3];
        for(int index = 0; index < autos.length; index++) {
            autos[index] = fabrica.creaAutomovil("estandar", "amarillo", 6+index, 3.2);
        }

        for (Automovil auto: autos) {
            System.out.println(auto.toString());
        }

        Scooter[] scooters = new Scooter[2];
        for(int index = 0; index < scooters.length; index++) {
            scooters[index] = fabrica.creaScooter("clasico", "rojo", 2+index);
        }

        for (Scooter scooter: scooters) {
            System.out.println(scooter.toString());
        }
	}

	private String consultarIntencion() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Desea crear vehiculos electricos (1) o a gasolina (2) ?");
		return reader.next();
	}
}
