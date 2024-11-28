package ejerciocio1OOP;
import java.util.Scanner;
public class PaginaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Cuenta c1=new Cuenta();
		Cuenta c2=new Cuenta("Victor", 0);
		Cuenta c3=new Cuenta("Alicia",12);
		double dinero;
		c3.ingresar(1000);
		System.out.println(c3.toString());
		System.out.println("Cuanto dinero quieres ingresarle a Victor?");
		dinero = teclado.nextDouble();
		c2.ingresar(dinero);
		System.out.println(c2.toString());
		c2.retirar(dinero);
		
		
		
		teclado.close();
	}

}
