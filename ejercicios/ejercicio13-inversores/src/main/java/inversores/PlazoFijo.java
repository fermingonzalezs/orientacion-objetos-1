package inversores;

import java.time.LocalDate;

public class PlazoFijo implements Inversion {

	/**
	 * Constructor de plazo fijo
	 * @param fechaDeConstitucion - fecha en que se constituyó el plazo fijo
	 * @param montoDepositado - monto inicial depositado
	 * @param porcentajeDeInteresDiario - porcentaje de interés diario
	 */
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {

	}

	/**
	 * Retorna la fecha de constitución del plazo fijo
	 */
	public LocalDate getFechaDeConstitucion() {
		return null;
	}

	/**
	 * Retorna el monto depositado
	 */
	public double getMontoDepositado() {
		return 0.0;
	}

	/**
	 * Retorna el porcentaje de interés diario
	 */
	public double getPorcentajeDeInteresDiario() {
		return 0.0;
	}

	/**
	 * Retorna el valor actual del plazo fijo
	 * (monto + intereses desde fecha de constitución hasta hoy)
	 */
	@Override
	public double valorActual() {
		return 0.0;
	}
}
