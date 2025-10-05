package cuentasConGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testInversionEnAcciones {
	private InversionEnAcciones accion;

	
	@BeforeEach
	void setUp() throws Exception{
		accion = new InversionEnAcciones ("APPLE",10,11);
	}
	
	
	@Test
	void testConstructor() {
		assertEquals("APPLE",accion.getNombre());
		assertEquals(10,accion.getCantidad());
		assertEquals(11,accion.getValorUnitario());
	}
	
	@Test
	void testValorActual() {
		assertEquals(110,accion.valorActual());
	}
	

}
