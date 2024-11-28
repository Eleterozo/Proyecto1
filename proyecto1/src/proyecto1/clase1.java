package proyecto1;
import java.util.Scanner;//1
public class clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);//2
		System.out.println("¡Hola!");
		System.out.println("¿Cuál es tu nombre?");
		String nombre;
		nombre=teclado.next();
		System.out.println(nombre);
		System.out.print("Bienvenida ");
		System.out.print(nombre );
		System.out.println(". Vamos a realizar diferentes cálculos");
		System.out.println("***************************************");
		System.out.println("CÍRCULO");
		System.out.print("Introduce el valor del radio: ");
		int radio;
		radio=teclado.nextInt();
		System.out.println( radio );
		System.out.println("El área del círculo es "+ Math.PI*radio*radio+" m2");
		System.out.println("***************************************");
		System.out.println("CUADRADO");
		System.out.print("Introduce el valor del lado: ");
		int lado;
		lado=teclado.nextInt();
		System.out.println( lado );
		System.out.println("El área del cuadrado es "+ lado*lado+" m2"); 
		System.out.println("***************************************");
		System.out.println("RECTÁNGULO");
		System.out.print("Introduce el valor del lado más largo: ");
		int ladol;
		ladol=teclado.nextInt();
		System.out.println( ladol );
		System.out.print("Introduce el valor del lado más corto: ");
		int ladoc;
		ladoc=teclado.nextInt();
		System.out.println( ladoc );
		System.out.println("El área del rectángulo es "+ ladol*ladoc+"  m2."); 
		System.out.println("***************************************");
		System.out.println("TRIÁNGULO");
		System.out.print("Introduce el valor de la altura: ");
		int altura;
		altura=teclado.nextInt();
		System.out.println( altura );
		System.out.print("Introduce el valor de la base: ");
		int base;
		base=teclado.nextInt();
		System.out.println( base);
		System.out.println("El área del triángulo es "+ base*altura/2+" m2");
		teclado.close();//4
	
			
	}

}
