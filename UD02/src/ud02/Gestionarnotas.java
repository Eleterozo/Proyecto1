package ejercicioFor;
import java.util.Scanner;
public class Gestionarnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String user, pass, nomb,ap;
		double nota1, nota2, nota3, notafin, notatrab, notafinal;
		int menu;
		System.out.println("Escribe el usuario: ");
		user = teclado.next();
		System.out.println("Escribe la contraseña: ");
		pass = teclado.next();
		while (pass.indexOf("e")>=1) {
			System.out.println("ERROR, en la contraseña no puede aparecer la letra e. Introduce de nuevo, por favor:");
			System.out.println("Escribe el usuario: ");
			user = teclado.next();
			System.out.println("Escribe la contraseña: ");
			pass = teclado.next();
		}
		System.out.println("Escribe tu nombre: ");
		nomb = teclado.next();
		System.out.println("Escribe tu apellido: ");
		ap = teclado.next();
		System.out.println("Que quieres hacer? Que quieres hacer? \n 1. Introducir notas \n 2. Salir del programa");
		menu = teclado.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Escribe la nota del primer examen ");
			nota1 = teclado.nextDouble();
			System.out.println("Escribe la nota del segundo examen? ");
			nota2 = teclado.nextDouble();
			System.out.println("Escribe la nota del tercer examen? ");
			nota3 = teclado.nextDouble();
			System.out.println("Escribe la nota del examen final? ");
			notafin = teclado.nextDouble();
			System.out.println("Escribe la nota del ultimo trabajo? ");
			notatrab = teclado.nextDouble();
			notafinal = ((((nota1+nota2+nota3)*55)/300)+ +((notafin*30)/100) +((notatrab*15)/100)    );
			System.out.println("La nota final del alumno " +nomb+" "+ap+ " es " +notafinal);
			if (notafinal <= 4.9) {
				System.out.println("SUSPENSO");
			}
			else if (notafinal >= 5 <= 5.9) {
				System.out.println("SUSPENSO");
			}
			
			
			
			break;
		case 2:
			System.out.println("Muchas gracias y hasta pronto.");
			break;
			default: System.out.println("Por favor ponga un comando valido");
				
			
		}
		
		
		
		
		
		
		
		teclado.close();
	}

}
