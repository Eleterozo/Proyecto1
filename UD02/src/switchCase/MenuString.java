package switchCase;
import java.util.Scanner;
public class MenuString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String primera;
		String segunda;
		String palabra3;
		int menu;
		String alreves;
		System.out.println("¿Cual es tu nombre?");
		nombre = teclado.next();
		System.out.println("Bienvendio " +nombre+ "¿que quieres hacer?");
		System.out.println("1.- Dar la vuelta a una palabra.");
		System.out.println("2.Comparar dos palabras.");
		System.out.println("3.Numero de letras.");
		System.out.println("4.Repetir palabra");
		System.out.println("5.Repetir palabra (Mayúscula / Minúscula)");
		System.out.println("6.Salir del programa");
		menu = teclado.nextInt();
		
		switch (menu) {
			case 1:
				System.out.println("Escribe la palabra que quieiras ver al reves");
				alreves = teclado.next();
				StringBuilder palabraReves=new StringBuilder(alreves);
				String sCadenaInvertida=palabraReves.reverse().toString();
				System.out.println("La palabra invertida es: " +sCadenaInvertida);
				break;
			case 2:
				System.out.println("Escribe la primera palabra: ");
				primera = teclado.next();
				System.out.println("Escribe la segunda palabra: ");
				segunda = teclado.next();
				if (primera.equals(segunda)) {
					System.out.println("Las palabras son iguales");
				}
				else {
					System.out.println("Las palabras no son iguale");
				}
				break;
			case 3:
				System.out.println("escribe la palabra que quieres contar: ");
				palabra3 = teclado.next();
				System.out.println("la palabra tiene la siguiente cantidad de letras: " +palabra3.length());
				if (palabra3.length() <= 7 ) {
					System.out.println("La palabra es pequeña");
				}
				else { 
					System.out.println("la palabra es Larga");		
				}
				break;
			case 4:
				String palabraarepetir;
				double numeroarepetir;
				System.out.println("Que palabra quieres repetir? ");
				palabraarepetir = teclado.next();
				System.out.println("Cuantas veces se va a repetir? ");
				numeroarepetir = teclado.nextDouble();
				while (numeroarepetir!=0) {
					System.out.println(palabraarepetir.toUpperCase()+" ");
					numeroarepetir--;
				}
				do {
					System.out.println(palabraarepetir.toUpperCase());
					numeroarepetir--;
				} while(numeroarepetir>=1);
				break;
			case 6:
				System.out.println("Muchas gracias y hasta pronto.");
				break;
			
			default:
				System.out.println("ESO NO!!!!");
		
		
		
		
		
		
		
		
		}
		
				teclado.close();
	}

}
