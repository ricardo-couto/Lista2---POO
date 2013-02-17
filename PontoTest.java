import static org.junit.Assert.*;

import org.junit.Test;


public class PontoTest {

	Ponto ponto = new Ponto(3, 4);
	
	@Test
	public void permiteConsultarXEY() {
		assertEquals(3, ponto.x(), 0);
		assertEquals(4, ponto.y(), 0);
	}
	
	@Test
	public void permiteCompararIgualdadeEntreDoisPontos(){
		Ponto ponto2 = new Ponto(3, 4);
		assertEquals(ponto, ponto2);
	}

}
