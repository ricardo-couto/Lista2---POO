import static org.junit.Assert.*;

import org.junit.Test;

public class TVTest {

	TV tv = new TV();
	
	@Test
	public void permiteConsultarCanalEVolume() {
		assertEquals(1, tv.canal());
		assertEquals(0, tv.volume());
		assertFalse(tv.ligada());
	}
	
	@Test
	public void permiteLigarEdesligar(){
		assertFalse(tv.ligada());
		tv.ligar();
		assertTrue(tv.ligada());
		tv.desligar();
		assertFalse(tv.ligada());
	}
	
	@Test
	public void permiteAlterarCanal() {
		assertEquals(1, tv.canal());
		tv.canalAcima();
		assertEquals(2, tv.canal());
		tv.canalAcima();
		assertEquals(3, tv.canal());
		tv.canalAbaixo();
		assertEquals(2, tv.canal());
		tv.canalAbaixo();
		assertEquals(1, tv.canal());
	}
	
	@Test
	public void permiteAlterarVolume() {
		assertEquals(0, tv.volume());
		tv.aumentarVolume();
		assertEquals(1, tv.volume());
		tv.aumentarVolume();
		assertEquals(2, tv.volume());
		tv.diminuirVolume();
		assertEquals(1, tv.volume());
		tv.diminuirVolume();
		assertEquals(0, tv.volume());
	}
	
	@Test
	public void permiteAlterarCanalApenasDentroDaFaixa() {
		assertEquals(1, tv.canal());
		tv.canalAbaixo();
		assertEquals(1, tv.canal());
		for(int i=1; i<60; i++)
			tv.canalAcima();
		assertEquals(60, tv.canal());
		tv.canalAcima();
		assertEquals(60, tv.canal());
	}
	
	@Test
	public void permiteAlterarVolumeApenasDentroDaFaixa() {
		assertEquals(0, tv.volume());
		tv.diminuirVolume();
		assertEquals(0, tv.volume());
		for(int i=0; i<30; i++)
			tv.aumentarVolume();
		assertEquals(30, tv.volume());
		tv.aumentarVolume();
		assertEquals(30, tv.volume());
	}
}
