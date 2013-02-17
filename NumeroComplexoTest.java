import static org.junit.Assert.*;

import org.junit.Test;


public class NumeroComplexoTest {

	NumeroComplexo numero = new NumeroComplexo(2, 3);
	
	@Test
	public void possuiParteRealEImaginaria() {
		assertEquals(2, numero.real(), 0);
		assertEquals(3, numero.imaginaria(), 0);
	}
	
	@Test
	public void permiteCompararDoisNumerosComplexos() {
		NumeroComplexo outroNumero = new NumeroComplexo(2, 3);
		assertEquals(numero, outroNumero);
	}
	
	@Test
	public void permiteSomarDoisNumerosComplexos(){
		NumeroComplexo outroNumero = new NumeroComplexo(5, 2);
		assertEquals(new NumeroComplexo(7, 5), numero.somar(outroNumero));
	}
	
	@Test
	public void permiteSubtrairDoisNumerosComplexos(){
		assertEquals(new NumeroComplexo(-3, 1), numero.subtrair(new NumeroComplexo(5, 2)));
		assertEquals(new NumeroComplexo(1, 2), numero.subtrair(new NumeroComplexo(1, 1)));
		assertEquals(new NumeroComplexo(0, -3), numero.subtrair(new NumeroComplexo(2, 6)));
	}
	
	@Test
	public void permiteMultiplicarDoisNumerosComplexos(){
		assertEquals(new NumeroComplexo(4, 19), numero.multiplicar(new NumeroComplexo(5, 2)));
	}
	
	@Test
	public void retornaUmaRepresentacaoNaFormaDeString(){
		assertEquals("2 + 3i", numero.retornarString());
	}

}
