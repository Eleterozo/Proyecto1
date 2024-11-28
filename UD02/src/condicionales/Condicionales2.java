package condicionales;
import java.util.Scanner;
public class Condicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1,num2, suma = 0, multi =1, i;
		System.out.println("Escribe un valor minimo");
		num1 = teclado.nextInt();
		System.out.println("Escribe un valor maximo");
		num2 = teclado.nextInt();
		for ( i = num1; i<=num2; i++)
		{
			System.out.println(i);
		}
		if (i%2 == 0) {
			suma = suma+i;
			System.out.println(suma);
			
		}
		else {
			multi = multi*i;
			System.out.println(multi);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
