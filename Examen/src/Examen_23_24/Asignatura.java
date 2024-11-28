package Examen_23_24;

public class Asignatura {
   
	private String nombre;
	private String curso;
	private int numAlumnosMatriculados;
	private int numSuspensos;

    
	public Asignatura(String nombre, String curso) {
    	this.nombre = nombre;
    	this.curso = curso;
    	this.numAlumnosMatriculados = 0;
    	this.numSuspensos = 0;
	}

    
	public Asignatura(String nombre, String curso, int numAlumnosMatriculados, int numSuspensos) {
    	this.nombre = nombre;
    	this.curso = curso;
    	this.numAlumnosMatriculados = numAlumnosMatriculados;
    	this.numSuspensos = numSuspensos;
	}

    
	public String getNombre() {
    	return nombre;
	}

	public void setNombre(String nombre) {
    	this.nombre = nombre;
	}

	public String getCurso() {
    	return curso;
	}

	public void setCurso(String curso) {
    	this.curso = curso;
	}

	public int getNumAlumnosMatriculados() {
    	return numAlumnosMatriculados;
	}

	public void setNumAlumnosMatriculados(int numAlumnosMatriculados) {
    	this.numAlumnosMatriculados = numAlumnosMatriculados;
	}

	public int getNumSuspensos() {
    	return numSuspensos;
	}

	public void setNumSuspensos(int numSuspensos) {
    	this.numSuspensos = numSuspensos;
	}

    
	@Override
	public String toString() {
    	return "Asignatura{" +
            	"nombre='" + nombre + '\'' +
            	", curso='" + curso + '\'' +
            	", numAlumnosMatriculados=" + numAlumnosMatriculados +
            	", numSuspensos=" + numSuspensos +
            	'}';
	}
    
	public double porcentajeAprobados() {
    	if (numAlumnosMatriculados == 0) {
        	return 0.0;
    	}
    	int numAprobados = obtenerNumeroAprobados();
    	return (numAprobados * 100.0) / numAlumnosMatriculados;
	}

	public int obtenerNumeroAprobados() {
    	return numAlumnosMatriculados - numSuspensos;
	}
}
