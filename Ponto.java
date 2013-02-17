
public class Ponto {

	private double x;
	private double y;

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double x() {
		return this.x;
	}
	
	public double y() {
		return this.y;
	}
	
	public boolean equals(Object outro){
		Ponto outroPonto = (Ponto) outro;
		return this.x == outroPonto.x && this.y == outroPonto.y;
	}

}
