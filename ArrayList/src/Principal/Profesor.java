package Principal;
import java.util.ArrayList;
public class Profesor {
	private String mail;
	private String nombre;
	private String nombredep;
	private ArrayList <publicacion>a;
	public String getMail() {
    	return mail;
	}
	public void setMail(String mail) {
    	this.mail = mail;
	}
	public String getNombre() {
    	return nombre;
	}
	public void setNombre(String nombre) {
    	this.nombre = nombre;
	}
	public String getNombredep() {
    	return nombredep;
	}
	public void setNombredep(String nombredep) {
    	this.nombredep = nombredep;
	}
	public ArrayList<publicacion> getA() {
    	return a;
	}
	public void setA(ArrayList<publicacion> a) {
    	this.a = a;
	}
	public Profesor(String mail, String nombre, String nombredep, ArrayList<publicacion> a) {
	    this.mail = mail;
	    this.nombre = nombre;
	    this.nombredep = nombredep;
	    this.a = a;
	}
	@Override
	public String toString() {
		return "Profesor [mail=" + mail + ", nombre=" + nombre + ", nombredep=" + nombredep + "]";
	}
}

