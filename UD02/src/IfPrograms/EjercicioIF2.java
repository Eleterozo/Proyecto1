package UD02;
import java.util.Scanner;
public class EjercicioIF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double euros;
		
		System.out.println("Cuanto es la cantidad?");
		euros = teclado.nextDouble();
		if (euros<20000) {
			System.out.println("El IVA es 7%");
		}
		else {
			System.out.println("E1 IVA es 16%");
		}
		
		teclado.close();
	}

}
