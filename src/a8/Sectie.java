package a8;

public class Sectie implements IDepartament {
	private String nume;
	
	public Sectie(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public void removeNode(IDepartament departament) {
		throw new Error("Nu este implementat");
	}

	@Override
	public void addNode(IDepartament departament) {
		throw new Error("Nu este implementat");
	}

	@Override
	public IDepartament getNod(int index) {
		throw new Error("Nu este implementat");
	}

	@Override
	public void descriere() {
		System.out.println("Acesta este sectia " + this.nume);
	}
}
