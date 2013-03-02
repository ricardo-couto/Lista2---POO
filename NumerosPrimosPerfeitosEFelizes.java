import java.util.List;
import java.util.ArrayList;


public class NumerosPrimosPerfeitosEFelizes {

	private double numero;

	public NumerosPrimosPerfeitosEFelizes(double numero) {
		this.numero = numero;
	}

	public boolean EhPrimo() {
		int contador = 0;
		if ((this.numero == 1) || (this.numero == 2))
				return true;
		if ((this.numero % 2) == 0)
			return false;
		else
			for(int i = 1; i<=this.numero; i++)
				if ((this.numero % i) == 0)
					contador++;
			if (contador == 2)
				return true;
			return false;
	}

	public boolean EhPerfeito() {
		double soma = 0.0;
		for(int i=1; i<this.numero; i++)
			if ((this.numero % i) == 0)
				soma += i;
		if (soma == this.numero)
			return true;
		return false;
	}

	public boolean EhFeliz() {
		int valor = (int) Math.pow(this.numero, 2);
		List<Integer> anteriores = new ArrayList<Integer>();
		while (valor != 1) {
			int valor_velho = valor;
			valor = 0;
			String strValor = String.valueOf(valor_velho);
			int[] partes = new int[strValor.length()];
			for (int i=0; i<strValor.length(); i++)
				partes[i] = Integer.parseInt(String.valueOf(strValor.charAt(i)));
			for (int n : partes)
				valor += Math.pow(n, 2);
			System.out.println(valor);
			if (anteriores.contains(valor))
				return false;
			anteriores.add(valor);
		}
		return true;
	}
}
