package bucles;
import java.util.Scanner;
public class EjercicioBucle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int menu; 
		double num1, num2;
		char basicop, compop;
		System.out.println("Elige una opcion");
		System.out.println("1.Operaciones basicas");
		System.out.println("2.Operaciones complejas");
		System.out.println("3.termianar programa");
		menu = teclado.nextInt();
		switch (menu) {
			case 1:			
				System.out.println("Que operacion quieres realizar?");
				System.out.println("a.Suma");
				System.out.println("b.Resta");
				System.out.println("c.Multiplicacion");
				System.out.println("d.Division");
				basicop = teclado.next().charAt(0);
				System.out.println("Escribe el primer digito: ");
				num1 = teclado.nextDouble();
				System.out.println("Escribe el segundo digito: ");
				num2 = teclado.nextDouble();	
				switch (basicop) {
					case 'a':
						System.out.println("El resultado es " +(num1 + num2));
					break;
					
					case 'b':
						System.out.println("El resultado es " +(num1 - num2));
					break;
					
					case 'c':
						System.out.println("El resultado es " +(num1 * num2));
					break;
					
					case 'd':
						while (num1 == 0 || num2 == 0) {
							System.out.println("No se puede dividir entre 0");
							System.out.println("Escribe el primer digito: ");
							num1 = teclado.nextDouble();
							System.out.println("Escribe el segundo digito: ");
							num2 = teclado.nextDouble();	
						}
						System.out.println("El resultado es " +(num1 / num2));

						break;
					
					default: 
						System.out.println("Caracter incorrecto");
						
				}
			break;
			
			case 2:
				System.out.println("Que operacion quieres realizar?");
				System.out.println("a.Potencia");
				System.out.println("b.Raiz cuadrada");
				compop = teclado.next().charAt(0);
				switch (compop) {
				case 'a':
					System.out.println("Escribe el primer digito: ");
					num1 = teclado.nextDouble();
					System.out.println("Escribe el segundo digito: ");
					num2 = teclado.nextDouble();
					System.out.println(num1 + " elevado a la potencia de " +num2 +" es: " +Math.pow(num1, num2));
					break;
					
				case 'b':
					System.out.println("Escribe el primer digito: ");
					num1 = teclado.nextDouble();
					System.out.println("La raiz cuadrada de " + Math.sqrt(num1));
					break;

					
					default: 
						System.out.println("Escriba una opcion valida");
				}
				
			break;
			
			case 3: 
				System.out.println("Adios y hasta la proxima!");
			break;
			
			default: 
				System.out.println("Eleccion no disponible");
		}

		teclado.close();
	}
	

}