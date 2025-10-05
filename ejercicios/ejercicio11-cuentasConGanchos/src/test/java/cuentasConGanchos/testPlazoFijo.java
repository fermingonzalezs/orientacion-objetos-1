package cuentasConGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPlazoFijo {
	private PlazoFijo plazo;
	
	
	private LocalDate fechaDeImplementacion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
	      fechaDeImplementacion = LocalDate.of(2025, 9, 25);
	      plazo = new PlazoFijo(fechaDeImplementacion, 1000, 1);

	}
	
	
	@Test
	void testConstructor() {
		assertEquals(fechaDeImplementacion,plazo.getFechaDeImplementacion());
		assertEquals(1000, plazo.getMontoDepositado());
		assertEquals(1,plazo.getPorcentajeDeInteresDiario());
	}
	
	@Test
	void testValorActual() {
		long dias = ChronoUnit.DAYS.between(fechaDeImplementacion, LocalDate.now());
		double esperado = 1000 + (1000 * 1 / 100 * dias);
		assertEquals(esperado,plazo.valorActual());
	}
	
	
	

}
