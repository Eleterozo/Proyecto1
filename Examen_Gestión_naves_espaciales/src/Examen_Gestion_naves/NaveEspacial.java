package Examen_Gestion_naves;

public class NaveEspacial {

	private String nombre;
	private int añocrea;
	private int añolanz;
	private int captotper;
	private int numtrip;
	private int anioActual;
	
	public NaveEspacial() {
		this.nombre="";
		this.añocrea=0;
		this.añolanz=0;
		this.captotper=0;
		this.numtrip=0;
		this.anioActual=0;
	}
	 public NaveEspacial(String n, int ac, int al, int ctp, int nt, int anact ) {
		 this.nombre=n;
		 this.añocrea=ac;
		 this.añolanz=al;
		 this.captotper=ctp;
		 this.numtrip=nt;
		 this.anioActual=anact;
		
	}
	 
	public int getAnioActual() {
		return anioActual;
	}
	public void setAnioActual(int anioActual) {
		this.anioActual = anioActual;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAñocrea() {
		return añocrea;
	}
	public void setAñocrea(int añocrea) {
		this.añocrea = añocrea;
	}
	public int getAñolanz() {
		return añolanz;
	}
	public void setAñolanz(int añolanz) {
		this.añolanz = añolanz;
	}
	public int getCaptotper() {
		return captotper;
	}
	public void setCaptotper(int captotper) {
		this.captotper = captotper;
	}
	public int getNumtrip() {
		return numtrip;
	}
	public void setNumtrip(int numtrip) {
		this.numtrip = numtrip;
	}
	
	@Override
	public String toString() {
		return "NaveEspacial [nombre=" + nombre + ", añocrea=" + añocrea + ", añolanz=" + añolanz + ", captotper="
				+ captotper + ", numtrip=" + numtrip + ", anioActual=" + anioActual + "]";
	}

	 public int calcularAntiguedad() {
		 return anioActual - añocrea;
		 
	 }
	 public boolean admitePasajeros() {
		    	boolean lleno = true;
		    	if (this.numtrip >= this.captotper) {
		        	lleno = false;
		    	}
		    	return lleno;
		 
	 }
}
