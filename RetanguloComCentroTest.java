import static org.junit.Assert.*;

import org.junit.Test;


public class RetanguloComCentroTest {
	
	Ponto centro = new Ponto(6, 4);
	RetanguloComCentro retangulo = new RetanguloComCentro(4, 8, centro);
	
	@Test
	public void permiteConsultarEAlterarSeuCentro() {
		assertEquals(centro, retangulo.centro());
		Ponto novoCentro = new Ponto(2, 3);
		retangulo.alterarCentro(novoCentro);
		assertEquals(novoCentro, retangulo.centro());
	}
	
	@Test
	public void permiteCalcularSeusVertices() {
		assertArrayEquals(new Ponto[] {
				new Ponto(2, 6), new Ponto(10, 6), new Ponto(10, 2), new Ponto(2, 2)
		}, retangulo.vertices());
	}

}
