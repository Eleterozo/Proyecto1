package bucles;
import java.util.Scanner;
public class EjercicioBucle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double nota1, nota2, nota3, notafinal;
		int aprobado = 0;
		System.out.println("Escribe la primera nota.");
		nota1 = teclado.nextInt();
		while (nota1 > 10 || nota1 < 0 ) {
			System.out.println("Introduzca una nota valida");
			System.out.println("Escribe la primera nota.");
			nota1 = teclado.nextInt();
		}
		
		
		
		System.out.println("Escribe la segunda nota.");
		nota2 = teclado.nextInt();
		while (nota2 > 10 || nota2 < 0 ) {
			System.out.println("Introduzca una nota valida");
			System.out.println("Escribe la segunda nota.");
			nota2 = teclado.nextInt();
		}
		
		
		
		System.out.println("Escribe la tercera nota.");
		nota3 = teclado.nextInt();
		while (nota3 > 10 || nota3 < 0 ) {
			System.out.println("Introduzca una nota valida");
			System.out.println("Escribe la tercera nota.");
			nota3 = teclado.nextInt();
		}
		
		notafinal = (nota1 + nota2 + nota3)/3;
		System.out.println("La media es de: " + notafinal);
		
		if ( nota1 >= 5) {
			aprobado ++;
		
		}
		if ( nota2 >= 5) {
			aprobado++;

			System.out.println("Segunda asignatura suspendida");
		}
		if ( nota3 >= 5) {
			aprobado++;
		}

			System.out.println(aprobado + " asignaturas aprobadas");
			System.out.println( (3 - aprobado) + " Asignaturas suspendidad");
		
		teclado.close();
	}

}
