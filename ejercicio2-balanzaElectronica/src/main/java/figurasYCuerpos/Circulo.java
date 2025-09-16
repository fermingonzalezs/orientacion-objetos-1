package figurasYCuerpos;

public class Circulo extends Cuerpo2D{
	private double diametro;
	private double radio;
	
	public Circulo() {

	}
	
	public double getPerimetro() {
		return Math.PI * this.radio*2;
	}
	
	public double getArea() {
		return Math.pow(radio,2)*Math.PI;
	}

	public double getDiametro() {
		return radio*2;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
