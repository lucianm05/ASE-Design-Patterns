package a1;

public class Pacient {
	private boolean patRabatabil;
	private boolean micDejun;
	private boolean papuci;
	private boolean halat;
	
	public Pacient(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
		super();
		this.patRabatabil = patRabatabil;
		this.micDejun = micDejun;
		this.papuci = papuci;
		this.halat = halat;
	}

	public boolean isPatRabatabil() {
		return patRabatabil;
	}

	public void setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	public boolean isMicDejun() {
		return micDejun;
	}

	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
	}

	public boolean isPapuci() {
		return papuci;
	}

	public void setPapuci(boolean papuci) {
		this.papuci = papuci;
	}

	public boolean isHalat() {
		return halat;
	}

	public void setHalat(boolean halat) {
		this.halat = halat;
	}
	
	@Override
	public String toString() {
		return new String("Pacient patRabatabil=" + patRabatabil + 
				", micDejun=" + micDejun + 
				", papuci=" + papuci +
				", halat=" + halat);
	}
}
