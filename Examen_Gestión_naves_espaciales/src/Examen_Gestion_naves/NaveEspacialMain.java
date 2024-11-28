package Examen_Gestion_naves;
import java.util.Scanner;
public class NaveEspacialMain {
	public static int menunave(Scanner teclado) {
		int menu;
		System.out.println("1. Añadir naves espaciales.");
		System.out.println("2. Mostrar naves cuya antigüedad sea superior a una dada.");
		System.out.println("3. Ordenar naves por año de lanzamiento.");
		System.out.println("4. Modificar capacidad total de las naves que admiten pasajeros.");
		System.out.println("5. Mostrar todas las naves espaciales registradas");
		System.out.println("6. Eliminar una nave espacial");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}
	public static int introducir(Scanner teclado, NaveEspacial a[], int contador) {
		String respuesta="";
		String nombre;
		
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir más Naves espaciales ");
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				NaveEspacial t1=new NaveEspacial();
				a[i]=t1;
				//return setAñocrea setAñolanz
				System.out.println("Cual es el nombre de la nave espacial");
				nombre=teclado.next();
				int pos=buscarPorNombre(nombre,a,contador);
				if(pos==-1) {
					a[i].setNombre(nombre);
					System.out.println("¿Cual es el año de creación de la nave espacial?");
					a[i].setAñocrea(teclado.nextInt());
					System.out.println("¿Cual es el año de lanzamiento de la nave espacial?");
					a[i].setAñolanz(teclado.nextInt());
					System.out.println("¿Cual es la capacidad total de personas de la nave espacial?");
					a[i].setCaptotper(teclado.nextInt());
					System.out.println("¿Cual es el número de tripulantes dentro de la nave espacial?");
					a[i].setNumtrip(teclado.nextInt());
					System.out.println("¿Cual es el Año actual?");
					a[i].setAnioActual(teclado.nextInt());
					contador++;

				}else {
					System.out.print("La nave espacial ya existe");
				}
				do {
					System.out.println("Nave añadida exitosamente");
					System.out.print("¿Quieres seguir introduciendo naves?: ");
					respuesta = teclado.next();

					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
			}
		}
		return contador;
	}
	public static int buscarPorNombre(String Nombre, NaveEspacial a[], int contador) {
		for (int i=0; i<contador;i++) {
			if(Nombre.equalsIgnoreCase(a[i].getNombre())) {
				return i;
			}
		}
		return -1;
	}
	public static void mostrar(NaveEspacial a[], int contador) {
		for (int i=0;i<contador;i++) {
			System.out.println(a[i].toString());
		}
	}
	public static int eliminarNaveEspacial(Scanner teclado, NaveEspacial a[], int contador) {
		String nombre="";
		System.out.println("Cual es el nombre de la nave espacial que deseas eliminar?");
		nombre=teclado.next();
		int pos=buscarPorNombre(nombre,a,contador);
		if(pos==-1) {
			System.out.println("No existe");
		}else {
			a[pos]=null;
			contador--;
			System.out.println("La nave espacial ha sido borrada");
			for(int i=pos;i<contador;i++) {
				a[i]=a[i+1];

			}
		}
		return contador;
	}
	public static void ordenarnaves(NaveEspacial a[], int contador) {
		NaveEspacial sigCuen=new NaveEspacial();
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){
				if(a[j].getAñolanz()<a[j+1].getAñolanz()){
					sigCuen=a[j];
					a[j]=a[j+1];
					a[j+1]=sigCuen;
				}   
			}
		}

		mostrar (a,contador);
	}
	public static void superiorantigüedad(Scanner teclado, NaveEspacial a[], int contador) {
		int minimo;
		boolean salir=false;
		System.out.println("Introduzca la antigüedad minima?");
		minimo=teclado.nextInt();
		for(int i=0;i<contador;i++) {
			if (a[i].calcularAntiguedad()>minimo) {
				System.out.println(a[i].getNombre());
				System.out.println(a[i].calcularAntiguedad());System.out.println("años");
				salir=true;
			}
		}  if (!salir) {
			System.out.println("No hay naves espaciales que superen el minimo de antigüedad");
		}
	}
	public static void modificarcapacidadtotal (Scanner teclado, NaveEspacial a[],int contador) {
		String nombre;
		int cant = 0;
		System.out.println("Introduzca el nombre de la nave espacial");    
		nombre=teclado.next();
		int pos=buscarPorNombre(nombre,a,contador);
		if(pos==-1) {
			System.out.println("No existe");
		}else {
			if (a[pos].admitePasajeros()) {
				System.out.println("Nueva capacidad total de la nave espacial ");
				a[pos].setCaptotper(teclado.nextInt());
				if (a[pos].getNumtrip()+cant<=a[pos].getCaptotper()) {
					a[pos].setNumtrip(a[pos].getNumtrip()+cant);
					System.out.println("La nueva capacidad maxíma se guardo con exito");
				}else {
					System.out.println("No es posible realizar esa reserva");
				}
			}else {
				System.out.println("Está lleno");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		int opcion=0;
		NaveEspacial a[] = new NaveEspacial [50];
		int contador=0;
		do {
			opcion=menunave(teclado);
			switch (opcion) {
			case 1:
				contador=introducir(teclado, a, contador);
				break;
			case 2:
				if (contador>0) {
					superiorantigüedad(teclado, a, contador);
				}else {
					System.out.println("No hay naves espaciales, porfavor introduzca una o varias naves espaciales");
				}
				break;
			case 3:
				if (contador>0) {
					ordenarnaves( a,  contador);
				}else {
					System.out.println("No hay naves espaciales, porfavor introduzca una o varias naves espaciales");
				}

				break;
			case 4:
				if (contador>0) {
					modificarcapacidadtotal (teclado, a,contador);
				}else {
					System.out.println("No hay naves espaciales, porfavor introduzca una o varias naves espaciales");
				}

				break;
			case 5:
				if (contador>0) {
					mostrar( a,  contador);
				}else {
					System.out.println("No hay naves espaciales, porfavor introduzca una o varias naves espaciales");
				}

				break;
			case 6:
				if (contador>0) {
					contador=eliminarNaveEspacial(teclado, a, contador);
				}else {
					System.out.println("No hay naves espaciales, porfavor introduzca una o varias naves espaciales");
				}

				break;
			case 7:
				System.out.println("Agur!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				opcion=7;
				break;
			}
		}while(opcion!=7);	 
		teclado.close();
	}
}


