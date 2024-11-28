package bucles;
import java.util.Scanner;
public class Ejerciciobucle8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String DNI, nombre, apellido, stock, repetir1;
		int edad, menu;
		double precio1, precio2;
		System.out.println("Escriba su DNI: ");
		DNI = teclado.next();
		System.out.println("Escriba su nombre: ");
		nombre = teclado.next();
		System.out.println("Escriba sus apellidos: ");
		apellido = teclado.next();
		System.out.println("Escriba su edad: ");
		edad = teclado.nextInt();
		if (edad > 18) {
			System.out.println("Bienvenido/a " +nombre +apellido +"! Que es lo que quieres hacer?");
			System.out.println("1.Comprar libro");
			System.out.println("2.Comprobar si hay stock");
			System.out.println("3.Salir del programa");
			menu = teclado.nextInt();
			
			switch (menu) {
				case 1:
					do {
					System.out.println("Escriba el precio del primer libro");
					precio1 = teclado.nextDouble();
					System.out.println("Escriba el precio del segundo libro");
					precio2 = teclado.nextDouble();
					while (precio1 <= 0 || precio2 <= 0) {
						System.out.println("No se pueden escribir numeros negativos.");
						System.out.println("Escriba el precio del primer libro");
						precio1 = teclado.nextDouble();
						System.out.println("Escriba el precio del segundo libro");
						precio2 = teclado.nextDouble();
						
					}
					System.out.println("El total es: " +(precio1+precio2));
					System.out.println("Quieres repetir el programa");
					repetir1 = teclado.next();
					while (!repetir1.equalsIgnoreCase("no") && !repetir1.equalsIgnoreCase("si")) {
						System.out.println("Error! Quiere seguir el programa? SI/NO");
						repetir1 = teclado.next();
					}
					
					} while (repetir1.equals("si"));
					
				break;
				
				case 2:
					do {
					System.out.println("Cual es el nombre del libro que quiere comprobar? ");
					stock = teclado.next();
					if (stock.equalsIgnoreCase("Tiburon")) {
						System.out.println("Ese libro está disponible");
					}
					else {
						System.out.println("Ese libro no está disponible");
						
					}
					
					System.out.println("Quieres repetir el programa");
					repetir1 = teclado.next();
					while (!repetir1.equalsIgnoreCase("no") && !repetir1.equalsIgnoreCase("si")) {
						System.out.println("Error! Quiere seguir el programa? SI/NO");
						repetir1 = teclado.next();
					}
					
					} while (repetir1.equals("si"));

					
				break;
				case 3:
					System.out.println("Adios, que tenga un buen Dia!");
				break;
				default:
					System.out.println("Escriba una opcion vlida por favor");
			}
		}
		else {
			System.out.println("Debes tener mas de 18 años");
		}
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
