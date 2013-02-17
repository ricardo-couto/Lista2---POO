
public class NumeroComplexo {

	private double real;
	private double imaginaria;

	public NumeroComplexo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public double real() {
		return this.real;
	}
	
	public double imaginaria() {
		return this.imaginaria;
	}

	public NumeroComplexo somar(NumeroComplexo outroNumero) {
		return new NumeroComplexo(this.real + outroNumero.real(), 
								  this.imaginaria + outroNumero.imaginaria());
	}
	
	public boolean equals(Object outro){
		NumeroComplexo outroNumero = (NumeroComplexo) outro;
		return this.real == outroNumero.real() && this.imaginaria == outroNumero.imaginaria; 
	}

	public NumeroComplexo subtrair(NumeroComplexo outroNumero) {
		return new NumeroComplexo(this.real - outroNumero.real(), 
				  this.imaginaria - outroNumero.imaginaria());
	}

	public NumeroComplexo multiplicar(NumeroComplexo outroNumero) {
		return new NumeroComplexo((this.real * outroNumero.real()) - (this.imaginaria * outroNumero.imaginaria()), 
				  (this.imaginaria * outroNumero.real()) + (this.real * outroNumero.imaginaria()));
	}

	public String retornarString() {
		return String.format("%.0f + %.0fi", this.real, this.imaginaria);
	}
}
