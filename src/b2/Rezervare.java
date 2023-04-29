package b2;

public class Rezervare {
	private boolean asezareGeam;
	private boolean scauneErgonomice;
	private boolean decorareaMesei;
	private boolean muzicaAmbientala;
	private String genMuzica;
	
	public Rezervare() {
		super();
		this.asezareGeam = false;
		this.scauneErgonomice = false;
		this.decorareaMesei = false;
		this.muzicaAmbientala = false;
		this.genMuzica = null;
	}
	public Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientala,
			String genMuzica) {
		super();
		this.asezareGeam = asezareGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareaMesei = decorareaMesei;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}
	public boolean isAsezareGeam() {
		return asezareGeam;
	}
	public void setAsezareGeam(boolean asezareGeam) {
		this.asezareGeam = asezareGeam;
	}
	public boolean isScauneErgonomice() {
		return scauneErgonomice;
	}
	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}
	public boolean isDecorareaMesei() {
		return decorareaMesei;
	}
	public void setDecorareaMesei(boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	public void descriere() {
		System.out.println("Rezervare: " + 
				"asezare geam: " + asezareGeam + ", " +
				"scaune ergonomice: " + scauneErgonomice + ", " +
				"decorarea mesei: " + decorareaMesei + ", " +
				"muzica ambientala: " + muzicaAmbientala + ", " + 
				"gen muzica: " + genMuzica);
	}
	
}
