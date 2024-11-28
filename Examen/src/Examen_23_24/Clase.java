package Examen_23_24;
import java.util.Scanner;

public class Clase {
	public static int mostrarMenu(Scanner teclado) {
    	System.out.println("1. Introducir asignaturas.");
    	System.out.println("2. Mostrar el porcentaje de aprobados de las asignaturas de un curso.");
    	System.out.println("3. Ordenar las asignaturas por número de aprobados. ");
    	System.out.println("4. Modificar datos de una asignatura concreta.");
    	System.out.println("5. Mostrar todas las asignaturas que se han introducido.");
    	System.out.println("6. Borrar asignatura.");
    	System.out.println("7. Salir.");
    	return teclado.nextInt() ;
	}


	public static int eliminar(Scanner teclado, Asignatura a[], int c) {
   	 
    	int pos = 0;
    	System.out.println("Nombre de la asignatura que se debe eliminar:");
    	String nom= teclado.next();
    	pos = buscarPorNombre(nom,a,c);
    	if(pos!=-1) {
        	System.out.println("La asignatura ha sido borrada.");
        	a[pos]=null;
        	c--;
        	for(int i=pos;i<c;i++) {
            	a[i]=a[i+1];
        	}
        	a[c]=null;
    	}else {
        	System.out.println("La asignatura no existe.");
    	}
    	return c;
	}


	public static void mostrar(int c,Asignatura a[]) {
    	System.out.println("Estas son las asignaturas que hay: ");
    	for(int i=0;i<c;i++) {
        	System.out.println(a[i].toString());
    	}
	}


