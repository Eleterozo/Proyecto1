package ejerciocio1OOP;

public class Cuenta {
	private String titular;
	private double cantidad;
	public Cuenta() {
		this.titular="";
		this.cantidad=0;
	}
	public Cuenta(String t, double c){
		this.titular=t;
		this.cantidad=c;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Cuenta titular= " + titular + ", cantidad= " + cantidad + "";
	}
	
	public void ingresar(double can) {
		if (can>0) {
			this.cantidad=this.cantidad+can;
		}
	}
	public void retirar(double can) {
		this.cantidad=this.cantidad-can;
		if (this.cantidad<0) {
			this.cantidad=0;
		}
	}
}