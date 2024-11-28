package ejercicioMetodos;
import java.util.Scanner;
public class EjercicioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int[] num= new int [12];
		String nombre;
		char menu;
		num [0]=23;
		num [1]=53;
		num [2]=202;
		num [3]=139;
		num [4]=69;
		num [5]=87;
		num [6]=96;
		num [7]=231;
		num [8]=123;
		num [9]=241;
		num [10]=15;
		num [11]=92;
		do {
			System.out.println("--------Menu-------\nA.-Pediremos por pantalla diez números entre 10 y 500.\nB.-Se irán introduciendo tantos números como el usuario desee.\nC.-Pediremos que se introduzcan por pantalla 10 números entre 1 y 10.");
			menu = teclado.next().toUpperCase().charAt(0);
        	switch(menu) {
        	case 'A':
		System.out.println("Introduzca su nombre de usuario");
		nombre=teclado.next();
		for (int j:num) {
			System.out.println(j);
		}
		 System.out.println("Números multiplicados por 2:");
         for (int j = 0; j < num.length; j++) {
             System.out.println(num[j] * 2);
         }
			break;
      
        	case 'B':
        		
        	}
		}while(menu!=1);
		teclado.close();
	}
}


