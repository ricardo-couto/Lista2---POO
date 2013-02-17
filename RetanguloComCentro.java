
public class RetanguloComCentro {

	private double altura;
	private double largura;
	private Ponto centro;

	public RetanguloComCentro(double altura, double largura, Ponto centro) {
		this.altura = altura;
		this.largura = largura;
		this.centro = centro;
	}
	
	public Ponto centro(){
		return this.centro;
	}

	public void alterarCentro(Ponto novoCentro) {
		this.centro = novoCentro;		
	}

	public Ponto[] vertices() {
		double xDeslocamento = this.largura/2;
		double yDeslocamento = this.altura/2;
		return new Ponto[] {
				new Ponto(centro.x() - xDeslocamento, centro.y() + yDeslocamento),
				new Ponto(centro.x() + xDeslocamento, centro.y() + yDeslocamento),
				new Ponto(centro.x() + xDeslocamento, centro.y() - yDeslocamento),
				new Ponto(centro.x() - xDeslocamento, centro.y() - yDeslocamento),
		};
	}

}
