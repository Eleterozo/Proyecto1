package ejercicio4OOP;
import java.util.Scanner;
public class Ejercicio4 {
	 
	public static void mostrarGrupos(Cuenta[] a,Scanner teclado) {
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	String grupoDeLetras=teclado.next();
        	for (int i =0;i<contarCuentas(a);i++) {
            	if (a[i].getTitular().contains(grupoDeLetras)) {
                	System.out.println(a[i].toString());
            	}
        	}
       	 
    	}
	}
	public static void SortCuentas(Cuenta[] a) {    
    	double n = contarCuentas(a);    
    	double temp = 0;   
    	String titul;
    	if (n==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	for(int i=0; i < n; i++){    
            	for(int j=1; j < (n-i); j++){    
                	if(a[j-1].getCantidad() > a[j].getCantidad()&&a[j].getCantidad()!=0){ 	 
                    	temp = a[j-1].getCantidad();
                    	titul=a[j-1].getTitular();
                    	a[j-1].setCantidad(a[j].getCantidad());
                    	a[j-1].setTitular(a[j].getTitular());
                    	a[j].setCantidad(temp);
                    	a[j].setTitular(titul);
                	}   
            	}
        	}
    	}
	}  
	public static void mostrarEspecifico(Cuenta[] a,Scanner teclado) {
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	String titul=teclado.next();
        	boolean enc=false;
        	int pos=0;
        	for (int i =0;i<contarCuentas(a)&&!enc;i++) {
            	if(titul.equalsIgnoreCase(a[i].getTitular())) {
                	pos=i;
            	}
        	}
        	System.out.println(a[pos].toString());
    	}
	}
	public static void mostrarCuentasSaldoSuperior(Cuenta[] a,Scanner teclado) {
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	System.out.println("Voy a mostrar las cuentas que superan la cantidad que me digas.");
        	System.out.println("Introduce la cantidad");
        	double num=teclado.nextDouble();
        	boolean existenCuentas=false;
        	for (int i =0;i<contarCuentas(a);i++) {
            	if (a[i].getCantidad()>num) {
                	System.out.println(a[i].toString());
                	existenCuentas=true;
            	}
        	}
        	if (!existenCuentas)
            	System.out.println("No existen cuentas que superen esa cantidad");
    	}
	}
	public static void mostrarCuentaMayorSaldo(Cuenta[] a) {
    	 
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	double max=a[0].getCantidad();
        	int posicionMayor=0;
        	for (int i =0;i<contarCuentas(a);i++) {
            	if (a[i].getCantidad()>max) {
                	max=a[i].getCantidad();
                	posicionMayor=i;
            	}
        	}
        	System.out.println(a[posicionMayor].toString());
    	}
	}
	public static void restar12(Cuenta[] a) {
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	for(int i =0;i<contarCuentas(a);i++){
            	a[i].retirar(12);
        	}
    	}
	}
	public static void meterDinero(Cuenta[] a, Scanner teclado) {
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	double dineros;
        	System.out.println("cuanto");
        	dineros=teclado.nextDouble();
        	boolean enc=false;
        	for (int i =0;i<contarCuentas(a)&&!enc;i++) {
            	if (a[i]==null) {
                	enc=true;
                	a[i].ingresar(dineros);
            	}

        	}
    	}
	}
	public static void mostrarCuentas(Cuenta[] a, Scanner teclado) {
    	if (contarCuentas(a)==0) {
        	System.out.println("No existen cuentas en este momento.");
    	}
    	else {
        	for(int i =0;i<contarCuentas(a);i++){
            	System.out.println(a[i].toString());
        	}
    	}
	}
	public static void crearCuentas(Cuenta[] a, Scanner teclado) {
	    System.out.print("¿Cuántas cuentas deseas crear? ");
	    int gc = teclado.nextInt();
	    int numeroDeCuentas = contarCuentas(a);
	    if (numeroDeCuentas + gc > a.length) {
	        System.out.println("Error: No hay suficiente espacio en el array para crear todas las cuentas.");
	        return;
	    }
	    for (int i = 0; i < gc; i++) {
	        Cuenta c = new Cuenta();
	
	        System.out.print("Introduce el titular: ");
	        c.setTitular(teclado.next());
	        System.out.print("Introduce la cantidad: ");
	        c.setCantidad(teclado.nextDouble());
	        a[numeroDeCuentas] = c;
	        numeroDeCuentas++;
	    }
	}
	
	public static int contarCuentas(Cuenta[] a) {
    	int cant=0;
    	boolean enc=false;
    	for (int i =0;i<a.length&&!enc;i++) {
        	if (a[i]==null) {
            	enc=true;
            	cant=i+1;
        	}

    	}
    	return cant;
	}
	public static boolean salirM() {
    	System.out.println("¡¡¡Adios!!!");
    	return true;
	}
	public static int menuS(Scanner teclado) {
    	int m;
    	System.out.println("-----Menú-----\n1.-Crear cuenta.\n2.-Mostrar cuentas existentes.\n3.-Ingresar cantidad a un titular\n4.-Retirar de todas las cuentas introducidas 12€\n5.-Mostrar la cuenta de mayor saldo.\n6.-Mostrar las cuentas que tengan saldo superior a uno introducido.\n7.-Mostrar la cuenta de un titular concreto.\n8.-Mostrar las cuentas de los titulares que contengan un grupo de letras.\n9.-Ordenar y mostrar las cuentas\n10.-Salir");
    	m=teclado.nextInt();
    	return m;
	}

	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner teclado= new Scanner(System.in);
    	Cuenta[] a=new Cuenta[50];
    	boolean salir=false;
    	int menu;
    	while(!salir) {
        	menu=menuS(teclado);
        	switch (menu) {
        	case 1:
            	crearCuentas(a,teclado); //Deberes: Arreglar y compactar
            	break;
        	case 2:
            	mostrarCuentas(a,teclado);
            	break;
        	case 3:
            	meterDinero(a,teclado);
            	break;
        	case 4:
            	restar12(a);
            	break;
       	 
        	case 5:
            	mostrarCuentaMayorSaldo(a);
            	break;
        	case 6:
            	mostrarCuentasSaldoSuperior(a,teclado);
            	break;
        	case 7:
            	mostrarEspecifico(a,teclado);
            	break;
        	case 8:
            	mostrarGrupos(a,teclado);
            	break;
        	case 9:
            	SortCuentas(a);
            	break;
        	case 10:
            	salir=salirM();
            	break;
        	default:
            	System.out.println("¡¡¡ERROR!!!");
            	break;
        	}
    	}
    	teclado.close();
	}

}



