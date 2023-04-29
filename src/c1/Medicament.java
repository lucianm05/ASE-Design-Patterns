package c1;

public abstract class Medicament {
	protected int pret;
	protected String denumire;
	
	public Medicament(int pret, String denumire) {
		super();
		this.pret = pret;
		this.denumire = denumire;
	}

	void descriere() {
		System.out.println(denumire + ", " + pret + " lei");
	}
}
