package com.devnaz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Primera parte:
// Crear una función con tres parámetros que sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.

// Segunda parte:
// Crear una clase coche.
// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// Una función que incremente el número de puertas que tiene el coche.
// Crear un objeto miCoche en el main y añadirle una puerta.
// Mostrar el número de puertas que tiene el objeto.

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		int param1 = 10;
		int param2 = 20;
		int param3 = 20;
		int sum = suma(param1, param2, param3);
		System.out.println(sum);

		Coche miCoche = new Coche();
		miCoche.AnadirPuerta();
		System.out.println(miCoche.puertas);
	}

	public static int suma(int a, int b, int c) {
		return a + b + c;
	}

}

class Coche {
	public int puertas = 0;

	public void AnadirPuerta() {
		this.puertas++;
	}
}
