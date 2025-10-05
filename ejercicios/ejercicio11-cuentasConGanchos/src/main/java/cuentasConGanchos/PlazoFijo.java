package cuentasConGanchos;
import java.time.LocalDate;
import  java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {	
	private LocalDate fechaDeImplementacion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fechaDeImplementacion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeImplementacion = fechaDeImplementacion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public double valorActual() {
		long diasTranscurridos = ChronoUnit.DAYS.between(fechaDeImplementacion,LocalDate.now());
		return montoDepositado + (montoDepositado*(porcentajeDeInteresDiario/100*diasTranscurridos));
	}


	public LocalDate getFechaDeImplementacion() {
		return fechaDeImplementacion;
	}




	public double getMontoDepositado() {
		return montoDepositado;
	}



	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

}
