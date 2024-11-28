package Examen_2013;
import java.util.Scanner;
public class Examen_2013Main {
	private static void mostrarMenu() {
    	System.out.println("\n--- Menú de gestión de vehículos---");
    	System.out.println("1. Introducir un nuevo vehículo");
    	System.out.println("2. Listar los datos de los coches que sean descapotables");
    	System.out.println("3. Pedir una tara al usuario y listar las furgonetas con una tara menor a la introducida");
    	System.out.println("4. Pedir una nueva carga y modificarla para todas las furgonetas");
    	System.out.println("5. Mostrar los datos de la furgoneta más antigua y más nueva");
    	System.out.println("6. Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos");
    	System.out.println("7. Ordenar el listado de furgonetas por tara y mostrarlo ");
    	System.out.println("8. Listar todos los vehículos ordenados por matrícula");
    	System.out.println("9. Introducir una matrícula y borrar dicho vehículo");
    	System.out.println("10. Salir");
    	System.out.println("Seleccione una opción: ");
	}
	public static void crearvehiculos(Vehiculo[] a, Scanner teclado) {
    	System.out.print("¿Cuántos vehiculos deseas introducir? ");
    	int ti = teclado.nextInt();
    	int numeroDeCuentas = contarVehiculo(a);
    	if (numeroDeCuentas + ti > a.length) {
        	System.out.println("Error: No hay suficiente espacio en el array para crear todas las cuentas.");
        	return;
    	}
    	for (int i = 0; i < ti; i++) {
        	Vehiculo t= new Vehiculo(null, null, null, i, i);
        	System.out.print("Introduce el titular: ");
        	t.setMatricula(teclado.next());
        	System.out.print("Introduce la cantidad: ");
        	t.setMarca(teclado.next());
        	a[numeroDeCuentas] = t;
        	numeroDeCuentas++;
    	}
	}
	private static int contarVehiculo(Vehiculo[] a) {
		return 0;
	}
	//static es una caracteristica que es igual en todos los objetos
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner teclado = new Scanner(System.in);
    	int opcion;
    	//int numeroVehiculos=new Vehiculo.getContador();
    	Vehiculo[] misVehiculos=new Vehiculo[2];
    	misVehiculos[0]= new Furgoneta("ABCD","OPEL", "ZAFIRA",17, 3000, 22,1500, 500);
    	misVehiculos[1]= new Coche("ELFG","LEXUS", "AVION",1, 10000, true );
    	for (Vehiculo miCoche: misVehiculos)
        	System.out.println(miCoche.toString());
    	int sumaAntigüedad=0;
    	for (Vehiculo miCoche: misVehiculos)
        	sumaAntigüedad+=miCoche.getAñosantigüedad();
    	System.out.println((double)sumaAntigüedad/Vehiculo.getContador());
    	do {
        	mostrarMenu();
        	opcion = teclado.nextInt();
        	teclado.nextLine();

        	switch (opcion) {
        	case 1:
            	//introducirvehiculos();
            	break;
        	case 2:
            	//verdatoscochesdescap();
            	break;
        	case 3:
            	//Pedirtarafurgonetasdartarasmenoresalasintroducidas();
            	break;
        	case 4:
            	// Pedirnuevacargamodificarlatodasfurgonetas();
            	break;
        	case 5:
            	// furgoneta+antigua+nueva(asignaturas, numasig);
            	break;
        	case 6:
            	// Mostrarantigüedadmedia();
            	break;
        	case 7:
            	//mostrarPorcentajeAprobadosCurso();//no hacer
            	break;
        	case 8:
            	//ordenarVehiculos();
            	break;
        	case 9:
            	// borrarvehículo();
        	case 10:
            	System.out.println("Saliendo del programa...");
            	break;
        	default:
            	System.out.println("Opción inválida, por favor seleccione una opción válida.");
            	break;
        	}
    	} while (opcion != 10);
	}

}

