
public class Pessoa {

	private double peso;
	private int idade;
	private double altura;

	public Pessoa(double peso, int idade, double altura) {
		this.peso = peso;
		this.idade = idade;
		this.altura = altura;
	}

	public double peso() {
		return this.peso;
	}

	public int idade() {
		return this.idade;
	}

	public double altura() {
		return this.altura;
	}

	public void engordar(double pesoEngordado) {
		this.peso += pesoEngordado;		
	}

	public void emagrecer(double pesoEmagrecido) {
		this.peso -= pesoEmagrecido;		
	}

	public void envelhecer() {
		this.idade += 1;
		crescer();
	}
	
	private void crescer(){
		if (this.idade <= 21)
			this.altura += 0.015;
	}
}
