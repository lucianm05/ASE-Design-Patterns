package a9;

public class Internare implements IInternare {
	private Persoana persoana;
	
	public Internare(Persoana persoana) {
		super();
		this.persoana = persoana;
	}

	public Persoana getPersoana() {
		return persoana;
	}

	public void setPersoana(Persoana persoana) {
		this.persoana = persoana;
	}

	@Override
	public void interneaza() {
		System.out.println("Persoana " + this.persoana.getNume() + " a fost internata");
	}
}
