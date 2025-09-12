package ar.edu.unlp.objetos.uno.ejercicio2;

public class Producto {

	private int peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto (String descripcion, double precioPorKilo,int peso) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
