package whiledowhile;
import java.util.Scanner;
public class Repetir109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num;
		int contador = 0;
		System.out.println("escribe un numero: ");
		num = teclado.nextDouble();
		
		while (contador != num) {
			contador++;
			if(contador%2==0) {
				System.out.println(contador);
			}
	}
		
		teclado.close();
	}

}
