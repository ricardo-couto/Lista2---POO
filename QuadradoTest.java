import static org.junit.Assert.*;

import org.junit.Test;


public class QuadradoTest {

	Quadrado quadrado = new Quadrado(4);
	Quadrado quadrado2 = new Quadrado(3);
	
	@Test
	public void permiteConsultarLadosDeUmQuadrado() {
		assertEquals(4, quadrado.lado(), 0);
	}
	
	@Test
	public void permiteAlterarLadosDeUmQuadrado() {
		assertEquals(4, quadrado.lado(), 0);
		quadrado.modificarLado(5);
		assertEquals(5, quadrado.lado(), 0);
	}
	
	@Test
	public void permiteCalcularAreaDeUmQuadrado() {
		assertEquals(16, quadrado.area(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoAceitaLadoZeroOuNegativo(){
		new Quadrado(0);
		new Quadrado(-2);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoAceitaModificarLadoParaZeroOuNegativo(){
		quadrado.modificarLado(0);
		quadrado2.modificarLado(-4);		
	}

}
