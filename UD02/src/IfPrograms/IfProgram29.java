package IfPrograms;
import java.util.Scanner;
public class IfProgram29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int menu;
		double primero, segundo;
		System.out.println("Escribe el primer operador ");
		primero = teclado.nextDouble();
		System.out.println("Escribe el segundo operador ");
		segundo = teclado.nextDouble();
		System.out.println("elige una opcion ");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Resto (%)");
		System.out.println("0.Salir");
		menu = teclado.nextInt();

		if (menu == 1) {
			System.out.println("El resultado de la suma es "+(primero+segundo));
		}
		else if (menu == 2) {
			System.out.println("El resultado de la resta es "+(primero-segundo));
		}
		else if (menu == 3) {
			System.out.println("El resultado de la multiplicacion es "+(primero*segundo));
		}
		else if (menu == 4) {
			System.out.println("El resultado de la division es "+(primero/segundo));
		}
		else if (menu == 5) {
			System.out.println("El resultado del resto es "+(primero%segundo));
		}
		else if (menu == 0) {
			System.out.println("Hasta luego!");
		}
		else if (menu > 5) {
			System.out.println("No existe esa opcion");
		}
		teclado.close();
	}

}
