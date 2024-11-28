package proyecto1;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double euros;
		double interes;
		int dias;
		System.out.println("Inserta una cantidad de euros: ");
		euros= teclado.nextDouble();
		System.out.println("Introduce un tipo de interes: ");
		interes= teclado.nextDouble();
		System.out.println("Introduce dias: ");
		dias = teclado.nextInt();
		System.out.println("Interes producido es de "+(euros*interes*dias)/(360*100)+ " %" );
		teclado.close();
	}
}