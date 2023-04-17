package a1;

public class PacientBuilder implements Builder {
	private Pacient pacient;
	
	public PacientBuilder() {
		this.pacient = new Pacient(false, false, false, false);
	}
	
	public PacientBuilder setPatRabatabil(boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}
	
	public PacientBuilder setMicDejun(boolean micDejun) {
		this.pacient.setMicDejun(micDejun);
		return this;
	}
	
	public PacientBuilder setPapuci(boolean papuci) {
		this.pacient.setPapuci(papuci);
		return this;
	}
	
	public PacientBuilder setHalat(boolean halat) {
		this.pacient.setHalat(halat);
		return this;
	}
	
	public Pacient build() {
		return this.pacient;
	}
}
