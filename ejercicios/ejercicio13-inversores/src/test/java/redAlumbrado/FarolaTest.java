package redAlumbrado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FarolaTest {
	private Farola farola1;
	private Farola farola2;
	private Farola farola3;
		
	@BeforeEach
	void setUp() throws Exception {
		farola1 = new Farola();
		farola2 = new Farola();
		farola3 = new Farola();
	}

	@Test
	void testConstructor() {
		assertTrue(farola1.isOff());
		assertFalse(farola1.isOn());
	}

	@Test
	void testPairWithNeighbor() {
		farola1.pairWithNeighbor(farola2);
		
		assertTrue(farola1.getNeighbors().contains(farola2));
		assertTrue(farola2.getNeighbors().contains(farola1));
		
		assertEquals(1,farola1.getNeighbors().size());
		assertEquals(1,farola2.getNeighbors().size());
	}

	@Test
	void testGetNeighbors() {
		assertTrue(farola1.getNeighbors().isEmpty());
		
		farola1.pairWithNeighbor(farola2);
		assertEquals(1,farola1.getNeighbors().size());
		farola1.pairWithNeighbor(farola3);
		assertEquals(2,farola1.getNeighbors().size());
		
		assertTrue(farola1.getNeighbors().contains(farola2));
		assertTrue(farola1.getNeighbors().contains(farola3));
	}

	@Test
	void testTurnOn() {
		assertFalse(farola1.isOn());
		assertTrue(farola1.isOff());
		
		farola1.turnOn();
		assertTrue(farola1.isOn());
		assertFalse(farola1.isOff());
		
		
		
	}

	  @Test
	  void testTurnOff() {
	      farola1.turnOn();
	      assertTrue(farola1.isOn());

	      farola1.turnOff();

	      assertTrue(farola1.isOff());
	      assertFalse(farola1.isOn());
	  }


	@Test
	void testIsOn() {
		assertFalse(farola1.isOn());
		farola1.turnOn();
		assertTrue(farola1.isOn());
	}

	@Test
	void testIsOff() {
		assertTrue(farola1.isOff());
		farola1.turnOn();
		assertFalse(farola1.isOff());
	}
	
	@Test
	void testPropagacionOnYOff() {
		farola1.pairWithNeighbor(farola2);
		farola1.pairWithNeighbor(farola3);
		
		farola1.turnOn();
		assertTrue(farola2.isOn());
		assertTrue(farola3.isOn());
		
		farola1.turnOff();
		assertTrue(farola2.isOff());
		assertTrue(farola3.isOff());
		
		
	}

}
