package Principal;

import java.time.LocalDate;

public class articulo extends publicacion {
	private String medio;

    public articulo(LocalDate fecha, String titulo, String medio) {
        super(fecha, titulo);  
        this.medio = medio;
    }

    public String getMedio() {
        return medio;
    }
    public void setMedio(String medio) {
        this.medio = medio;
    }
    @Override
    public String toString() {
        return "Artículo [medio=" + medio + ", fecha=" + fecha + ", titulo=" + titulo + "]";
    }
}