	public static void modificar(Scanner teclado, int c, Asignatura a[]) {
    	int pos, alumnos, suspensos;
    	String respuesta;
   	 
    	System.out.println("Nombre de la asignatura a modificar:");
    	String nom= teclado.next();
    	pos = buscarPorNombre(nom,a,c);
    	if(pos==-1) {
        	System.out.println("Esa asignatura no existe.");
    	}else {
        	do {
            	System.out.print("¿Quieres cambiar el número de alumnos matriculados?(SI/NO): ");
            	respuesta = teclado.next();

            	if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
                	System.out.println("Las opciones válidas son SI/NO");
            	}
        	} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));

        	if (!respuesta.equalsIgnoreCase("no")) {
            	do {
                	System.out.print("Introduce el nuevo número de alumnos matriculados: ");
                	alumnos = teclado.nextInt();
                	if (alumnos < 0) {
                    	System.out.println("El número de alumnos no puede ser negativo");
                	}
            	} while (alumnos < 0);

            	a[pos].setNumAlumnosMatriculados(alumnos);
            	System.out.println("El número de alumnos se ha modificado correctamente");
        	}

        	do {
            	System.out.print("¿Quieres cambiar el número de suspensos?(SI/NO): ");
            	respuesta = teclado.next();

            	if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
                	System.out.println("Las opciones válidas son SI/NO");
            	}
        	} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));

        	if (!respuesta.equalsIgnoreCase("no")) {
            	do {
                	System.out.print("Introduce el nuevo número de suspensos: ");
                	suspensos = teclado.nextInt();

                	if (suspensos < 0) {
                    	System.out.println("El número de suspensos no puede ser negativo");
                	} else if (suspensos > a[pos].getNumAlumnosMatriculados()) {
                    	System.out.println("El número de suspensos no puede ser mayor que el número de alumnos");
                	}
            	} while (suspensos < 0 || suspensos > a[pos].getNumAlumnosMatriculados());

            	a[pos].setNumSuspensos(suspensos);
            	System.out.println("El número de suspensos se ha modificado correctamente");
        	}
    	}

	}

	public static void ordenar(int c, Asignatura a[]) {
    	Asignatura a1;
    	for(int i=0; i<a.length-1; i++){
           	for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){
                	if(a[j].obtenerNumeroAprobados()<a[j+1].obtenerNumeroAprobados()){
                        	a1=a[j];
                        	a[j]=a[j+1];
                        	a[j+1]=a1;
                 	}   
           	}
      	}
    	System.out.println("Las asignaturas ordenadas por aprobados:");
    	mostrar(c,a);
	}
    

	public static void mostrarPorcentaje(Scanner teclado,int c, Asignatura a[]) {
    	String curso;
    	boolean existe = false;

    	System.out.print("Introduce el curso: ");
    	curso = teclado.next();

    	for (int i = 0; i < c; i++) {
        	if (curso.equalsIgnoreCase(a[i].getCurso())) {
            	System.out.println("En la asignatura " + a[i].getNombre() + " el porcentaje de aprobados es " + a[i].porcentajeAprobados() + "%");
            	existe = true;
        	}
    	}

    	if (!existe) {
        	System.out.println("No hay asignaturas para este curso");
    	}

	}
    
	public static int buscarPorNombre(String nombre, Asignatura a[], int contador) {
    	//busca la asignatura por nombre y devuelve su posición o -1 si no lo encuentra
    	for (int i=0; i<contador;i++) {
        	if(nombre.equalsIgnoreCase(a[i].getNombre())) {
            	return i;
        	}
    	}
    	return -1;
	}
	public static int introducirAsignatura(Scanner teclado, int c, Asignatura a[]) {
    	String respuesta = "si";
    	String nombre;
    	String curso;
    	int matriculados;
    	int suspensos;
    	int pos;

    	for(int i=c;i<a.length&&respuesta.equalsIgnoreCase("si");i++) {
        	System.out.println("Nombre de la asignatura:");
        	nombre= teclado.next();
        	pos= buscarPorNombre(nombre,a,c);
        	if (pos==-1) {
            	System.out.println("Curso:");
            	curso=teclado.next();
            	do {
                	System.out.println("Los alumnos matriculados tienen que ser mas o iguales que los suspensos.");
                	System.out.println("Alumnos matriculados:");
                	matriculados= teclado.nextInt();
                	System.out.println("Alumnos suspensos:");
                	suspensos= teclado.nextInt();
            	}while(matriculados<suspensos);
            	Asignatura a1 = new Asignatura(nombre, curso, matriculados, suspensos);
            	a[i]=a1;
            	c++;
           	 
            	do {
                	System.out.print("Quiere añadir otra asignatura?: ");
                	respuesta = teclado.next();
               	 
                	if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
                    	System.out.println("Las opciones válidas son Si/No");
                	}
            	} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
           	 
        	}else {
            	System.out.println("La asignatura ya existe");
        	}

    	}

    	return c;
	}

	public static void main(String[] args) {
    	Scanner teclado= new Scanner( System.in);
    	int opcion;
    	int contador=0;
    	Asignatura a[]= new Asignatura [2];
    	//a[0]= new Asignatura("PGR","1DAM", 20, 2);
   	 

    	do {
        	switch(opcion=mostrarMenu(teclado)) {
        	case 1:
            	contador=introducirAsignatura(teclado, contador, a);
            	break;
        	case 2:
            	if(contador!=0){
                	mostrarPorcentaje(teclado, contador, a);
            	}else {
                	System.out.println("Primero tiene que introducir asignaturas.");
            	}
            	break;
        	case 3:
            	if(contador!=0){
                	ordenar(contador, a);
            	}else {
                	System.out.println("Primero tiene que introducir asignaturas.");
            	}
            	break;
        	case 4:
            	if(contador!=0){
                	modificar(teclado, contador, a);
            	}else {
                	System.out.println("Primero tiene que introducir asignaturas.");
            	}
            	break;
        	case 5:
            	if(contador!=0){
                	mostrar(contador, a);
            	}else {
                	System.out.println("Primero tiene que introducir asignaturas.");
            	}
            	break;
        	case 6:
            	if(contador!=0){
                	contador=eliminar(teclado, a, contador);
            	}else {
                	System.out.println("Primero tiene que introducir asignaturas.");
            	}    
            	break;
        	case 7:
            	System.out.println("AGUR");
            	break;
        	default:
            	System.out.println("Meta una opcion correcta");
        	}

    	}while(opcion!=7);



	}

}
