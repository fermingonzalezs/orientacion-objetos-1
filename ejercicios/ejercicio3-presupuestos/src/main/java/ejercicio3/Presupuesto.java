package ejercicio3;
import java.util.ArrayList;

public class Presupuesto {

	public java.time.LocalDate fecha;
	public String cliente;
	private ArrayList<Item> vector = new ArrayList<Item>();
	
	
	
	public void agregarItem(Item item) {
		this.vector.add(item);
	}
	
	public java.time.LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
