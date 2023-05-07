package a10;

// Concrete Flyweight
public class Pacient {
	private String nume;
	private String numarTelefon;
	private String adresa;
	
	public Pacient(String nume, String numarTelefon, String adresa) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.adresa = adresa;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getNumarTelefon() {
		return numarTelefon;
	}
	
	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	

}
