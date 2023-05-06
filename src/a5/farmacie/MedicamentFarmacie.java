package a5.farmacie;

public class MedicamentFarmacie implements IMedicamentFarmacie {
	private String nume;
	
	public MedicamentFarmacie() {}
	
	public MedicamentFarmacie(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void cumparaMedicament() {
		System.out.println("Farmacie - Se cumpara medicamentul " + this.nume + " din farmacie");
	}
}
