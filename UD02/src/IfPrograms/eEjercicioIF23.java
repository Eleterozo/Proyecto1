package IfPrograms;
import java.util.Scanner;
public class eEjercicioIF23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double primero;
		double segundo;
		
		System.out.print("Escribe el primer numero: ");
		primero = teclado.nextDouble();
		System.out.print("Escribe el segudno numero: ");
		segundo = teclado.nextDouble();
		
		if (primero>segundo) {
			System.out.print("El primer numero es mayor que el segudo");
		}
		else if (segundo>primero) {
			System.out.print("El segundo numero es mayor que el segudo");

		}
		else {
			System.out.print("Los numero son iguales");
		}
			
			
		
		teclado.close();

		
	}

}
