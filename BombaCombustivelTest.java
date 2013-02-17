import static org.junit.Assert.*;

import org.junit.Test;


public class BombaCombustivelTest {

	BombaCombustivel bomba = new BombaCombustivel(500, 3.00);
	
	@Test
	public void permiteEncherCompletamenteABomba() {
		assertEquals(0, bomba.quantidadeCombustivelPresente(), 0);
		assertFalse(bomba.cheia());
		bomba.encher();
		assertEquals(500, bomba.quantidadeCombustivelPresente(), 0);
		assertTrue(bomba.cheia());
	}
	
	@Test
	public void permiteAbastecerPorValor(){
		bomba.encher();
		assertEquals(50, bomba.abastecerPorValor(150.00), 0);
		assertEquals(30, bomba.abastecerPorValor(90.00), 0);
	}
	
	@Test
	public void permiteAbastecerPorQuantidadeEmLitros(){
		bomba.encher();
		assertEquals(30.00, bomba.abastecerPorQuantidadeEmLitros(10), 0);
		assertEquals(180.00, bomba.abastecerPorQuantidadeEmLitros(60), 0);
	}
	
	@Test
	public void permiteAlterarOPrecoPorLitros(){
		bomba.alterarPreco(2.50);
		assertEquals(2.50, bomba.precoPorLitro(), 0);
		bomba.alterarPreco(2.80);
		assertEquals(2.80, bomba.precoPorLitro(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoPermiteAbastecerPorQuantidadeSeNaoExistirCombustivelSuficiente(){
		bomba.encher();
		bomba.abastecerPorQuantidadeEmLitros(200);
		assertEquals(300, bomba.quantidadeCombustivelPresente(), 0);
		bomba.abastecerPorQuantidadeEmLitros(200);
		assertEquals(100, bomba.quantidadeCombustivelPresente(), 0);
		bomba.abastecerPorQuantidadeEmLitros(101);
		assertEquals(100, bomba.quantidadeCombustivelPresente(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoPermiteAbastecerPorValorSeNaoExistirCombustivelSuficiente(){
		bomba.encher();
		bomba.abastecerPorValor(600.00);
		assertEquals(300, bomba.quantidadeCombustivelPresente(), 0);
		bomba.abastecerPorValor(300.00);
		assertEquals(200, bomba.quantidadeCombustivelPresente(), 0);
		bomba.abastecerPorValor(601.00);		
		assertEquals(200, bomba.quantidadeCombustivelPresente(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoAceitaCapacidadeEPreçoPorLitroZeroOuNegativo(){
		new BombaCombustivel(0, 3);
		new BombaCombustivel(-1, 3);
		new BombaCombustivel(100, 0);
		new BombaCombustivel(100, -3);
		new BombaCombustivel(0, 0);
		new BombaCombustivel(-1, -3);
		bomba.alterarPreco(0);
		assertEquals(3.00, bomba.precoPorLitro(), 0);
		bomba.alterarPreco(-3);
		assertEquals(3.00, bomba.precoPorLitro(), 0);
	}

}
