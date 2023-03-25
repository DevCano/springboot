package com.devnaz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		int param1 = 10;
		int param2 = 20;
		int sum = suma(param1, param2);
		System.out.println(sum);
	}

	public static int suma(int a, int b) {
		return a + b;
	}

}

class Potato {
	public int brazos = 0;

	public void QuitarBrazo() {
		this.brazos--;
	}
}
