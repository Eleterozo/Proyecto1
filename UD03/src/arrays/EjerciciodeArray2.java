package arrays;
import java.util.Scanner;
public class EjerciciodeArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		String [] a={"María","Jesús","Martín","Dante","Caliban"};
		int menu, cantidad = 4;
		String nombre;
		boolean encontrado=false;
		double sum;
		
		do {
			System.out.println("--------Menu-------\n1.-Salir\n2.-Mostrar lista\n3.-Pedir un nombre y contar las veces que aparece\n4.-Pedir un nombre y decir si existe\n5.-Eliminar. Pedir un nombre y en el lugar de ese nombre introducir “null”");
			menu=teclado.nextInt();
			sum=0;
			switch(menu) {
				case 1:
					System.out.println("¡Adios!");
					break;
				case 2:
					for(int i=0;i<a.length;i++) {
						System.out.println(a[i]);
					}
				case 3:
					System.out.println("Introduce el nombre a buscar");
					nombre=teclado.next();
					for(int i=0;i<a.length;i++) {
						if(nombre.equals(a[i])) {
							cantidad++;
							
						}
					}
					System.out.println("El nombre:"+nombre+" está "+cantidad+" veces");
					break;
				case 4:
					System.out.println("Introduce el nombre: ");
					nombre=teclado.next();
					
					for(int i=0; i<a.length && !encontrado;i++) {
						if(nombre.equals(a[i])) {
							encontrado=true;
						}
					}
					
						
					break;
				case 5:
					System.out.println("Introduce el nombre: ");
					nombre=teclado.next();
					
					for(int i=0; i<a.length && !encontrado;i++) {
						if(nombre.equals(a[i])) {
							encontrado=true;
							a[i]=null;
						}
					}
					if(encontrado) {
						System.out.println("Borrado");
					}else { 
						System.out.println("No borrado");
					}
					break;
				default:
					System.out.println("¡¡ERROR!! Elija una opcion del menu.");
					break;
			}
		}while(menu!=1);
		teclado.close();
		}
		
	}

