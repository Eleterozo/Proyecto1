package whiledowhile;
import java.util.Scanner;
public class Repeticion108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num;
		int contador = 0;
		System.out.println("escribe un numero: ");
		num = teclado.nextDouble();
		
		/*while (contador != num) {
			contador++;
			System.out.println(contador  );
		}

		num=0;*/

		do {
		    contador++;
			System.out.println(contador);
		}while (contador != num);
		
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
