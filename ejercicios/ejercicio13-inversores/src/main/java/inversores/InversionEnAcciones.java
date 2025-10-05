package inversores;

public class InversionEnAcciones implements Inversion {

	/**
	 * Constructor de inversión en acciones
	 * @param nombre - nombre que identifica la acción en el mercado
	 * @param cantidad - cantidad de acciones
	 * @param valorUnitario - valor unitario de cada acción
	 */
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {

	}

	/**
	 * Retorna el nombre de la acción
	 */
	public String getNombre() {
		return null;
	}

	/**
	 * Retorna la cantidad de acciones
	 */
	public int getCantidad() {
		return 0;
	}

	/**
	 * Retorna el valor unitario de cada acción
	 */
	public double getValorUnitario() {
		return 0.0;
	}

	/**
	 * Retorna el valor actual de la inversión (cantidad * valorUnitario)
	 */
	@Override
	public double valorActual() {
		return 0.0;
	}
}
