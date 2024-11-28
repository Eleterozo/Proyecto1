package Examen_21_22;
import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		Libro a[]= new Libro[3];
		int menu=0;
		int contador=0;
		do {
			menu=menu(teclado);
			switch(menu) {
			case 1:
				contador=introducir(teclado, a, contador);
				break;
			case 2:
				if (contador>0) {
					buscarAutor( teclado,a,contador);
				}else {
					System.out.println("No hay Libros");
				}       	 
				break;
			case 3:
				if (contador>0) {
					orderSuperventas(a,contador);
				}else {
					System.out.println("No hay Libros");
				}    
				break;
			case 4:
				if (contador>0) {
					contador=eliminarLibro( teclado, a,contador);
				}else {
					System.out.println("No hay Libros");
				}   	 
				break;
			case 5:
				if (contador>0) {
					mostrar( a,contador);
				}else {
					System.out.println("No hay Libros");
				}       	 
				break;
			case 6:
				if (contador>0) {
					modificar( teclado, a,contador);
				}else {
					System.out.println("No hay Libros");
				}   	 
				break;
			case 7:
				System.out.println("Hasta la proxima!");
				break;

			}
		}while (menu!=7);
	}











	public static int menu(Scanner teclado) {
		int menu;
		System.out.println("1. Introducir los libros");
		System.out.println("2. Mostrar los libros de un autor en concreto");
		System.out.println("3. Ordenar los libros SuperVentas por nÃºmero de ejemplares vendidos");
		System.out.println("4. Eliminar un libro concreto");
		System.out.println("5. Mostrar todos los libros que se han introducido");
		System.out.println("6. modificar libro");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}

	public static int introducir(Scanner teclado, Libro a[], int contador) {
		String respuesta="";
		int ISBN;
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir mÃ¡s Libros ");
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Libro a1=new Libro();
				a[i]=a1;
				System.out.println("Introduce el ISBN del libro?");
				ISBN=teclado.nextInt();
				if(buscarISBN(teclado,ISBN,a,contador)==-1) {
					a[i].setISBN(ISBN);
					System.out.println("Introduce el nombre del libro?");
					a[i].setTitulo(teclado.next());
					System.out.println("Intorduce el nombre del autor ?");
					a[i].setAutor(teclado.next());
					System.out.println("Introduce el numero de ejemplares vendidos?");
					a[i].setVentas(teclado.nextInt());
					System.out.println("Introduce el precio del libro?");
					a[i].setPrecio(teclado.nextInt());
					contador++;
				}else {
					System.out.println("Ya hay un libro con ese ISBN ");
				}
				do {
					System.out.print("Quiere aÃ±adir otro libro?: ");
					respuesta = teclado.next();

					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sÃ­") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones vÃ¡lidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sÃ­") && !respuesta.equalsIgnoreCase("no"));
			}
		}
		return contador;
	}

	public static int buscarPorISBN(Scanner teclado, Libro a[], int contador) {
		int ISBN;
		ISBN=teclado.nextInt();
		for (int i=0; i<contador;i++) {
			if(ISBN==a[i].getISBN()) {
				return i;
			}
		}
		return -1;
	}

	public static int buscarISBN(Scanner teclado,int ISBN, Libro a[], int contador) {
		for (int i=0; i<contador;i++) {
			if(ISBN==a[i].getISBN()) {
				return i;
			}
		}
		return -1;
	}    

	public static void buscarAutor(Scanner teclado, Libro a[], int contador) {
		String autor;
		System.out.println("Introduce el curso de la asignatura");
		autor=teclado.next();
		for (int i=0;i<contador;i++) {
			if (autor.equalsIgnoreCase(a[i].getAutor())) {
				System.out.println("Libro: " +a[i].getTitulo() +" ganancias: "+a[i].getVentas());
			}

		}
	} 

	public static void orderSuperventas(Libro[] a, int contador) {
		Libro superventas=new Libro();
		for(int i=0; i<a.length-1; i++){
			if (!a[i].esSuperVentas()) {
				for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){ 
					if(a[j].getVentas()>a[j+1].getVentas()){ 
						superventas=a[j];
						a[j]=a[j+1];
						a[j+1]=superventas;
					}   
				}
			}

		}



	}

	public static int eliminarLibro(Scanner teclado, Libro a[], int contador) {
		int pos=0;
			System.out.println("Cual es el libro a eliminar? (Escribe el ISBN)");
			pos=buscarPorISBN(teclado, a, contador);
			if (pos==-1) {
				System.out.println("No existe ");
			}else {
				a[pos]=null;
				contador--;
				System.out.println("El libro ha sido borrado");
				for ( int i=pos;i<contador;i++) {
					a[i]=a[i+1];
				a[contador]=null;
			}

		}
		return contador;	

	}

	public static void mostrar( Libro [] a, int contador) {
		for (int i=0;i<contador;i++) {
			System.out.println(a[i].toString());
		}
	}

	public static void modificar(Scanner teclado, Libro a[], int contador) {
		int menu2;
		int pos=0;
		do {
			System.out.println("Introduce el ISBN del libro");
			pos=buscarPorISBN(teclado, a, contador);
			System.out.println("Que es lo que quieres cambiar?");
			System.out.println("1. Autor");
			System.out.println("2. Precio");
			System.out.println("3. Ventas");
			System.out.println("4. Titulo");
			System.out.println("5. Salir");
			menu2=teclado.nextInt();
			switch (menu2) {
			case 1:
				boolean enc=false;
				for (int i=0;i<contador && !enc;i++) {
					System.out.println("Introduce el nuevo autor");
					a[i].setAutor(teclado.next());
					enc=true;
				}
				break;
			case 2:
				enc=false;
				for (int i=0;i<contador && !enc;i++) {
					System.out.println("Introduce el nuevo precio");
					a[i].setPrecio(teclado.nextInt());
					enc=true;
				}
				break;
			case 3:
				enc=false;
				for (int i=0;i<contador && !enc;i++) {
					System.out.println("Introduce el nuevo autor");
					a[i].setAutor(teclado.next());
					enc=true;
				}
				break;
			case 4:
				enc=false;
				for (int i=0;i<contador && !enc;i++) {
					System.out.println("Introduce el nuevo numero de ventas");
					a[i].setVentas(teclado.nextInt());
					enc=true;
				}
				break;
			case 5:
				break;
			default:
				System.out.println("opcion inexistente");
				break;
			}
		}while(menu2!=5);
	}


}
