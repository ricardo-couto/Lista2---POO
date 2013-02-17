import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	Pessoa pessoa = new Pessoa(80, 22, 1.82);
	Pessoa pessoa2 = new Pessoa(68, 19, 1.70);
	
	@Test
	public void permiteObterPesoIdadeEAltura() {
		assertEquals(80, pessoa.peso(), 0);
		assertEquals(22, pessoa.idade());
		assertEquals(1.82, pessoa.altura(), 0);
	}
	
	@Test
	public void permiteEngordarEEmagracer() {
		assertEquals(80, pessoa.peso(), 0);
		pessoa.engordar(5);
		assertEquals(85, pessoa.peso(), 0);
		pessoa.engordar(3);
		assertEquals(88, pessoa.peso(), 0);
		pessoa.emagrecer(10);
		assertEquals(78, pessoa.peso(), 0);
		pessoa.emagrecer(1);
		assertEquals(77, pessoa.peso(), 0);
	}
	
	@Test
	public void permiteEnvelhecer() {
		assertEquals(19, pessoa2.idade());
		assertEquals(1.70, pessoa2.altura(), 0);
		pessoa2.envelhecer();
		assertEquals(20, pessoa2.idade());
		assertEquals(1.715, pessoa2.altura(), 0.1);
		pessoa2.envelhecer();
		assertEquals(21, pessoa2.idade());
		assertEquals(1.73, pessoa2.altura(), 0.1);
		pessoa2.envelhecer();
		assertEquals(22, pessoa2.idade());
		assertEquals(1.73, pessoa2.altura(), 0.1);
		pessoa2.envelhecer();
		assertEquals(23, pessoa2.idade());
		assertEquals(1.73, pessoa2.altura(), 0.1);
	}

}
