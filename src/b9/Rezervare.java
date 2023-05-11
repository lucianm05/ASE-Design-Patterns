package b9;

public class Rezervare implements IRezervare {
	private int nPers;
	
	public Rezervare(int nPers) {
		this.nPers = nPers;
	}

	public int getnPers() {
		return nPers;
	}

	public void setnPers(int nPers) {
		this.nPers = nPers;
	}

	@Override
	public void save() {
		System.out.println("Rezervarea a fost salvata");
	}
	
	
}
