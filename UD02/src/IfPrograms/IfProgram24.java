package IfPrograms;
import java.util.Scanner;
public class IfProgram24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double sueldo;
		
		System.out.print("Cual es tu sueldo? ");
		sueldo = teclado.nextDouble();
		
		if (sueldo<1000.00) {
			System.out.print("La retencion del sueldo es: " +(sueldo-(sueldo*10/100)));
		}
		else if (sueldo==1000.00) {
			System.out.print("La retencion del sueldo es: " +(sueldo-(sueldo*12/100)));
		}
		else if (sueldo>1000.00) {
			System.out.print("La retencion del sueldo es: " +(sueldo-(sueldo*14/100)));
		}	
		teclado.close();
	}

}
