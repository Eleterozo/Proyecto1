package proyecto1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double tempC;
		System.out.print("Introduce la temperatura en grados Celsius:");
		tempC = teclado.nextDouble();
		System.out.println("......");
		System.out.println("Fahrenheit:"+(1.8*tempC+32)+"ºF");
		System.out.println("kelvin:"+(tempC+273)+"k");
		teclado.close();
	}

}
