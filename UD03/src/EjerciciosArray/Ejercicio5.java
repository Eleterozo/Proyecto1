package EjerciciosArray;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media= 0, suma=0, max =0, min=0;
		int contadorMenor=0, contadorMayor=0;
		
		
		String dias[] = new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado", "Domingo"};
		double temperatura[] = new double[] {18,20,26,21,17,24,22};
		
		for(int i=0;i<temperatura.length;i++)
		{
			suma= temperatura[i]+suma;
		}
		
		for(int i = 0; i<temperatura.length; i++)
		{
			if(temperatura[i]<min)
			{
				contadorMenor = i;
				min=temperatura[i];
			}
		}
		for(int i = 0;i<temperatura.length; i++)
		{
			if(temperatura[i]>max)
			{
				contadorMayor = i;
				max=temperatura[i];
			}
		}
		
		
		
		
		media = (suma/temperatura.length);
		
		System.out.println("La temperatura media de la semana es : "+(int)(media*1.8+32)+ " Farenheit");
		System.out.println("El dia menos caluroso es " + dias[contadorMenor] + " que tiene: " + temperatura[contadorMenor] + " grados");
		System.out.println("El dia mas caluroso es " + dias[contadorMayor] + " que tiene: " + temperatura[contadorMayor] + " grados");
		
		for(int i = 0;i<temperatura.length; i++)
		{
			if(temperatura[i]>media)
			{
				System.out.println("El "+ dias[i] + " Esta por encima de la media");
			}
		}
		
		for(int i = 0;i<temperatura.length; i++)
		{
			if(temperatura[i]<media)
			{
				System.out.println("El "+ dias[i] + " Esta por debajo de la media");
			}
		}
	}

}

