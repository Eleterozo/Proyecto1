package arrays;
import java.util.Scanner;
public class EjercicioArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int[] a = new int[10];
		int num=0, cant=0, suma=0;
		while (num>=0 && cant!=a.length) {
			System.out.println("Introduce un numero");
			num = teclado.nextInt();
			if (num>0) {
				a[cant]=num;
				cant++;
			}
			
			for (int i=0;i<cant;i++) {
				suma=suma+a[i];
			}
			
			
		}
		System.out.println("Media: " +(suma/cant));

		
		
		
		
		
		
		
		teclado.close();
	}

}
