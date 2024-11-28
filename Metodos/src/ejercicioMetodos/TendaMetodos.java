package ejercicioMetodos;
import java.util.Scanner;
public class TendaMetodos {
Scanner teclado = new Scanner(System.in);

		
public static void mostrarProductos (String libros[], double precio[]) {
		
		for (int i = 0; i<libros.length && libros[i]!=null;i++) {
			
			System.out.println(libros[i]+" cuesta "+precio[i]+"€");
		}
}
	





public static void nuevoArt(String libros[], double precio[], double precios,	String libro ) {
	Scanner teclado = new Scanner(System.in);
	boolean enc=false;
	System.out.println("Introduce el nombre del articulo:");
	libro=teclado.nextLine();
	
	System.out.println("Introduce su precio");
	precios=teclado.nextDouble();
	
	for (int i = 0;i<libros.length && enc==false;i++) {
		
		if (i>libros.length) {
			System.out.println("No tienes espacio");
			enc=true;
		}
			if (libros[i]==null && enc==false) {
				libros[i]=libro;
				precio[i]=precios;
				enc=true;
			}
			
			
		if (libro.equalsIgnoreCase(libros[i]) && enc==false) {
			System.out.println("Ese articulo ya existe");
			enc=true;
		}
	}
	
} 
	


public static void obtenerPrecios(String libros[], double precio[], String producto, boolean enc=false) {
				Scanner teclado = new Scanner(System.in);
				System.out.println("¿Cual es e nombre del producto?");
				producto=teclado.nextLine();

				for (int i = 0;i<libros.length && enc==false;i++) {

				}

}








	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String libros[] = new String[]{"Dandadan","Berserk","El señor de los anillos","Dragon ball","Nacidos de la bruma","El principe de la niebla","El detective esqueleto",null,null,null};
		double precio[] = new double[] {22,25,26,21,17,24,30,0,0,0};
		int menu;
		do {
		System.out.println("*****************************************************");
		System.out.println("1.- Añadir artículos y precios");
		System.out.println("2.- Mostrar productos de la tienda");
		System.out.println("3.- Obtener el precio de un producto");
		System.out.println("4.- Obtener el IVA de un producto");
		System.out.println("5.- Modificar el precio de un producto");
		System.out.println("6.- Eliminar un producto");
		System.out.println("7. Salir");
		System.out.println("¿Que quieres hacer?");
		menu = teclado.nextInt();
		switch (menu) {
		case 1:
			nuevoArt(libros,precio);
			break;
		case 2:
			mostrarProductos(libros,precio);
			break;
		case 3:
			obtenerPrecios(libros,precio);
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
			
			default:
		}
		
		}while(menu!=7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}

