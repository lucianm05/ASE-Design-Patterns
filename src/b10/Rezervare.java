package b10;

public class Rezervare {
	private int table;
	private int nPers;
	private int hour;
	
	public Rezervare(int table, int nPers, int hour) {
		super();
		this.table = table;
		this.nPers = nPers;
		this.hour = hour;
	}
	
	@Override
	public String toString() {
		return "Rezervare - Masa: " + this.table + 
				", Numar persoane: " + this.nPers + 
				", Ora: " + this.hour;
	}
}
