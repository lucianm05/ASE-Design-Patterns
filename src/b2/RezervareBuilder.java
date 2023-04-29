package b2;

public class RezervareBuilder implements Builder {
	Rezervare rezervare;
	
	public RezervareBuilder() {
		this.rezervare = new Rezervare();
	}
	
	public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
		this.rezervare.setAsezareGeam(asezareGeam);
		return this;
	}
	
	public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
		this.rezervare.setScauneErgonomice(scauneErgonomice);
		return this;
	}
	
	public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
		this.rezervare.setDecorareaMesei(decorareaMesei);
		return this;
	}
	
	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}

	@Override
	public Rezervare build() {
		return this.rezervare;
	}
}
