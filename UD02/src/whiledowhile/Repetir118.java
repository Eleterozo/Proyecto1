package whiledowhile;
import java.util.Scanner;

public class Repetir118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num;
		double resultado = 0;
		double suma;
		System.out.print("escribe un numero: ");
		num = teclado.nextDouble();
		
		/*while (num>=0) {
				if(num%2==0) {
					System.out.print(num + "+");
					resultado=resultado+num;
				}
				num--;
		}
		System.out.println("resultado: " + resultado); */
		
		
		do {
			if(num%2==0) {
				System.out.print(num + "+");
				resultado=resultado+num;
		}
			num--;
		} while (num>=0);
		System.out.println("resultado: " + resultado);
		

		
		
		teclado.close();
	
	}
}
