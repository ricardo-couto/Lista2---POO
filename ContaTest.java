import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	Conta conta = new Conta("Ricardo", "123-4");
	
	@Test
	public void permiteConsultarNomeNumeroESaldo() {
		assertEquals("Ricardo", conta.nome());
		assertEquals("123-4", conta.numero());
		assertEquals(0, conta.saldo(), 0);
	}
	
	@Test
	public void permiteRealizarDepositoESaque() {
		assertEquals(0, conta.saldo(), 0);
		conta.depositar(100);
		assertEquals(100, conta.saldo(), 0);
		conta.sacar(50);
		assertEquals(50, conta.saldo(), 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoPermiteSacarValorMaiorQueOSaldo() {
		assertEquals(0, conta.saldo(), 0);
		conta.depositar(100);
		assertEquals(100, conta.saldo(), 0);
		conta.sacar(150);
		assertEquals(100, conta.saldo(), 0);
	}

}
