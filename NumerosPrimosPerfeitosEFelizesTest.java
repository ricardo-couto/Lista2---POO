import static org.junit.Assert.*;

import org.junit.Test;


public class NumerosPrimosPerfeitosEFelizesTest {

	@Test
	public void testaSeUmNumeroÉPrimo() {
		assertTrue(new NumerosPrimosPerfeitosEFelizes(1).EhPrimo());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(2).EhPrimo());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(3).EhPrimo());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(4).EhPrimo());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(5).EhPrimo());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(7).EhPrimo());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(9).EhPrimo());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(13).EhPrimo());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(25).EhPrimo());
	}
	
	@Test
	public void testaSeUmNumeroÉPerfeito(){
		assertFalse(new NumerosPrimosPerfeitosEFelizes(1).EhPerfeito());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(2).EhPerfeito());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(5).EhPerfeito());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(6).EhPerfeito());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(11).EhPerfeito());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(15).EhPerfeito());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(28).EhPerfeito());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(40).EhPerfeito());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(496).EhPerfeito());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(8128).EhPerfeito());
	}
	
	@Test
	public void testaSeUmNumeroÉFeliz(){
		assertTrue(new NumerosPrimosPerfeitosEFelizes(1).EhFeliz());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(2).EhFeliz());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(3).EhFeliz());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(4).EhFeliz());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(5).EhFeliz());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(6).EhFeliz());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(7).EhFeliz());
		assertTrue(new NumerosPrimosPerfeitosEFelizes(10).EhFeliz());
		assertFalse(new NumerosPrimosPerfeitosEFelizes(13).EhFeliz());
	}

}
