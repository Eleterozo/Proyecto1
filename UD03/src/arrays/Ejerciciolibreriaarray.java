package arrays;
import java.util.Scanner;
public class Ejerciciolibreriaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String[] a= new String [20];
		int menu, salir=0;
		String si, no, opcion;
		si="Si";
		no="No";
		a [0]="nada";
		a [1]="Tímidamente de la oscuridad a la luz";
		a [2]="Pájaros a golpes";
		a [3]="Caperucita Roja";
		a [4]="12 cuentos clásicos ";
		a [5]="Pepe y Mila";
		a [6]="Enojaos";
		a [7]="En casa vacía";
		a [8]="123";
		a [9]="Día Negro";
		a [10]="El Hobbit";
		a [11]="Calle Judía";
		
		int[] b= new int [20];
		
		b [0]=15;
		b [1]=12;
		b [2]=15;
		b [3]=25;
		b [4]=19;
		b [5]=17;
		b [6]=25;
		b [7]=13;
		b [8]=11;
		b [9]=18;
		b [10]=25;
		b [11]=35;
		System.out.println("Bienvenido usuario");
		do {
			System.out.println("--------Menu-------\n1.-Mostrar el título de todos los libros.\n2.-Mostrar el título y el precio de todos los libros.\n3.-Mostrar el precio de un libro.\n4.-Introducir un nuevo libro.\n5.-Eliminar un libro.\n6.-Modificar el precio de un libro.\n7.-Modificar el título de un libro.\n8.-Salir del programa.");
			menu=teclado.nextInt();
			switch(menu) {
				case 1:
					
					
					
					
					
					
					
					
					do {
						System.out.println("¿Quieres continuar en el programa? SI / NO");
						opcion=teclado.next();
						if (opcion.equalsIgnoreCase(si)) {
						}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
						salir++;
						}
						}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
					
					break;
				case 2:
					
					
					
					
					
					
					do {
						System.out.println("¿Quieres continuar en el programa? SI / NO");
						opcion=teclado.next();
						if (opcion.equalsIgnoreCase(si)) {
						}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
						salir++;
						}
						}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
					break;
				case 3:
					
					
					
					
					
					
					
					do {
						System.out.println("¿Quieres continuar en el programa? SI / NO");
						opcion=teclado.next();
						if (opcion.equalsIgnoreCase(si)) {
						}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
						salir++;
						}
						}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
					break;
				case 4:
					
					
					
					
					
					
					
					
					
					
					do {
						System.out.println("¿Quieres continuar en el programa? SI / NO");
						opcion=teclado.next();
						if (opcion.equalsIgnoreCase(si)) {
						}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
						salir++;
						}
						}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
					break;
				case 5:
					
					
					
					
					
					
					
					
					
					
					do {
						System.out.println("¿Quieres continuar en el programa? SI / NO");
						opcion=teclado.next();
						if (opcion.equalsIgnoreCase(si)) {
						}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
						salir++;
						}
						}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
					break;
				case 6:
					
					
					
					
					
					
					
					do {
						System.out.println("¿Quieres continuar en el programa? SI / NO");
						opcion=teclado.next();
						if (opcion.equalsIgnoreCase(si)) {
						}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
						salir++;
						}
						}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
						break;
				case 7:
					
					
					
					
					
					
					do {
					System.out.println("¿Quieres continuar en el programa? SI / NO");
					opcion=teclado.next();
					if (opcion.equalsIgnoreCase(si)) {
					}if (opcion.equalsIgnoreCase(no)) {System.out.println("¡Adios!");
					salir++;
					}
					}while(!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
					break;
				case 8:
					salir++;
					System.out.println("¡Adios!");
					break;
			}
		}while(salir==0);
		teclado.close();
	}
}

		
