package a5.spital;

public class MedicamentSpital implements IMedicamentSpital {
	private String nume;
	
	public MedicamentSpital() {}
	
	public MedicamentSpital(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void prezintaReteta() {
		System.out.println("Spital - Se prezinta reteta pentru medicamentul " + this.nume);
	}

	@Override
	public void achizitioneazaMedicament() {
		this.prezintaReteta();
		System.out.println("Spital - Se achizitioneaza medicamentul " + this.nume);
	}
}
