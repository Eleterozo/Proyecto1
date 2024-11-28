package EjerciciosArray;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
		int menu, contador=0, max= 0;
		
		String alumnos[] = new String[]{"Jon","Sara","Ander","Marta","Jone","Mikel"};
		int edad[] = new int[] {18,20,26,21,17,24};
		
		System.out.println("1. El nombre y edad del más joven");
		System.out.println("2. El nombre y edad del mayor");
		
		menu = teclado.nextInt();
		
		switch(menu)
		{
		
		case 1:
			for(int i = 0; i<edad.length; i++)
			{
				if(edad[i]<max)
				{
					contador = i;
					max=edad[i];
				}
			}
			System.out.println("El alumno mas menor es " + alumnos[contador] + " que tiene: " + edad[contador] + " años");
			
			break;
			
		case 2:
			for(int i = 0; i<edad.length; i++)
			{
				if(edad[i]>max)
				{
					contador = i;
					max=edad[i];
				}
			}
			System.out.println("El alumno mas mayor es " + alumnos[contador] + " que tiene: " + edad[contador] + " años");
			
			break;
		
		
		}
		teclado.close();
	}

}
