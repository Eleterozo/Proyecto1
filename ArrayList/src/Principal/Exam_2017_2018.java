package Principal;
import java.util.Scanner;
public class Exam_2017_2018 {
	private static void mostrarMenu() {
    	System.out.println("\n--- Menú de gestión de vehículos---");
    	System.out.println("1. Introducir un nuevo profesor");
    	System.out.println("2. Añadir publicación");
    	System.out.println("3. Mostrar los libros galardonados de un año concreto");
    	System.out.println("4. Mostrar un listado por departamento de los profesores con mayor número de publicaciones");
    	System.out.println("5. Listado de los profes");
    	System.out.println("6. Salir");
    	System.out.println("Seleccione una opción: ");
	}
	private static void introducirProfesor() {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
        	mostrarMenu();
        	opcion = teclado.nextInt();
        	teclado.nextLine();

        	switch (opcion) {
        	case 1:
            	//introducirProfesor();
            	break;
        	case 2:
            	//añadirPublicacion();
            	break;
        	case 3:
            	//librosGalardonadosAñoConcreto();
            	break;
        	case 4:
            	// MostrarDepartamentoProfesores+NumeroPub();
            	break;
        	case 5:
            	// ListaProfesor(asignaturas, numasig);
            	break;
        	case 6:
            	System.out.println("Saliendo del programa...");
            	break;
        	default:
            	System.out.println("Opción inválida, por favor seleccione una opción válida.");
            	break;
        	}
    	} while (opcion != 10);
	}




	}


