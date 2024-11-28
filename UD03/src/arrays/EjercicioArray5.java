package arrays;
import java.util.Scanner;
public class EjercicioArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int[] a = new int[10];
		int num;
		do {
				System.out.println("Escribe un numero del 0 al 9, ten en cuenta que no pueden ser negativos");
				num = teclado.nextInt();
			while(num>=10) {
				System.out.println("ERROR!!! Escribe un numero del 0 al 9, ten en cuenta que no pueden ser negativos");
				num = teclado.nextInt();
			}
		
			if (num>0) {
				a[num]=a[num]+1;
			}
		} while (num>=0);
		for (int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		teclado.close();
		
		
	}

}
