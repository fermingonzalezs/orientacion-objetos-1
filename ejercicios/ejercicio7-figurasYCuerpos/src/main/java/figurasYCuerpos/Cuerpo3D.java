package figurasYCuerpos;

public class Cuerpo3D {

	private Cuerpo2D caraBasal;
	private double altura;
	
	public Cuerpo3D() {
	}
	
	public double getVolumen() {
		return caraBasal.getArea()*altura;
	}
	
	public double getSuperficieExterior() {
		return 2*caraBasal.getArea()+caraBasal.getPerimetro()*altura;
	}
	public Cuerpo2D getCaraBasal() {
		return caraBasal;
	}

	public void setCaraBasal(Cuerpo2D caraBasal) {
		this.caraBasal = caraBasal;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura=altura;
	}
	
}
