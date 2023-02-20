package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos n1 = new NumerosAmigos(20, 50);
		boolean esAmigo = n1.amigo();
		assertFalse(esAmigo);
	}

	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos n1 = new NumerosAmigos(220, 284);
		boolean esAmigo = n1.amigo();
		assertTrue(esAmigo);
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos n1 = new NumerosAmigos(0, 284);
		assertNull(n1.esN1IgualAN2());
	}

	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos n1 = new NumerosAmigos(284, 284);
		int igual = n1.esN1IgualAN2();
		assertEquals(igual,1);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos n1 = new NumerosAmigos(220, 284);
		int igual = n1.esN1IgualAN2();
		assertNotEquals(igual,1);
	}
}
