package Principal;
import java.time.LocalDate;
public class libro extends publicacion {
    private String isbn;
    private boolean premiado;

   
    public libro(LocalDate fecha, String titulo, String isbn, boolean premiado) {

        super(fecha, titulo);  
        this.isbn = isbn;
        this.premiado = premiado;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean isPremiado() {
        return premiado;
    }
    public void setPremiado(boolean premiado) {
        this.premiado = premiado;
    }
    @Override
    public String toString() {
        return "libro [isbn=" + isbn + ", premiado=" + premiado + ", fecha=" + fecha + ", titulo=" + titulo + "]";
    }
}