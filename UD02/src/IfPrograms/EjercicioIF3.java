package IfPrograms;
import java.util.Scanner;
public class EjercicioIF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double numero;
		double cuadrado;
		System.out.print("Cual es el numero que elegiras? ");
		numero = teclado.nextDouble();
		cuadrado = numero*numero;
		if (cuadrado<100) {
			System.out.print("el resultado restante para que llegue a 100 es: " +(100-cuadrado));
		}
		else if (cuadrado>100) {
			System.out.print("el resultado restando 100 es: " +(cuadrado-100));
		}
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
