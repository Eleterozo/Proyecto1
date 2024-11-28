package ejercicioMetodos;
import java.util.Scanner;
public class EjerciciolibreriaV2 {

	static void myMethod0() {
    	Scanner teclado = new Scanner(System .in);
    	String[] objlib= new String[50];
    	int menu,salir=0,nuevoP = 0;
    	boolean encontrado;
    	String opcion,si,no,librob,nuevoN;
    	si = "Si";
    	no = "No";
    	objlib [0] = "Cuaderno";
    	objlib [1] = "Bolígrafo";
    	objlib [2] = "Lapiz";
    	objlib [3] = "Goma";
    	objlib [4] = "Estuche";
    	int[] prec= new int[50];
    	prec [0] = 5;
    	prec [1] = 3;
    	prec [2] = 2;
    	prec [3] = 1;
    	prec [4] = 7;
  	}
	static void MostrarArtículos(String []objlib) {
    	Scanner teclado = new Scanner(System .in);
    	String opcion,si,no,librob,nuevoN;
    	int menu,salir=0,nuevoP = 0, i=0;
    	si = "Si";
    	no = "No";
    	for(i=0;i<objlib.length && objlib[i]!= null;i++) {
			System.out.println(objlib[i]);
		}
	}
	static void Despedida() {
    	System.out.println("¡Adios!");
  	}
	static void CambiarPrecio(String []objlib) {
		Scanner teclado = new Scanner(System .in);
    	int menu,salir=0,nuevoP = 0 ;
    	boolean existe=false;
    	String opcion,articulo,si,no;
    	si = "Si";
    	no = "No";
    	objlib [0] = "Cuaderno";
    	objlib [1] = "Bolígrafo";
    	objlib [2] = "Lapiz";
    	objlib [3] = "Goma";
    	objlib [4] = "Estuche";
    	int[] prec= new int[50];
    	prec [0] = 5;
    	prec [1] = 3;
    	prec [2] = 2;
    	prec [3] = 1;
    	prec [4] = 7;
		
		
		System.out.println("¿Cual es el artículo el cual quieres modificar su precio?");
		articulo=teclado.nextLine();
		for(int i=0; i<objlib.length && !existe; i++) {
			if (objlib[i].equalsIgnoreCase(articulo)) {
				existe=true;
				System.out.println("El articulo "+articulo+" tendra el nuevo precio de "+prec[i]+"€");
				System.out.println("¿Cual es el nuevo precio?");
				nuevoP=teclado.nextInt();
				prec[i]=nuevoP;
				System.out.println("El nuevo precio de "+articulo+" es de "+nuevoP+"€\n");
			}
		}
	
		if (!existe) { // i=a.length-1
			System.out.println("El libro no existe");
		}
	}

