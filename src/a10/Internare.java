package a10;

public class Internare implements IInternare {
	private Pacient pacient;
	private int numarSalon;
	private int numarPat;
	private int numarZile;
	
	public Internare(Pacient pacient, int numarSalon, int numarPat, int numarZile) {
		super();
		this.pacient = pacient;
		this.numarSalon = numarSalon;
		this.numarPat = numarPat;
		this.numarZile = numarZile;
	}

	@Override
	public void descriere() {
		System.out.println("Internarea pentru persoana " + pacient.getNume() + 
				": numarSalon - " + this.numarSalon + 
				", numarPat - " + this.numarPat + 
				", numarZile - " + this.numarZile);
	}
}
