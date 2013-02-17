import static org.junit.Assert.*;

import org.junit.Test;

public class BolaTest {

	Bola bola = new Bola("verde");
	
	@Test
	public void criarBolaComUmaCorEConsutarSuaCor() {
		assertEquals("verde", bola.cor());
	}
	
	@Test
	public void permiteModificarACorDeUmaBola(){
		assertEquals("verde", bola.cor());
		bola.modificaCor("branca");
		assertEquals("branca", bola.cor());
	}

}