	static void AñadirArtículosPrecios(String []objlib) {
    	Scanner teclado = new Scanner(System .in);
    	String opcion,si,no,librob,nuevoN;
    	si = "Si";
    	no = "No";
    	int menu,salir=0,nuevoP = 0, k=0;
    	int[] prec= new int[50];
    	do {

        	if ((objlib[49]) != null) {
           	System.out.println("Tienes muchos libros en la tienda, elimina un artículo.");
           	do {
               	System.out.println("¿Quieres continuar en el programa? SI / NO");
               	opcion=teclado.next();
               	if (opcion.equalsIgnoreCase(si)) {
               	} if (opcion.equalsIgnoreCase(no)) {

                   	System.out.println("Adios");
                   	salir ++;
               	}
               	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
        	}
           	if ((objlib[k]) == null) {
                  	System.out.println("¿Cuál es el nombre del artículo?");
                  	nuevoN=teclado.next();
                  	objlib [k] = nuevoN;
                  	System.out.println("¿Cuál es el precio?");
                  	nuevoP=teclado.nextInt();
                  	prec [k] = nuevoP;
                  	System.out.println("El precio del nuevo artículo llamado " + objlib[k] + " es " + prec[k] + " €");
                  	k = 50;
               	}

            	k++;
            	} while (k <objlib.length);
  	}
	 public static void obtenerIVAProducto(String [] objlib)
     {
		 Scanner teclado = new Scanner(System .in);
	    	String opcion,si,no;
	    	int menu, i=0;
	    	objlib [0] = "Cuaderno";
	    	objlib [1] = "Bolígrafo";
	    	objlib [2] = "Lapiz";
	    	objlib [3] = "Goma";
	    	objlib [4] = "Estuche";
	    	int[] prec= new int[50];
	    	prec [0] = 5;
	    	prec [1] = 3;
	    	prec [2] = 2;
	    	prec [3] = 1;
	    	prec [4] = 7;
	    	boolean existe=false;
	    	si = "Si";
	    	no = "No";
	    	 System.out.println("Introduzca el nombre del artículo");
	         opcion = teclado.nextLine();

	         int posicion = comprobarProducto(opcion, objlib);
	         if (posicion >= 0) {
	             double iva = prec[posicion] * 0.21;
	             System.out.println("Su IVA es " + iva + " euros");
	         } else {
	             System.out.println("Producto no encontrado");
	         }
	     }

	     private static int comprobarProducto(String opcion, String[] objlib) {
	         for (int i = 0; i < objlib.length; i++) {
	             if (objlib[i].equalsIgnoreCase(opcion)) {
	                 return i; 
	             }
	         }
	         return -1; 
	     }

	     public static void obtención(String[] args) {
	         String[] objlib = new String[50];
	         obtenerIVAProducto(objlib);
	     }
	     
	static void MostrarPrecios(String []objlib) {
    	Scanner teclado = new Scanner(System .in);
    	String opcion,si,no;
    	int menu, i=0;
    	objlib [0] = "Cuaderno";
    	objlib [1] = "Bolígrafo";
    	objlib [2] = "Lapiz";
    	objlib [3] = "Goma";
    	objlib [4] = "Estuche";
    	int[] prec= new int[50];
    	prec [0] = 5;
    	prec [1] = 3;
    	prec [2] = 2;
    	prec [3] = 1;
    	prec [4] = 7;
    	boolean existe=false;
    	si = "Si";
    	no = "No";
    	System.out.println("Introduzca el nombre del artículo");
		opcion=teclado.nextLine();
		do {
			if(opcion.equalsIgnoreCase(objlib[i])&&i<objlib.length) {
				System.out.println("El libro "+opcion+" tiene un precio de "+prec[i]+" €\n");
				existe=true;
			}
				i++;
			
		}while(!existe&&i<objlib.length);
		if (!existe) {
			System.out.println("No existe");
		}
	}
	
	static void OrdenardeMenoraMayor(String []objlib) {
    	Scanner teclado = new Scanner(System .in);
    	String opcion,si,no;
    	int menu;
    	objlib [0] = "Cuaderno";
    	objlib [1] = "Bolígrafo";
    	objlib [2] = "Lapiz";
    	objlib [3] = "Goma";
    	objlib [4] = "Estuche";
    	boolean existe=false;
    	si = "Si";
    	no = "No";
int[] prec = {5, 3, 2, 1, 7}; 
        
       
        for (int i = 0; i < prec.length - 1; i++) {
            for (int j = 0; j < prec.length - 1 - i; j++) {
                if (prec[j] > prec[j + 1]) {
                   
                    int tempPrec = prec[j];
                    prec[j] = prec[j + 1];
                    prec[j + 1] = tempPrec;
                    
                   
                    String tempProd = objlib[j];
                    objlib[j] = objlib[j + 1];
                    objlib[j + 1] = tempProd;
                }
            }
        }

        System.out.println("Productos ordenados de menor a mayor precio:");
        for (int i = 0; i < objlib.length; i++) {
            System.out.println(objlib[i] + ": " + prec[i] + " euros");
        }
    }

    public static void ordenMenorMayor(String[] args) {
        String[] objlib = new String[50];
        OrdenardeMenoraMayor(objlib);
    }
    
    
	static void OrdenardeMayorAMenor(String []objlib) {
    	Scanner teclado = new Scanner(System .in);
    	String opcion,si,no;
    	int menu;
    	objlib [0] = "Cuaderno";
    	objlib [1] = "Bolígrafo";
    	objlib [2] = "Lapiz";
    	objlib [3] = "Goma";
    	objlib [4] = "Estuche";
    	boolean existe=false;
    	si = "Si";
    	no = "No";
    	int[] prec = {5, 3, 2, 1, 7, }; 
         for (int i = 0; i < prec.length - 1; i++) {
             for (int j = 0; j < prec.length - 1 - i; j++) {
                 if (prec[j] < prec[j + 1]) { 
                     int tempPrec = prec[j];
                     prec[j] = prec[j + 1];
                     prec[j + 1] = tempPrec;
                     
                    
                     String tempProd = objlib[j];
                     objlib[j] = objlib[j + 1];
                     objlib[j + 1] = tempProd;
                 }
             }
         }

       
         System.out.println("Productos ordenados de mayor a menor precio:");
         for (int i = 0; i < objlib.length; i++) {
             System.out.println(objlib[i] + ": " + prec[i] + " euros");
         }
     }

     public static void OrdenMayorMenor(String[] args) {
         String[] objlib = new String[50];
         OrdenardeMayorAMenor(objlib);
     }
     
     
     
	static void BorrarArticulos(String []objlib) {
		Scanner teclado = new Scanner(System .in);
    	String opcion,si,no,articulo,nuevoN;
    	boolean existe=false;
    	si = "Si";
    	no = "No";
    	int menu,salir=0,nuevoP = 0, i=0;
    	int[] prec= new int[50];
		System.out.println("¿Cual es el artículo que deseas eliminar?");
		teclado.nextLine();
		articulo=teclado.nextLine();
		for(i=0; i<objlib.length && !existe; i++) {
			if (objlib[i].equalsIgnoreCase(articulo)) {
				existe=true;
				System.out.println("El libro "+articulo+" tiene un precio de "+prec[i]+"€");
				System.out.println("¿Cual es el nuevo precio?");
				nuevoP=teclado.nextInt();
				prec[i]=nuevoP;
				System.out.println("El nuevo precio de "+articulo+" es de "+nuevoP+"€\n");
			}
		}
		if (!existe) { 
			System.out.println("El libro no existe");
		}
		

	}
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner teclado = new Scanner(System .in);
    	String[] objlib= new String[50];
    	int menu,salir=0,nuevoP = 0;
    	boolean encontrado;
    	String opcion,si,no,librob,nuevoN;
    	objlib [0] = "Cuaderno";
    	objlib [1] = "Bolígrafo";
    	objlib [2] = "Lapiz";
    	objlib [3] = "Goma";
    	objlib [4] = "Estuche";
   	 
    	int[] prec= new int[50];
    	prec [0] = 5;
    	prec [1] = 3;
    	prec [2] = 2;
    	prec [3] = 1;
    	prec [4] = 7;
    	do {
        	System.out.println("--------Menu-------");
        	System.out.println("1.Añadir artículos y precios");
        	System.out.println("2.Mostrar productos de la tienda");
        	System.out.println("3.Obtener el precio de un producto");
        	System.out.println("4.Obtener el IVA de un producto");
        	System.out.println("5.Modificar el precio de un producto");
        	System.out.println("6.Eliminar un producto");
        	System.out.println("7.Salir");
        	System.out.println("8.Ordenar por precio de menor de mayor");
        	System.out.println("9.Ordenar por precio de mayor de menor");
        	menu=teclado.nextInt();
        	switch(menu) {
        	case 1:
        		AñadirArtículosPrecios(objlib);
            	break;
        	case 2:
        		MostrarArtículos(objlib);
            	break;
        	case 3:
        		MostrarPrecios(objlib);
            	break;
        	case 4:
        		 obtenerIVAProducto(objlib);
            	break;
        	case 5:
        		CambiarPrecio(objlib);
            	break;
        	case 6:
        		BorrarArticulos(objlib);
            	break;
        	case 7:
        		Despedida();
            	break;
        	case 8:
        		ordenMenorMayor(objlib);
        		break;
        	case 9:
        		OrdenardeMayorAMenor(objlib);
        		break;
        	default:
            	System.out.println("¡¡ERROR!! Elija una opcion del menu.");
    	}
	}while(menu!=1);
	teclado.close();
}

}

