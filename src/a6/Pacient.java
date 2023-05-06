package a6;

public class Pacient {
	private String nume;
	private double gravitate;
	private boolean internat;
	
	public Pacient(String nume, double gravitate) {
		this.nume = nume;
		this.gravitate = gravitate;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public double getGravitate() {
		return gravitate;
	}
	
	public void setGravitate(double gravitate) {
		this.gravitate = gravitate;
	}

	public boolean isInternat() {
		return internat;
	}

	public void setInternat(boolean internat) {
		this.internat = internat;
	}
}
