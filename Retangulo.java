
public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		validarAltura(altura);
		validarLargura(largura);
		this.altura = altura;
		this.largura = largura;
	}

	public double altura() {
		return this.altura;
	}
	
	public double largura() {
		return this.largura;
	}

	public void modificarAltura(double novaAltura) {
		validarAltura(novaAltura);
		this.altura = novaAltura;		
	}
	
	public void modificarLargura(double novaLargura) {
		validarLargura(novaLargura);
		this.largura = novaLargura;		
	}

	public double area() {
		return this.altura * this.largura;
	}

	public double perimetro() {
		return 2*this.altura + 2*this.largura;
	}
	
	private void validarAltura(double altura){
		if (altura <= 0)
			throw new RuntimeException("Altura invalida!");
	}
	
	private void validarLargura(double largura){
		if (largura <= 0)
			throw new RuntimeException("Largura invalida!");
	}

}
