package IfPrograms;
import java.util.Scanner;
public class IfProgram27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota;
		
		System.out.println("Cual es tu nota? ");
		nota = teclado.nextDouble();
		if (nota>=0 && nota<3) {
			System.out.print("La calficacion es MD");
		}
		else if (nota>=3 && nota<5) {
			System.out.print("La calficacion es INS");
		}
		else if (nota>=5 && nota<6) {
			System.out.print("La calficacion es SUF");
		}
		else if (nota>=6 && nota<7) {
			System.out.print("La calficacion es BIEN");
		}
		else if (nota>=7 && nota<9) {
			System.out.print("La calficacion es NOT");
		}
		else if (nota>=9 && nota<=10) {
			System.out.print("La calficacion es SOBRE");
		}
		teclado.close();
	}

}
