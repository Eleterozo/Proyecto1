package switchCase;

import java.util.Scanner;

public class SwitchCase01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String menu;
		double primero, segundo;
		System.out.println("Escribe el primer operador ");
		primero = teclado.nextDouble();
		System.out.println("Escribe el segundo operador ");
		segundo = teclado.nextDouble();
		System.out.println("elige una opcion ");
		System.out.println("a.Sumar");
		System.out.println("b.Restar");
		System.out.println("c.Multiplicar");
		System.out.println("d.Dividir");
		System.out.println("e.Resto (%)");
		System.out.println("0.Salir");
		menu = teclado.next();

		switch (menu) {
			case "a":
				System.out.println("El resultado de la suma es "+(primero+segundo));
				break;
			case "b":
				System.out.println("El resultado de la resta es "+(primero-segundo));
				break;
			case "c":
				System.out.println("El resultado de la multiplicacion es "+(primero*segundo));
				break;
			case "d":
				System.out.println("El resultado de la division es "+(primero/segundo));
				break;
			case "e":
				System.out.println("El resultado del resto es "+(primero%segundo));
				break;
			case "0":
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("No No no");
		}
		teclado.close();
	}

}
