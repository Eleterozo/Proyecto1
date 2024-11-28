package EjercicioArray;
import java.util.Scanner;
public class TiendaLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[]a = new String [20];
		int[]b = new int [20];
		String salir="no", libro;
		int menu, j = 0;
		boolean enc=false;
		int precio;
		a[0]="Nada";
		a[1]="Tímidamente de la oscuridad a la luz";
		a[2]="Pajaros a golpes";
		a[3]="Caperucita Roja";
		a[4]="12 cuentos clasicos";
		a[5]="Pepe y Mila";
		a[6]="Enojaos";
		a[7]="En casa vacia";
		a[8]="123";
		a[9]="Dia Negro";
		a[10]="El Hobbit";
		a[11]="Calle Judia";
		b[0]=15;
		b[1]=12;
		b[2]=15;
		b[3]=25;
		b[4]=19;
		b[5]=17;
		b[6]=25;
		b[7]=13;
		b[8]=11;
		b[9]=18;
		b[10]=28;
		b[11]=35;
		do {
		System.out.println("1.- Mostrar el título de todos los libros.\r\n"
				+ "2.- Mostrar el título y el precio de todos los libros.\r\n"
				+ "3.- Mostrar el precio de un libro.\r\n"
				+ "4- Introducir un nuevo libro.\r\n"
				+ "5.- Eliminar un libro.\r\n"
				+ "6.- Modificar el precio de un libro.\r\n"
				+ "7.- Modificar el título de un libro.\r\n"
				+ "8.- Salir del programa");
		menu = teclado.nextInt();
		switch (menu) {
			case 1:
				for (int i = 0; i<=a.length-1;i++) {
					if (a[i]!=null) {
						System.out.println(a[i]);
					}
					
				}
				System.out.println("Quieres salir del programa?");
				salir = teclado.next();
				
				break;
			case 2:
				for (int i = 0; i<a.length&&a[i]!=null;i++) {
					
						System.out.println("El precio del libro "+a[i]+" es "+b[i]+"€");
					
				}
				System.out.println("Quieres salir del programa?");
				salir = teclado.next();
				
				break;
			case 3:
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro = teclado.nextLine();
				for (int i = 0; i< a.length; i++) {
					if (libro.equalsIgnoreCase(a[i])) {
						System.out.println("El precio del libro "+a[i]+" es "+b[i]+"€" );
					}
					
				}
				System.out.println("Quieres salir del programa?");
				salir = teclado.next();
				
				break;
			case 4:
				enc=false;
				
				 do {
					if (a[j]==null) {
						System.out.println("¿Cuál es el título del libro? ");
						teclado.nextLine();
						a[j]=teclado.nextLine();
						
						if (b[j]==0) {
							System.out.println("¿Cuál es el precio del libro? ");
							b[j]=teclado.nextInt();
							enc=true;

						
						}
						if (a[19]!=null) {
							System.out.println("Tienes muchos libros en la tienda, elimina un libro.");
						}
					}
				
					j++;
					
				}while (j<a.length && enc==false);	
				
				 System.out.println("Quieres salir del programa?");
					salir = teclado.next();
					
				break;
			case 5:
				enc=false;
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro = teclado.nextLine();
				for (int i = 0; i < a.length && enc==false; i++) {
				       if (libro.equalsIgnoreCase(a[i])) {
				    	   a[i]=null;
				    	   b[i]=0;
				    	   enc=true;
				       }

				}
				System.out.println("El libro ha sido eliminado correctamente");
				System.out.println("Quieres salir del programa?");
				salir = teclado.next();
				
				break;
			case 6: 
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro = teclado.nextLine();
				for (int i = 0; i<a.length;i++) {
					if (libro.equalsIgnoreCase(a[i])) { 
						System.out.println("El precio del libro "+a[i]+" es "+b[i]+"€");
					}
				}
				System.out.println("¿Cuál es el nuevo precio?");
				precio = teclado.nextInt();
				for (int i = 0; i < a.length-1; i++) {
				       if (libro.equalsIgnoreCase(a[i])) {
				    	   b[i]=precio;
				       }
				}
				System.out.println("El precio ha cambiado");
				for (int i = 0; i<a.length;i++) {
					if (libro.equalsIgnoreCase(a[i])) { 
						System.out.println("El precio del libro "+a[i]+" es "+b[i]+"€");
					}
				}
				System.out.println("Quieres salir del programa?");
				salir = teclado.next();
				
				break;
			case 7: 
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro = teclado.nextLine();
				for (int i = 0; i < a.length-1; i++) {
				       if (libro.equalsIgnoreCase(a[i])) {
				    	   System.out.println("¿Cuál es el nuevo titulo?");
							libro = teclado.nextLine();
							a[i]=libro;
				       }
				}
				System.out.println("El titulo ha cambiado");
				for (int i = 0; i<a.length;i++) {
					if (libro.equalsIgnoreCase(a[i])) { 
						System.out.println("El Nuevo titulo del libro es "+a[i]);
					}
				}
				System.out.println("Quieres salir del programa?");
				salir = teclado.next();
				
				break;
			case 8: 
				System.out.println("Hasta la proxima!");
				salir="si";
				break;
				}
		
			
		}while(salir.equalsIgnoreCase("no"));
		
		
		
		
		
		
		
		
		
		
		teclado.close();
		
	}

}