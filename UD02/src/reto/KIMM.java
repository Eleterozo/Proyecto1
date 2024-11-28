package reto;
import java.util.Scanner;
public class KIMM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int n=0, r1=0, r2=0, mult1=0, mult2=0;
		while(n<50 || n>350) {
			System.out.println("Ingresa un número que sea entre 50 y 350");
			n = teclado.nextInt();
			if(n<50 || n>350) {
				System.out.println("Numero incorrecto");
			}
		}
		
		System.out.println("Ingresa dos multiplos entre 1 y 10");
		
		while(mult1<1 || mult1>10) {
			System.out.println("Multiplo1:");
			mult1 = teclado.nextInt();
			if(mult1<1 || mult1>10) {
				System.out.println("Numero incorrecto");
			}
		}
		while(mult2<1 || mult2>10 || mult2==mult1) {
			System.out.println("Multiplo2:");
			mult2 = teclado.nextInt();
			if(mult2<1 || mult2>10 || mult2==mult1) {
				System.out.println("Numero incorrecto");
			}
		}
		System.out.println("Multiplos del primer número");
		for (int i=1;i<=n;i++)
		{
			if (i%mult1==0)
		}
}
}
