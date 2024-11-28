package EjerciciosArray;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
		int menu, contador=0, max= 0;
		
		String arrMeses[] = new String[]{"enero","febrero","marzo","abril","mayo"};
		int arrLitros[] = new int[] {123,333,180,211,90};
		
		System.out.println("1. Mostrar en cada mes cuantos litros han llovido.");
		System.out.println("2. Mostrar en pantalla el mes y los litros del mes más lluvioso.");
		
		menu = teclado.nextInt();
		
		switch(menu)
		{
		
		case 1:
			for(int i=0; i<arrMeses.length; i++)
			{
				System.out.println("El mes de " + arrMeses[i] + " llueve " + arrLitros[i] + " litros");
			}
			
			break;
			
		case 2:
			for(int i = 0; i<arrLitros.length; i++)
			{
				if(arrLitros[i]>max)
				{
					contador = i;
					max=arrLitros[i];
				}
			}
			System.out.println("El dia mas lluvioso es: " + arrMeses[contador] + " que llovio: " + arrLitros[contador] + " Litros");
			
			break;
		
		
		}
		teclado.close();
		
	}	

}
