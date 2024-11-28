package ud02;
import java.util.Scanner;
public class Estructuradecontrol4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num, fact=1, i;
		System.out.println("Introduce el numero: ");
		num = teclado.nextInt();
		while(num<=0) { 
			System.out.println("El numero introducido debe ser mayor a 0.");
			}
		for (i=1;i<=num;i++) {
			System.out.print(i + "*");
			fact=fact*i;
		}
		System.out.print("=" + fact);
		
		teclado.close();
	}

}
