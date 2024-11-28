package Principal;
import java.time.LocalDate;
public class publicacion {
	protected LocalDate fecha;
	protected String titulo;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public publicacion(LocalDate fecha, String titulo) {
        this.fecha = fecha;
        this.titulo = titulo;
    }
	@Override
	public String toString() {
		return "publicación [fecha=" + fecha + ", titulo=" + titulo + "]";
	}
}
