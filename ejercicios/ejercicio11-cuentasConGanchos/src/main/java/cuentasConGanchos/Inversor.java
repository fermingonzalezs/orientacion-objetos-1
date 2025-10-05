package cuentasConGanchos;
import java.util.ArrayList;
public class Inversor {
	
	private ArrayList<Inversion> inversiones = new ArrayList<Inversion>();
	
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public void sacarInversion(Inversion inversion) {
		if(inversiones.contains(inversion)) {
			this.inversiones.remove(inversion);
		}
	}
	
	public double valorActual() {
		return inversiones.stream()
				.mapToDouble(inv -> inv.valorActual())
				.sum();
	}
	
	public ArrayList<Inversion> getInversiones() {
		return inversiones;
	}
	
	
}
