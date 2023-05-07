package a9;

public class ProxyInternare implements IInternare {
	private Internare internare;

	public ProxyInternare(Internare internare) {
		super();
		this.internare = internare;
	}
	
	public ProxyInternare(Persoana persoana) {
		this.internare = new Internare(persoana);
	}

	@Override
	public void interneaza() {
		Persoana persoana = this.internare.getPersoana();
		
		if(persoana.isAreAsigurare()) {
			this.internare.interneaza();
			return;
		}
		
		System.out.println("Internarea nu a fost realizata deoarece persoana " + 
				persoana.getNume() + 
				" nu are asigurare");
	}
	
	
}
