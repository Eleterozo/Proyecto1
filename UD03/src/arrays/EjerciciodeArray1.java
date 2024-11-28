package arrays;
import java.util.Scanner;
public class EjerciciodeArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		int[] a= new int[10];
		int menu;
		double sum;
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random() * 1041);
		}
		
		do {
			System.out.println("--------Menu-------\n1.-Salir\n2.-Mostrar suma\n3.-Mostrar el maximo\n4.-Mostrar el minimo\n5.-Mostrar la media\n6.-Rellenarlo con nuevos numeros.");
			menu=teclado.nextInt();
			sum=0;
			switch(menu) {
				case 1:
					System.out.println("¡Adios!");
					break;
				case 2:
					for(int i=0;i<a.length;i++) {
						sum=sum+a[i];
					}
					System.out.println(sum);
					break;
				case 3:
					for(int i=0;i<a.length;i++) {
						if (a[i]>sum) {
							sum=a[i];
						}
					}
					System.out.println(sum);
					break;
				case 4:
					for(int i=0;i<a.length;i++) {
						if (a[i]<sum) {
							sum=a[i];
						}
					}
					System.out.println(sum);
					break;
				case 5:
					for(int i=0;i<a.length;i++) {
						sum=sum+a[i];
					}
					System.out.println(sum/a.length);
					break;
				case 6:
					for(int i=0;i<a.length;i++) {
						a[i]=(int)(Math.random() * 101);
					}
					System.out.println("Los numeros han sido reasignados.");
					break;
				default:
					System.out.println("¡¡ERROR!! Elija una opcion del menu.");
					break;
			}
		}while(menu!=1);
		teclado.close();
	}

}