package b9;

public class ProxyRezervare implements IRezervare {
	private Rezervare rezervare;

	public ProxyRezervare(Rezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}

	@Override
	public void save() {
		if(this.rezervare.getnPers() < 4) {
			System.out.println("Rezervarea nu a fost salvata. Va rugam sa va prezentati la restaurant");
			return;
		}
		
		this.rezervare.save();
	}
	
	
}
