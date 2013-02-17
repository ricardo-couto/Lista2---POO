
public class Conta {

	private String nome;
	private String numero;
	private double saldo;

	public Conta(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = 0;
	}

	public String nome() {
		return this.nome;
	}

	public String numero() {
		return this.numero;
	}
	
	public double saldo() {
		return this.saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		validarSaque(valor);
		this.saldo -= valor;		
	}
	
	private void validarSaque(double valor){
		if (valor > this.saldo)
			throw new RuntimeException("Saldo insuficiente para realizar saque!");
	}

}
