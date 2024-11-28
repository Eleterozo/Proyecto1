package IfPrograms;
import java.util.Scanner;
public class EjercicioIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Variables
		Scanner teclado = new Scanner(System.in);
		int edad;
		
		
		System.out.println("Cuantos años tienes? ");
		edad = teclado.nextInt();
		if (edad<6) {
			System.out.println("he llamado a tus padres");
		}
		else if(edad<18){
			System.out.println("Acceso no autorizado");
		}
		else {
			System.out.print("Bienvenido");
		}
		
		
		
		teclado.close();
		
	}

}
