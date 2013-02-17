import static org.junit.Assert.*;

import org.junit.Test;


public class RetanguloTest {

	Retangulo retangulo = new Retangulo(5, 6);
	
	@Test
	public void permiteConsultarLadosDeUmRetangulo() {
		assertEquals(5, retangulo.altura(), 0);
		assertEquals(6, retangulo.largura(), 0);
	}
	
	@Test
	public void permiteAlterarLadosDeUmRetangulo() {
		assertEquals(5, retangulo.altura(), 0);
		retangulo.modificarAltura(4);
		assertEquals(4, retangulo.altura(), 0);
		assertEquals(6, retangulo.largura(), 0);
		retangulo.modificarLargura(7);
		assertEquals(7, retangulo.largura(), 0);
	}
	
	@Test
	public void permiteCalcularAreaDeUmRetangulo() {
		assertEquals(30, retangulo.area(), 0);
	}
	
	@Test
	public void permiteCalcularPerimetroDeUmRetangulo() {
		assertEquals(22, retangulo.perimetro(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoAceitaLadosZerosOuNegativos() {
		new Retangulo(0, 1);
		new Retangulo(1, 0);
		new Retangulo(0, 0);
		new Retangulo(-1, 1);
		new Retangulo(1, -1);
		new Retangulo(-1, -1);
		new Retangulo(0, -1);
		new Retangulo(-1, 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoModificarLadosParaZeroOuNegativo() {
		retangulo.modificarAltura(0);
		retangulo.modificarAltura(-1);
		retangulo.modificarLargura(0);
		retangulo.modificarLargura(-1);
	}

}
