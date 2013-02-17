
public class TV {
	
	private int canal;
	private int volume;
	private boolean ligada;
	public static final int PRIMEIRO_CANAL = 1;
	public static final int ULTIMO_CANAL = 60;
	public static final int LIMITE_INFERIOR_VOLUME = 0;
	public static final int LIMITE_SUPERIOR_VOLUME = 30;

	public TV(){
		this.canal = 1;
		this.volume = 0;
		this.ligada = false;
	}

	public int canal() {
		return this.canal;
	}

	public int volume() {
		return this.volume;
	}
	
	public boolean ligada(){
		return this.ligada;
	}
	
	public void ligar(){
		this.ligada = true;
	}
	
	public void desligar(){
		this.ligada = false;
	}

	public void canalAcima() {
		if (this.canal < ULTIMO_CANAL)
			this.canal += 1;		
	}
	
	public void canalAbaixo() {
		if (this.canal > PRIMEIRO_CANAL)
			this.canal -= 1;		
	}

	public void aumentarVolume() {
		if (this.volume < LIMITE_SUPERIOR_VOLUME)
			this.volume += 1;		
	}
	
	public void diminuirVolume() {
		if (this.volume > LIMITE_INFERIOR_VOLUME)
			this.volume -= 1;		
	}
}
