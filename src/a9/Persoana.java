package a9;

public class Persoana {
	private String nume;
	private boolean areAsigurare;

	public Persoana(String nume, boolean areAsigurare) {
		super();
		this.nume = nume;
		this.areAsigurare = areAsigurare;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean isAreAsigurare() {
		return areAsigurare;
	}

	public void setAreAsigurare(boolean areAsigurare) {
		this.areAsigurare = areAsigurare;
	}
}
