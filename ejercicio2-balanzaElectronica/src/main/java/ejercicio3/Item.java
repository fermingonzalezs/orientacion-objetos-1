package ejercicio3;

public class Item {

	public String detalle;
	public int cantidad;
	public double costoUnitario;
	
	public Item (String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public double costo() {
		return cantidad*costoUnitario;
	}
	
	
	
}
