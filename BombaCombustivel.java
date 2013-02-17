
public class BombaCombustivel {

	private int capacidade;
	private double precoPorLitro;
	private boolean cheia;
	private double quantidadeCombutivelPresente;

	public BombaCombustivel(int capacidade, double precoPorLitro) {
		validarCapacidade(capacidade);
		validarPreco(precoPorLitro);
		this.capacidade = capacidade;
		this.precoPorLitro = precoPorLitro;
		this.cheia = false;
		this.quantidadeCombutivelPresente = 0;
	}
	
	public void encher(){
		this.quantidadeCombutivelPresente = this.capacidade;
		this.cheia = true;
	}
	
	public boolean cheia(){
		return this.cheia;
	}

	public double quantidadeCombustivelPresente() {
		return this.quantidadeCombutivelPresente;
	}
	
	public int capacidade(){
		return this.capacidade;
	}
	
	public double precoPorLitro(){
		return this.precoPorLitro;
	}

	public double abastecerPorValor(double valor) {
		validarAbastecimentoPorValor(valor);
		double litrosAbastecidos = valor/this.precoPorLitro;
		this.quantidadeCombutivelPresente -= litrosAbastecidos;
		return litrosAbastecidos;
	}

	public double abastecerPorQuantidadeEmLitros(double quantidade) {
		validarAbastecimentoPorQuantidade(quantidade);
		this.quantidadeCombutivelPresente -= quantidade;
		return quantidade*this.precoPorLitro;
	}

	public void alterarPreco(double novoPreco) {
		validarPreco(novoPreco);
		this.precoPorLitro = novoPreco;		
	}
	
	private void validarAbastecimentoPorQuantidade(double quantidade){
		if (quantidade > this.quantidadeCombutivelPresente)
			throw new RuntimeException("Bomba nao tem combustivel suficiente para o abastecimento!");
	}
	
	private void validarAbastecimentoPorValor(double valor){
		if (valor > this.quantidadeCombutivelPresente*this.precoPorLitro)
			throw new RuntimeException("Bomba nao tem combustivel suficiente para o abastecimento!");
	}
	
	private void validarCapacidade(int capacidade){
		if (capacidade <= 0)
			throw new RuntimeException("Capacidade Invalida!");
	}
	
	private void validarPreco(double preco){
		if (preco <= 0)
			throw new RuntimeException("Preco Invalido!");
	}

}
