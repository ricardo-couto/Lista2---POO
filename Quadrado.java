
public class Quadrado {

	private double lado;
	
	public Quadrado(double lado) {
		validarLado(lado);
		this.lado = lado;
	}

	public double lado() {
		return this.lado;
	}

	public void modificarLado(double novoLado) {
		validarLado(novoLado);
		this.lado = novoLado;
	}

	public double area() {
		return Math.pow(this.lado, 2);
	}
	
	private void validarLado(double lado){
		if (lado <= 0)
			throw new RuntimeException("Valor invalido para os lados!");
	}

}
