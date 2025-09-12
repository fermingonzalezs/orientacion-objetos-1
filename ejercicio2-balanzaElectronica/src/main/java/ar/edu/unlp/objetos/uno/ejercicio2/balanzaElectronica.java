package ar.edu.unlp.objetos.uno.ejercicio2;

public class balanzaElectronica {

	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public balanzaElectronica() {
		this.ponerEnCero();
	}

	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.pesoTotal=0;
		this.precioTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos += 1;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);

	}
		
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}



	public double getPesoTotal() {
		return pesoTotal;
	}
	
}
