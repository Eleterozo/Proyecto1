package Pruebadeexamen;
import java.util.Scanner;
public class Pruebadeexamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double primero, segundo, tercer;
		int edad;
		int abc;
		int menu;
		int contraseña;
		String nombre;
		String apellido;
		int manzana;
		int fruta;
		System.out.println("Introduce el nombre:");
		nombre = teclado.next(); 
		System.out.println("Introduce apellido:");
		apellido = teclado.next();
		System.out.println("Introduce la edad:");
		edad = teclado.nextInt();
		if (edad<18) {
			System.out.println("No puedes introducirte en el sistema");
		}
		else {
			
			System.out.println("Bienvenido "+nombre+apellido+" a la fruteria");
			System.out.println("1.Realizar una nueva compra");
			System.out.println("2.Comprobar si existe fruta");
			System.out.println("3.Introducir fruta");
			System.out.println("4.Salir");
			System.out.println("¿Que quieres realizar?");
			menu = teclado.nextInt();
			}

			switch (menu) {
				case 1:
					do {
					System.out.println("**Realizar compra**");
					System.out.println("Escribe el primer precio ");
					primero = teclado.nextDouble();
					System.out.println("Escribe el segundo precio ");
					segundo = teclado.nextDouble();
					System.out.println("Escribe el tercer precio ");
					tercer = teclado.nextDouble();
						while (primero <= 0 || segundo <= 0 || tercer <= 0) {
							System.out.println("No se pueden escribir numeros negativos.");
							System.out.println("Escribe el primer precio ");
							primero = teclado.nextDouble();
							System.out.println("Escribe el segundo precio ");
							segundo = teclado.nextDouble();
							System.out.println("Escribe el tercer precio ");
							tercer = teclado.nextDouble();
							
						}
						System.out.println("El total es: " +(primero+segundo+tercer));
						
					}
					break;
					
			
					
					
				case 2:
					System.out.println("**Comprobar si existe fruta **");
					System.out.println("Introduce el nombre de una fruta");
					fruta = teclado.nextInt();
					if (fruta==manzana){
						System.out.println("Si tenemos esa fruta");
					}else 
					{System.out.println("No tenemos esa fruta");}
					break;
					
					
					
					
					
					
				case 3:
					System.out.println("**Introducir fruta**");
					if (abc==contraseña){
						System.out.println("Eres administrador");
						System.out.println("Introduce el nombre de la fruta:");
						fruta = teclado.nextInt();
						System.out.println("La fruta"+fruta+" se ha guardado :");
						
					}else 
					{System.out.println("No tenemos esa fruta");}
					break;
					
					
					
				case 4:
					System.out.println("**Salir**");
					System.out.println("Hasta luego"+nombre+"");
					break;
			}
			
			teclado.close();
	}
		
}
