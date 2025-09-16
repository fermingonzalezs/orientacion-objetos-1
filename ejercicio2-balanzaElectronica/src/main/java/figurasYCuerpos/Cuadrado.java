package figurasYCuerpos;

public class Cuadrado extends Cuerpo2D{
	private double lado;
	
	public Cuadrado() {

	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.lado*4;
	}
	
	public double getArea() {
		return Math.pow(lado, 2);
	}
	
}
